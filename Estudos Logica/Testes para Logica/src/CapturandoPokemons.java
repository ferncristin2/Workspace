import java.util.Scanner;

public class CapturandoPokemons {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int escolhaDoTreinador = scanner.nextInt();
        String pokemonEscolhido; 
                
        if (escolhaDoTreinador == 1) { 
            pokemonEscolhido = "Bulbasaur"; 
        } else if (escolhaDoTreinador == 2) { 
            pokemonEscolhido = "Charmander"; 
        } else if (escolhaDoTreinador == 4) { 
            pokemonEscolhido = "Pikachu"; 
        } else { 
            pokemonEscolhido = "Mewtwo"; 
        }
        // Imprime o Pokémon escolhido: 
    
        if (pokemonEscolhido != null) { 
        System.out.println("Você escolheu o " + pokemonEscolhido + " como seu Pokémon inicial."); 
        }
    }
}