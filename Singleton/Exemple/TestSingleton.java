package Singleton.Exemple;
public class TestSingleton {
    public static void main(String [] args) {
        int somme = Singleton.getInstance().somme(2,5);

        System.out.printf("La somme est : %d", somme);
        Singleton s1 = Singleton.getInstance(8, 3);
        s1.afficher();

        Singleton s2 = Singleton.getInstance(5, 9);
        s2.afficher();
        s1.afficher();
    }
}
