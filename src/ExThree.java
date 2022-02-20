import java.util.Random;

public class ExThree {
    private int[] draw;
    private int currentInserted = 0;

    public void correction() {

        draw = new int[6];
        boolean keepDrawing = true;

        Random random = new Random();
        //Formule pour tirer entre deux entier
        int min = 1, max = 49;
        int randomNumber;

        while (keepDrawing) {
            randomNumber = random.nextInt(max - min) + min;

            if (insertable(randomNumber)) {
                draw[currentInserted] = randomNumber;
                currentInserted++;
            }

            if (currentInserted == 6) {
                keepDrawing = false;
            }

        }

        test();
    }

    private boolean insertable(int _toInsert) {

        for (int i = 0; i < currentInserted; i++) {
            //Si le nombre est déjà insérée
            if (draw[i] == _toInsert)
                return false;
        }

        //Si on arrive là, parcours terminé sans doublon
        return true;
    }

    private void test() {
        System.out.print("Tirage du loto: ");
        for (int i = 0; i < draw.length; i++) {
            if (i != draw.length - 1)
                System.out.print(" " + draw[i] + " |");
            else System.out.print(" " + draw[i]);
        }
    }
}
