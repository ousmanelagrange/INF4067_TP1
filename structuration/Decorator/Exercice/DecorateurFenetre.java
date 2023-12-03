
/**
 * DecorateurFenetre
 */
public class DecorateurFenetre implements Fenetre {

    private Fenetre fenetre = null;

    public DecorateurFenetre(Fenetre fenetre) {
        this.fenetre = fenetre;
    }
    public void dessiner() {
        System.out.println("Dessin d'une fenetre simple : Décorée");
    }

    public void decrire() {
        System.out.println("Je suis une fenêtre simple : Décorée");
    }


}