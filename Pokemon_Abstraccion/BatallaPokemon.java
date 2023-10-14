 import pokemon.PokemonAgua;
 import pokemon.PokemonHada;

public class BatallaPokemon {

    public static void main (String args []){
        PokemonHada Jigglypuff = new PokemonHada("Jigglypuff", 10);
        PokemonAgua Psyduck = new PokemonAgua("Psyduck", 10);
           
        Jigglypuff.atacar(2, Psyduck);
        System.out.println("\n");
        Psyduck.atacar(3, Jigglypuff);
    }
    






}
