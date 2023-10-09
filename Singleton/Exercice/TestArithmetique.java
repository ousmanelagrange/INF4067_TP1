package Singleton.Exercice;

public class TestArithmetique {

    public static void main(String[] args) {
        Arithmetique arith = Arithmetique.getInstance(4, 5);
        arith.afficher();
        int somme = arith.somme(8, 4);
        System.out.printf("La somme est : %d", somme);

        //Utilisation d'un autre constructeur avec parametre nom
        Arithmetique arith2 = Arithmetique.getInstance(4, 5, "Modulo");
        arith2.afficher();

        //Test de chacune des méthode de la classe Arithmétique

        System.out.printf("La division de "+40+" par "+3+ " est : %f", arith2.division(40, 3));
        System.out.println();

        System.out.printf("La multiplication de "+40+" par "+3+ " est : %d", arith2.multiplication(40, 3));
        
        System.out.printf("La soustraction de "+40+" par "+3+ " est : %d", arith2.soustraction(40, 3));
        System.out.println();


    }
}