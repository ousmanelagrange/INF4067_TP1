
/**
 * AdapteRectangle
 */
public class AdapteRectangle implements ICarre{
    private float cote;

    //Définition d'un objet rectangle en vue de l'utilisation de ses méthodes
    protected Rectangle rectangle = new Rectangle();
    
    //Implémentation des méthodes de l'interface ICarre par adaptation de celle de Rectangle
    public float perimetre(){
        rectangle.setLargeur(cote);
        rectangle.setLongueur(cote);
        return rectangle.perimetre();
    }

    public float aire(){
        return rectangle.aire();
    }

    //Définition des setters et getteurs

    public void setCote(float cote) {
        this.cote = cote;
    }

    public float getCote() {
        return cote;
    }

    //Affichage des informations du carré
    public void affiche(){
        System.out.println("Moi "+this+", suis un carré de :\ncoté : "+this.cote+".\nperimetre : "+this.perimetre()+"\nsurface : "+this.aire());
    }
}