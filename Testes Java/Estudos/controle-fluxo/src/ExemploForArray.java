public class ExemploForArray {
    
    //Em Array, o índice de elementos inicia em ZERO
    public static void main(String[] args) {
        
        String alunos [] = { "Felipe", "Jonas", "Julia", "Marcos" };

        for (int x=0; x<alunos.length; x++)

        System.out.println("O aluno do índice X=" + x + " é " + alunos[x]);

        /*For (String aluno : alunos){

            System.out.println(" O nome do aluno é: " + aluno);
        }
*/
    }
}
