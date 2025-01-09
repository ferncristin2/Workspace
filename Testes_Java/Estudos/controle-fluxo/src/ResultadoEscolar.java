public class ResultadoEscolar {
    public static void main(String[] args) {
        
        int nota = 7;

        if(nota >= 7)

        System.out.println("Aprovado");

        else if (nota >= 5 && nota <7)
        System.out.println("Prova de Recuperação");

        else
        System.out.println("Reprovado");

        // Para usar a Condição ternária, deveria usar o código abaixo
        // int nota = X;
        // String resultado = nota >= 7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
        // System.out.println(resultado);
        // Este código imprimiria o valor dentro da variável "resultado"
    }
}
