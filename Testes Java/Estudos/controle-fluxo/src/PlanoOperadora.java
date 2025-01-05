public class PlanoOperadora {

    public static void main(String[] args) {
        
        String plano = "T";
        
        switch (plano) {
            case "T":{
                System.out.println("5Gb Youtube");
            }
            case "M":{
            System.out.println("Whats e Instragram grátis");
            }
            case "B":{
            System.out.println("100 minutos de ligações");
            }    
        }    
    }
}

/* EXEMPLO DE COMO PODRIA SER FEITO
        if(plano == "B"){
            System.out.println("100 minutos de ligação");
        }else if(plano == "M");{
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagram Grátis");
        }else if(plano == "M");{  ---   ESSE ÚLTIMO ELSE IF APRESENTOU ERRO
            System.out.println("100 minutos de ligação");
            System.out.println("Whats e Instagram Grátis");
            System.out.println("5Gb YouTube");
        }*/