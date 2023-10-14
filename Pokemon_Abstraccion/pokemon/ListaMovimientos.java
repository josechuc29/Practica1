package pokemon;
import java.util.ArrayList;
public class ListaMovimientos {
 
private ArrayList<Movimiento> movimientos = new ArrayList<>();

public ListaMovimientos(){


movimientos.add(new Movimiento("Arañazo",40,Tipo.NORMAL,35));
movimientos.add(new Movimiento("Pistola agua",40,Tipo.AGUA,25));

movimientos.add(new Movimiento("Acua cola",90,Tipo.AGUA,10));
movimientos.add(new Movimiento("Amnesia",80,Tipo.PSIQUICO,20));

movimientos.add(new Movimiento("Voz cautivadora", 40, Tipo.HADA,  15));
movimientos.add(new Movimiento("Doble filo",120, Tipo.NORMAL, 15));


movimientos.add(new Movimiento("Giro bola",100,Tipo.ACERO,5));
movimientos.add(new Movimiento("Destructor",40, Tipo.NORMAL,35));


}
    public Movimiento buscarMovimientoPorNombre(String nombre){
        for (Movimiento movimiento : movimientos) {
            if(movimiento.getNombre().equals(nombre)) {
                return movimiento;


            }


        }

            return null;

    }


}
