
/**
 * Client
 */
public class Client {

    public static void main(String[] args) {
        // creation d'une fenêtre simple
        Fenetre fenetre = new FenetreSimple();
        fenetre.decrire();
        fenetre.dessiner();
        Fenetre fenetre2 = new DecorateurFenetre(fenetre);
        fenetre2.decrire();
        fenetre2.dessiner();
        DecorateurCurseurHorizontal fenetre3 = new DecorateurCurseurHorizontal(fenetre);
        DecorateurCurseurVertical fenetre4 = new DecorateurCurseurVertical(fenetre2);
        fenetre3.dessiner();
        fenetre3.dessinerCurseurHorizontal();

        fenetre4.decrire();
        fenetre4.dessinerCurseurVertical();
    }
}