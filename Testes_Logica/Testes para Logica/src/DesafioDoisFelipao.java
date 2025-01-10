public class DesafioDoisFelipao {
    public static void main(String[] args) {
        int victories = 55; //Cria a variável para quantidade de vitórias
        int defeats = 5; // Cria a variável para a quantiade de derrotas
        
        //Cria a função resultado final, que é o resultado de vitórias menos derrotas
        String finalResult = rankedBalance(victories, defeats);
        System.out.println(finalResult); 
    } 
    //Cria o laço de verificação vitórias menos derrotas e atribui o nível
    public static String rankedBalance(int victories, int defeats) { 
        int winningsBalance = victories - defeats;
        
        String level; 
        
        if (victories < 10) {
            level = "Ferro"; 
        } 
        else if (victories <= 20) { 
            level = "Bronze"; 
        } 
        else if (victories <= 50) { 
            level = "Prata"; 
        } 
        else if (victories <= 80) { 
            level = "Ouro"; 
        } 
        else if (victories <= 90) { 
            level = "Diamante";
        } 
        else if (victories <= 100) {
            level = "Lendário"; 
        } 
        else {
            level = "Imortal"; 
        } 
        //Retorna o que está dentro de 
        return "Nosso jogador tem um saldo de " + winningsBalance + ", Ele está no nível " + level; 
    } 
}