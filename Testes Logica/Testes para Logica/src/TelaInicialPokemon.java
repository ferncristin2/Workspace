import java.util.Scanner;

public class TelaInicialPokemon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        String nome = scanner.next();
    
        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();
    
        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Olá, me chamo " + nome + " " + sobrenome);
        System.out.println("Tenho " + idade + " " + "anos ");

    } 
}
