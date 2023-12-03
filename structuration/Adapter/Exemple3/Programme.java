
/**
 * Programme
 */
public class Programme {

    public static void main(String[] args) {
        // Déclaration de l'interface dont le programme sait utiliser
        ICarre carre = new AdapteRectangle();
        carre.setCote(5);
        carre.aire();
        carre.perimetre();
        carre.affiche();

    }
    
}