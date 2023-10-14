package pokemon;

public class PokemonHada extends Pokemon {
public PokemonHada(String nombre, int nivel) {
super(nombre, Tipo.HADA, nivel);
ListaMovimientos listaMovimientos =new ListaMovimientos();

    setMovimientos(0, listaMovimientos.buscarMovimientoPorNombre("Voz cautivadora"));
    setMovimientos(1, listaMovimientos.buscarMovimientoPorNombre("Doble filo"));
    setMovimientos(2, listaMovimientos.buscarMovimientoPorNombre("Giro bola"));
    setMovimientos(3, listaMovimientos.buscarMovimientoPorNombre("Destructor"));


}
@Override

public double obtenerEfectividad(Pokemon pokemon){
double efectividad= 1.0;
if (pokemon.getTipo()== Tipo.NORMAL) efectividad=0.0;
if (pokemon.getTipo()== Tipo.ACERO) efectividad=2.0;
if (pokemon.getTipo()== Tipo.HADA) efectividad=0.5;
return efectividad;
}





}
