import java.util.Scanner;

public class ExSeven {

    public void correction() {

        String toTest = "";
        System.out.print("Saisir un mot: ");
        Scanner scanner = new Scanner(System.in);
        toTest = scanner.nextLine();

        //On passe tout en minuscule
        toTest = toTest.toLowerCase();
        //On remplace les caractères invisible comme \n et les espaces
        toTest = toTest.replaceAll("\\s+", "");

        if (isPalindrome(toTest)) {
            System.out.println(toTest + " est un palindrome");
        } else {
            System.out.println(toTest + " n'est pas un palindrome");
        }

    }

    private boolean isPalindrome(String _toTest) {

        //Début et fin du mot. Ils agissent comme des pointeurs.
        int start = 0, end = _toTest.length() - 1;
        //Tant qu'il reste des lettres à parcourirs
        while (start < end) {
            //Permet d'accéder à l'indice indiqué (comme un tableau)
            //S'il s'agit d'un palindrome, alors en partant de la fin et et du début, les deux lettres sont identiques
            if (_toTest.charAt(start) != _toTest.charAt(end))
                return false;

            start++;
            end--;
        }
        //Si on est là, c'est un palindrome
        return true;
    }
}
