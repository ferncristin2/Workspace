import java.util.ArrayList;
import java.util.List;

public class ListaPokemonsArray {

    public static void main(String[] args) {
        //Cria lista/vetor de elementos desejados e adiciona os elementos
        List<String> pokemon = new ArrayList<String>();
        pokemon.add("Pikachu");
        pokemon.add("Charmander");
        pokemon.add("Bubasaurur");

        //Remove o elemento que está na posição 1
        pokemon.remove(1);
        //Remove o elemento que está na última posição
        //pokemon.remove(pokemon.size()-1);

        for (String p : pokemon) {
            System.out.println(p);
            //Imprime os elementos que permaneceram na lista

        }
    }


}