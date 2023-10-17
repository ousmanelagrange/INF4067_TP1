package Singleton.Exercice;

public final class Arithmetique {
    //Instance unique qui est l'Objet dont l'instanciation est restreinte
    private static Arithmetique instance = null;

    //D'autres attributs classiques non "statiques"
    private int x;
    private int y;
    private String nom;


    //Constructeur avec paramètre nom par défaut

    private Arithmetique(int x, int y) {
        this.x = x;
        this.y = y;
        this.nom ="maths";
    }

    private Arithmetique(int x, int y, String nom) {
        this.x = x;
        this.y = y;
        this.nom =nom;
    }

    public static Arithmetique getInstance(int x, int y) {

        if(instance == null) {
            return new Arithmetique(x, y);
        }
        return instance;
    } 

    public static Arithmetique getInstance(int x, int y, String nom) {
        
        if(instance  == null) {
            return new Arithmetique(x, y, nom);
        }
        return instance;
    }

    public int somme(int x, int y) {
        return x + y;
    }

    public int multiplication(int x, int y) {
        return x*y;
    }

    public float division(int x, int y) {
        return x/y;
    }

    public float moyenne(int x, int y) {
        return somme(x, y)/2;
    }
    public int soustraction(int x, int y) {
        return x-y;
    }

    public void afficher() {
        System.out.println("\nJe suis une instance mes valeurs sont : "+this.x +" et "+this.y+" et de nom : <"+this.nom+">");
    }

}
