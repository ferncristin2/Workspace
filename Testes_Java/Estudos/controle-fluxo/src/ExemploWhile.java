import java.util.concurrent.ThreadLocalRandom; //Classe importada
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0; //estabelecido o valor disponível para gastar

        while (mesada >0) {
            Double valorDoce = valorAleatorio(); //Estabelece um valor aleatório a ser descontado
            if(valorDoce > mesada) // Se o valor do doce é maior do que a mesada
                valorDoce = mesada; // retorna o valor restante da mesada

            System.out.println("Doce do valor: " + valorDoce + " adicionado no carrinho");
            mesada = mesada - valorDoce; //imprime o resultado da subtração entre mesada e valor gasto
            
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("João gastou toda sua mesada em doces");
    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 6);
    }
    
}
