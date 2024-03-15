package org.example;

public class Utilitaire {
    private String chaine;
    public void setChaine(String chaine){
        this.chaine = chaine;
    }
    public int nbOccurrence(char c){
        int nb=0;
        for(char cc:chaine.toCharArray())
            if(Character.toUpperCase(cc)==Character.toUpperCase(c))
                nb++;
        return nb;
    }
    public boolean estPalindrome(){

        return new StringBuilder(chaine).reverse().toString().equalsIgnoreCase(chaine);
    }
}
