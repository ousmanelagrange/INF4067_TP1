package Singleton;

public final class Singleton {
   
    private static Singleton instance = null;
    // D'autres attributs, classiques et non static
    private int x;
    private int y;

//CONSTRUCTEUR DE L'OBJET
    private Singleton() {
        //la présence d'un constructeur privé supprime le constructeur public par défaut
        super();
    }

// UN AUTRE CONSTRUCTEUR

    private Singleton(int x, int y ) {
        this.x = x;
        this.y = y;
    
    }
    
// Méthode renvoyant une instance de la classe Singleton dans le cas du premier constructeur

    public static Singleton getInstance() {
        if(instance == null) {
            return  new Singleton();
        }
        return instance;
    }

    //D'autres méthodes classiques et non "static"

    public int somme(int x, int y) {
        return x+y;
    }

    public float moyenne(int x, int y) {
        return somme(x,y)/2;
    }

    public void afficher() {
        System.out.println("\nJe suis une instance mes valeurs sont : "+this.x +" et "+this.y);
    }

//Méthode renvoyant une instance de la classe Singleton dans le cas du second constructeur

    public static Singleton getInstance(int x, int y) {

        if(instance == null) {
            return new Singleton(x, y);
        }
        return instance;
    }

    // redéfinir la méthode clone pour empêcher son utilisation
    /**
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clon() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

}