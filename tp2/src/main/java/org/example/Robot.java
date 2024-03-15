package org.example;

public class Robot {
    private String nom;
    private int x, y;
    private String direction;
    public Robot(String nom) {
        this.nom = nom;
        this.x = this.y = 0;
        this.direction = "Nord";
    }
    public void avance(){
        switch(this.direction){
            case "Nord":this.y++;break;
            case "Est":this.x--;break;
            case "Sud":this.y--;break;
            case "Ouest":this.x++;break;
        }
    }
    public void droite(){
        switch(direction){
            case "Nord": direction="Ouest"; break;
            case "Est":direction="Nord"; break;
            case "Sud":direction="Est"; break;
            case "Ouest":direction="Sud"; break;
        }
    }
    // ajouter les getters & setters

    public String getNom() {
        return nom;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public String getDirection() {
        return direction;
    }
    public String getPosition() {
        return
                "("+this.getX()+","+this.getY()+")"+this.direction;
    }
}