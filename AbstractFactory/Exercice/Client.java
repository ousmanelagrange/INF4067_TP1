public class Client {
    public static void main(String [] args) {
        IProduitFactory produitFactory1 = new ProduitFactory1();
        IProduitFactory produitFactory2 = new ProduitFactory2();

        ProduitA produitA = null;
        ProduitB produitB = null;
        ProduitC produitC = null;
        System.out.println("Implémentation de la méthode Abstract Factory avec un troisième produit ! \n");
        System.out.println("Utilisation de la première fabrique.");
        produitA = produitFactory1.getProduitA();
        produitB = produitFactory1.getProduitB();
        produitA.methodA();
        produitB.methodB();
        produitC = produitFactory1.getProduitC();
        produitC.methodC();

        System.out.println("Utilisation de la deuxième fabrique.");
        produitA = produitFactory2.getProduitA();
        produitB = produitFactory2.getProduitB();
        produitA.methodA();
        produitB.methodB();

        produitC = produitFactory2.getProduitC();
        produitC.methodC();
    }
}