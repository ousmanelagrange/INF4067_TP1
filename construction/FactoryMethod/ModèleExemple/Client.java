public class Client {

    public static void main(String [] args) {
        ProduitFactory produitFactory = new ProduitFactory();
        System.out.println("\nExécution de l'exemple du cours ....\n");
        ProduitA produitA = null;
        produitA = produitFactory.getProduitA(produitFactory.TYPE_PRODUIT_A1);
        produitA.methodA();

        produitA = produitFactory.getProduitA(produitFactory.TYPE_PRODUIT_A2);
        produitA.methodA();

        produitA = produitFactory.getProduitA(3);
        produitA.methodA();
        
    }
}