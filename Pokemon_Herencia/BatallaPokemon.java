public class BatallaPokemon {

    public static void main (String args []){
        PokemonHada Jigglypuff = new PokemonHada("Jigglypuff", 10);
        PokemonAgua Psyduck = new PokemonAgua("Psyduck", 10);
           
        Jigglypuff.atacar("Mirada hipnotica", Psyduck);
        Psyduck.atacar("ArañazoScrat", Psyduck);
    }
    






}
