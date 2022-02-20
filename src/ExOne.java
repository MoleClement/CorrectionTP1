public class ExOne {

    public void correction() {
        //Identifiez l’erreur 1 et corrigez

        //int i = 0; (option 2)
        /*Erreur: i est déjà déclaré. Soit on enlève la déclaration dans la boucle (option 1),
        soit on enlève la déclaration avant (option 2)*/
        //for (i = 0; i < 5; i++) (option 2)
        for (int i = 0; i < 5; i++)
            System.out.print(i + ", ");
        System.out.print("\n");

        //Identifiez l’erreur 2 et corrigez

        //Penser à rajouter le f lors de l'attribution
        //float a = 3.0;
        float a = 3.0f;
        double b = 4;
        float c;
        //double c (option 1)
        //Attention aux erreur implicite de conversion
        /*sqrt retourne un double, c est un float. Soit on change c en double (option 1),
        soit on cast le résultat en float avec perte d'information (option 2)*/
        c = (float) Math.sqrt(a * a + b * b); //option 2
        System.out.println("c = " + c);

        //Identifiez l’erreur 3 et corrigez

        //La variable b et c sont déjà définies dans la scope (portée de définition d'une variable)
        byte b1 = 42; //Soit on change de scope, soit on change de nom
        char c1 = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = .1234;
        double resultat = (f * b1) + (float) (i / c1) - (d * s); /*c1 est un char (donc représenté par un entier). La multiplication est possible.
        Attention, int/int -> peut donner un float.
        */
        System.out.print((f * b1) + " + " + (i / c1) + " - " + (d * s));
        System.out.println(" = " + resultat);
        byte b2 = 10;
        //byte b3 = b2 * b1; //byte [-128;127]
        int b3 = b2 * b1;
        //En java les opérations sur les bytes utilisent les propriétés des integer. Le résultat est donc un entier.
        System.out.println("b3 = " + b3);
    }

}
