public class ProduitFactory {

    public static final int TYPE_PRODUIT_A1 = 1;
    public static final int TYPE_PRODUIT_A2 = 2;

    public ProduitA getProduitA(int typeProduit) {
        ProduitA produitA = null;

        switch(typeProduit) {
            case  TYPE_PRODUIT_A1:
                produitA = new ProduitA1();
                break;
            case TYPE_PRODUIT_A2: 
                produitA = new ProduitA2();
                break;
            default : 
              throw new IllegalArgumentException("Type de produit inconnu !");
        }
        return produitA;
    }

}