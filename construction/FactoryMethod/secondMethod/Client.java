public class Client {

    public static void main(String [] args) {
        ProduitFactory produitFactory1 = new ProduitFactory1();            
        ProduitFactory produitFactory2 = new ProduitFactory2();
        ProduitFactory produitFactory3 = new ProduitFactory3();

        System.out.println("\nExécution de la deuxième méthode.\n");
        ProduitA produitA = null;
        System.out.println("Utilisation de la première fabrique ...");
        produitA = produitFactory1.getProduitA();
        produitA.methodA();

        System.out.println("Utilisation de la deuxième fabrique ...");
        produitA = produitFactory2.getProduitA();
        produitA.methodA();

        System.out.println("Utilisation de la troisieme fabrique ...");
        produitA = produitFactory3.getProduitA();
        produitA.methodA();

        
    }
}