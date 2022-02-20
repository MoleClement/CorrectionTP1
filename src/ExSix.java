import java.util.Random;

public class ExSix {

    //Regarder la table ASCII
    private final int maxSpecialChar1 = 47;
    private final int minSpecialChar2 = 58;
    private final int maxSpecialChar2 = 64;
    private final int minSpecialChar3 = 91;
    private final int maxSpecialChar3 = 96;
    private final int minSpecialChar4 = 123;
    private final int maxSpecialChar4 = 126;
    private final int minCaps = 65;
    private final int maxCaps = 90;
    private final int minNumber = 48;
    private final int maxNumber = 57;
    private final int minAscii = 33;
    private final int maxAscii = 122;

    public void correction() {

        //char[] password = new char[8]; //Ou String
        String password = "";
        Random random = new Random();
        int tmp = 0, maxLength = 15;
        boolean hasNumber = false, hasSpecialChar = false, hasCaps = false, hasReachMinimumLength = false, keepDrawing = true;

        while (keepDrawing) {

            tmp = random.nextInt(maxAscii - minAscii + 1) + minAscii;

            //S'il s'agit d'un caractère spécial
            //Constants
            int minSpecialChar1 = 33;
            if (tmp >= minSpecialChar1 && tmp <= maxSpecialChar1
                    || tmp >= minSpecialChar2 && tmp <= maxSpecialChar2
                    || tmp >= minSpecialChar3 && tmp <= maxSpecialChar3
                    || tmp >= minSpecialChar4 && tmp <= maxSpecialChar4) {
                hasSpecialChar = true;
                //S'il s'agit d'un chiffre
            } else if (tmp >= minNumber && tmp <= maxNumber) {
                hasNumber = true;
            } else if (tmp >= minCaps && tmp <= maxCaps) {
                hasCaps = true;
            }

            //On rajoute le caractère au mot de passe. On converti un char en string.
            // (Un char est un int, on le cast pour indiquer qu'on le traite comme un caractère)
            password = password.concat(String.valueOf((char) tmp));
            if (password.length() == 8) {
                hasReachMinimumLength = true;
            }

            //On peut s'en passer et rester avec password.length >= 8
            if (hasReachMinimumLength && password.length() < maxLength) {
                tmp = random.nextInt(4);
                //Une chance sur 4 d'arrêter le tirage (soumis à condition)
                if (tmp == 0) {
                    //Si on rempli les conditions on arrête de tirer
                    if (hasNumber && hasSpecialChar && hasCaps)
                        keepDrawing = false;

                        //Sinon on recommence
                    else {
                        hasNumber = false;
                        hasSpecialChar = false;
                        hasReachMinimumLength = false;
                        password = "";
                    }
                }
                //On arrête le tirage et regarde les conditions
                //Pour avoir une taille maximum de mot de passe
            } else if (hasReachMinimumLength) {
                if (hasNumber && hasSpecialChar & hasCaps)
                    keepDrawing = false;
                else {
                    hasNumber = false;
                    hasSpecialChar = false;
                    hasReachMinimumLength = false;
                    password = "";
                }
            }
        }

        System.out.println("Le mot de passe est: " + password + " | Taille: " + password.length());
    }

}
