import java.util.Scanner;
public class ItemMagico {
    String tipo; 
    int dano; 
    int resistencia;
    
    // Construtor que recebe todos os atributos referente ao item mágico 
    public ItemMagico(String tipoItem, int danoItem, int resistenciaItem) { 
        this.tipo = tipoItem; 
        this.dano = danoItem; 
        this.resistencia = resistenciaItem;
}
// Método para calcular o dano 
public int calcularDano() { 
    return this.tipo.equals("arma") ? this.dano * 2 : this.dano; 
}
// Método para calcular o dano public 
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário para digitar o tipo do item mágico, o dano no item e a resistência do item
        String tipoItem = scanner.nextLine();
        int danoItem = Integer.parseInt(scanner.nextLine());
        int resistenciaItem = Integer.parseInt(scanner.nextLine());


        // Cria um objeto ItemMagico personalizado com base no tipo escolhido
        ItemMagico itemPersonalizado = new ItemMagico(tipoItem, danoItem, resistenciaItem);
        

        // Imprime os atributos do item personalizado
        System.out.println("Tipo: " + itemPersonalizado.tipo);
        System.out.println("Dano: " + itemPersonalizado.dano);
        System.out.println("Resistencia: " + itemPersonalizado.resistencia);
        
        // Calcula e imprime o dano causado pelo item personalizado em um combate simulado
        int danoTotal = itemPersonalizado.calcularDano();
        System.out.println("Dano em combate: " + danoTotal);

        scanner.close();
    }
}        