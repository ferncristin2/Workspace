public class DesafioFelipao {

    public static void main(String[] args) {

        int xpHeroi=10800;
        String nomeHeroi = "Aruathnar";
        String nivel;
        
        if (xpHeroi < 1000) { nivel = "Ferro";
        } 
        else if (xpHeroi <= 2000) { nivel = "Bronze"; 
        } 
        else if (xpHeroi <= 5000) { nivel = "Prata"; 
        } 
        else if (xpHeroi <= 7000) { nivel = "Ouro";    
        } 
        else if (xpHeroi <= 8000) { nivel = "Platina"; 
        } 
        else if (xpHeroi <= 9000) { nivel = "Ascendente"; 
        } 
        else if (xpHeroi <= 10000) { nivel = "Imortal"; 
        } 
        else { nivel = "Radiante"; 
        } 
        System.out.println("Nosso Herói " + nomeHeroi + " está no nível " + nivel);
    }
}