import java.util.Scanner;

public class ExTwo {
    //Déclaration des attributs
    private int[] grades;
    private int currentInsert = 0;
    private boolean hasInserted = false;

    public void correction() {

        boolean keepInserting = true;

        /*En Java on doit connaitre la taille d'un tableau pour le déclarer
        Le tableau est créé au moment de la compilation
        Il existe une solution: les tableaux dynamique, que l'on verra plus tard
        Pour cet exercice, on va créer un tableau suffisament grand et s'assurer que l'on dépasse pas la taille*/

        //Pour une classe de 40 élèves
        grades = new int[40];

        //Penser à import
        //Déclaration du scanner sur le flux d'entrée: input
        Scanner in = new Scanner(System.in);

        int numberToInsert = 0;

        //Tant que l'on saisie
        while (keepInserting) {

            System.out.print("Saisir un entier positif (<0 pour sortir): ");
            numberToInsert = in.nextInt();
            System.out.println();

            if (numberToInsert > 0)
                hasInserted = true;

            //Blindage: imposer des conditions
            if (numberToInsert < 0 || currentInsert > 39) {
                keepInserting = false;
                //Sortie de la boucle
            } else {
                //Si la note dépasse 20, on affiche une erreur et on sort de l'instruction
                if (numberToInsert > 20) {
                    System.out.println("Saisir une note inferieur a 20");
                } else {
                    //On ajoute l'élément au bon indice
                    grades[currentInsert] = numberToInsert;
                    //On incrémente l'indice
                    currentInsert++;
                }

            }

        }

        test();
    }

    private void test() {

        if (!hasInserted) {
            System.out.println("Rien a afficher");
            return;
        }


        int lowerValue = Integer.MAX_VALUE, maxValue = Integer.MIN_VALUE,
                countLV = 0, countMV = 0;
        for (int i = 0; i < currentInsert; i++) {

            //Si la note testée est plus grande, ou égale que celle stockée
            if (grades[i] >= maxValue) {
                //S'il s'agit de la même note
                if (grades[i] == maxValue) {
                    //On augmente le compte
                    countMV++;
                } else {
                    //Sinon on récupère la valeure et on réinitialise le compte
                    maxValue = grades[i];
                    countMV = 1;
                }
                //Si la note est plus petite
            } else if (grades[i] <= lowerValue) {
                if (grades[i] == lowerValue) {
                    //On augmente le compte
                    countLV++;
                } else {
                    //Sinon on récupère la valeure et on réinitialise le compte
                    lowerValue = grades[i];
                    countLV = 1;
                }
            }
        }

        System.out.println("Minimum: " + lowerValue + " | apparition: " + countLV);
        System.out.println("Maximum: " + maxValue + " | apparition: " + countMV);
    }
}
