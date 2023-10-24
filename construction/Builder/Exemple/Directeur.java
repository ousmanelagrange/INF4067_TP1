package Builder.Exemple;

public class Directeur {
    private MonteurPizza monteur;

    public Directeur(MonteurPizza monteur) {
        this.monteur = monteur;
    }

    public Pizza construire() {
        monteur.creerNouvellePizza();
        monteur.monterPate();
        monteur.monterSauce();
        monteur.monterGarniture();
        return monteur.pizza;
    }
}
