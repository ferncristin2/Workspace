public class GeracaoBiomas {
    
    public static void main(String[] args) { 
        int quantidadeGolpes = 6; 
        String[] minerais = {"Carvao", "Ferro", "Diamante", "Pedra"}; 
        for (int i = 1; i <= quantidadeGolpes; i++) { 
            int minaIndex = (i - 1) % minerais.length; 
            System.out.println(i + ": " + minerais[minaIndex]); 
        } 
    } 
}