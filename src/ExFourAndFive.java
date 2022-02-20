import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ExFourAndFive {

    //Attribut
    private int[] array = new int[15];

    public void correctionExFour() {

        resetArray();
        Random random = new Random();

        int min = -1, max = 6;

        for (int i = 0; i < array.length; i++) {

            array[i] = random.nextInt(max - min) + min;
        }

        System.out.println();
        arrayToString(array.length);
        arrayToHistogram(array.length);
    }

    public void correctionExFive() {
        resetArray();

        int tmp = 0;
        boolean asking = true;
        Scanner scanner = new Scanner(System.in);

        while (asking) {
            System.out.print("Saisir un entier entre 3 et 15 (inclus): ");
            tmp = scanner.nextInt();
            System.out.println();
            if (tmp > 2 && tmp < 16) {
                asking = false;
            } else {
                System.out.println();
                System.out.println("Erreur !");
            }
        }

        asking = true;
        int current = 0, maxIdx = tmp;
        while (asking) {
            System.out.print("Saisir un entier entre -1 et 5 (inclus): ");
            tmp = scanner.nextInt();
            System.out.println();
            if (tmp > -2 && tmp < 6) {
                array[current] = tmp;
                current++;
            } else {
                System.out.println();
                System.out.println("Erreur !");
            }
            if (current == maxIdx) {
                asking = false;
            }
        }

        System.out.println();
        arrayToString(current);
        arrayToHistogram(current);
    }

    private void arrayToString(int _length) {
        System.out.print("Tirage: ");
        for (int i = 0; i < _length; i++) {
            if (i != _length - 1)
                System.out.print(" " + array[i] + " |");
            else
                System.out.print(" " + array[i]);
        }
    }

    private void resetArray() {
        Arrays.fill(array, 0);
    }

    private void arrayToHistogram(int _length) {

        int[] tmp = countArray(_length);
        System.out.println();
        for (int i = 0; i < tmp.length; i++) {
            display((i - 1), tmp[i]);
        }

    }

    private int[] countArray(int _length) {

        int[] tmp = new int[7];

        for (int i = 0; i < _length; i++) {
            tmp[array[i] + 1]++;
        }

        return tmp;
    }

    private void display(int _number, int _occurrence) {
        if (_occurrence != 0) {
            System.out.print(_number + " ");
            for (int i = 0; i < _occurrence; i++)
                System.out.print('*');
            System.out.print(" ");
        } else System.out.print(_number + " _ ");

    }
}
