package pokemon;

public class PokemonAgua extends Pokemon {
public PokemonAgua(String nombre, int nivel) {
super(nombre,Tipo.AGUA, nivel);
    ListaMovimientos listaMovimientos =new ListaMovimientos();

    setMovimientos(0, listaMovimientos.buscarMovimientoPorNombre("arañaso"));
    setMovimientos(1, listaMovimientos.buscarMovimientoPorNombre("Pistola Agua"));
    setMovimientos(2, listaMovimientos.buscarMovimientoPorNombre("Acua cola"));
    setMovimientos(3, listaMovimientos.buscarMovimientoPorNombre("Amnesia"));


}
@Override

public double obtenerEfectividad(Pokemon pokemon){
double efectividad= 1.0;
if (pokemon.getTipo()== Tipo.NORMAL) efectividad=0.0;
if (pokemon.getTipo()== Tipo.AGUA) efectividad=0.5;
if (pokemon.getTipo()== Tipo.PSIQUICO) efectividad=2.0;
return efectividad;
}


}