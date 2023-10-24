package Builder.Exemple;

public class Client {
    public static void main(String [] args) {
        System.out.println("\nUtilisation du patron de construction Builder :  Exemple du cours ...\n");
        MonteurPizza monteurPizzaPiquante = new MonteurPizzaPiquante();
        Directeur directeur1 = new Directeur(monteurPizzaPiquante);
        Pizza pizzaPiquante = directeur1.construire();
        pizzaPiquante.print();

        //Création d'un pizza reine
        MonteurPizza monteurPizzaReine = new MonteurPizzaReine();
        Directeur directeur = new Directeur(monteurPizzaReine);

        Pizza pizzaReine = directeur.construire();
        pizzaReine.print();
    }
}
