public class ExemploBreakContinue {
    public static void main(String[] args) {
        for(int numero = 1; numero <=5; numero++){
            if(numero ==3)
                break;
        System.out.println(numero); //Imprime 1 e 2
    }
    for(int numero = 1; numero <=5; numero++){
        if(numero ==3)
            continue;
    System.out.println(numero); //imprime 1, 2, 4 e 5
}
}
}
