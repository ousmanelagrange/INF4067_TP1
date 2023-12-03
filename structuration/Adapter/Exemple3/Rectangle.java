
/**
 * Rectangle
 */
public class Rectangle {
    private float longueur;
    private float largeur;

    public Rectangle(){
        
    }

    public float perimetre() {
        return (longueur+largeur)*2;
    }

    public float aire() {
        return longueur*largeur;
    }
    public void setLargeur(float largeur) {
        this.largeur = largeur;
    }
//Définision des setters et getteurs.
    public void setLongueur(float longueur) {
        this.longueur = longueur;
    }

    public float getLargeur() {
        return largeur;
    }

    public float getLongueur() {
        return longueur;
    }
    
}