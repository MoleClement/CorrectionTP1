import java.util.Scanner;

public class Test {

    public void displayMenu() {
        System.out.println();
        System.out.println("Menu");
        System.out.println();
        System.out.println("0. Quitter");
        System.out.println("1. Exercice 1");
        System.out.println("2. Exercice 2");
        System.out.println("3. Exercice 3");
        System.out.println("4. Exercice 4");
        System.out.println("5. Exercice 5");
        System.out.println("6. Exercice 6");
        System.out.println("7. Exercice 7");
    }

    //Point d'entrée du programme (lors de la compilation)
    public static void main(String[] args) {
        Test test = new Test();
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (!exit) {
            test.displayMenu();

            if (args.length == 0) {
                System.out.print("Saisir votre choix: ");
                choice = scanner.nextInt();

                switch (choice) {
                    default:
                        System.out.println("Saisir un choix valide");
                        break;
                    case 1:
                        ExOne exOne = new ExOne();
                        exOne.correction();
                        break;
                    case 2:
                        ExTwo exTwo = new ExTwo();
                        exTwo.correction();
                        break;
                    case 3:
                        ExThree exThree = new ExThree();
                        exThree.correction();
                        break;
                    case 4:
                        ExFourAndFive exFour = new ExFourAndFive();
                        exFour.correctionExFour();
                        break;
                    case 5:
                        ExFourAndFive exFive = new ExFourAndFive();
                        exFive.correctionExFive();
                        break;
                    case 6:
                        ExSix exSix = new ExSix();
                        exSix.correction();
                        break;
                    case 7:
                        ExSeven exSeven = new ExSeven();
                        exSeven.correction();
                        break;

                    case 0:
                        exit = true;
                }

            } else {
                boolean process = true;
                int tmp = 0;
                while (process) {
                    switch (Integer.parseInt(args[tmp])) {
                        default:
                            System.out.println("Choix invalide");
                            break;
                        case 1:
                            ExOne exOne = new ExOne();
                            exOne.correction();
                            break;
                        case 2:
                            ExTwo exTwo = new ExTwo();
                            exTwo.correction();
                            break;
                        case 3:
                            ExThree exThree = new ExThree();
                            exThree.correction();
                            break;
                        case 4:
                            ExFourAndFive exFour = new ExFourAndFive();
                            exFour.correctionExFour();
                            break;
                        case 5:
                            ExFourAndFive exFive = new ExFourAndFive();
                            exFive.correctionExFive();
                            break;
                        case 6:
                            ExSix exSix = new ExSix();
                            exSix.correction();
                            break;
                        case 7:
                            ExSeven exSeven = new ExSeven();
                            exSeven.correction();
                            break;

                        case 0:
                            exit = true;
                    }
                    tmp++;
                    if (tmp == args.length)
                        process = false;
                }

            }
        }
    }

}
