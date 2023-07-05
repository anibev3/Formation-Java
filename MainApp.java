// import java.util.Array;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import mypackage.*;


public class MainApp{

    public static void main(String[] args) throws Exception {

        // yoMan(NIMBER);
        // Les operateurs
        // lesOperateurs();
        // lesConditions();
        // lesBoucles();
        // constructionDeClasse();
        // lesMethodes_getNumberTow();
        // String message = sayHello("Bonjour les potos");
        // System.out.println(message);

        //--------------- LA SURCHARGE DE METHODE
        // System.out.println(sum(2.5, 8.9));
        // System.out.println(sum(8, 5));
        //---------------------------------------

        // lesPlayers();
        // emcapsulationDeDonnee();

        // lesTableaux();
        // lesChainesDeCaracteres();
        // lesPaquets();
        lectureClavier();

        
    }

    public static void yoMan(){

        System.out.println("Biencenu");
        int age_user = 0;
        System.out.println(age_user);
        age_user = 25;
        System.out.println(age_user);

        final int NIMBER = 5659;
        System.out.println(NIMBER);
    }

    public static void lesOperateurs(){
        /*
         * [NOTES]
         * = Affectation
         * + Concaténation, Addition
         * % Modulo
         * - Soustration
         * / Division
         * * Multiplication
         * () Priorité des paranthèse
         * == Comparaison des valeurs
         * === Comparaison des valeurs et types
         * != Different
         * <
         * >
         * <=
         * >=
         * += -= *= /= %= --------> incrementation, decrementation
         * A++ Post-incrementation
         * ++A Pré-incrementation
         * A-- Post-décrementation
         * --A Pré-décrementation
         */

        System.out.println("Les operérateurs");
        int age = 22;
        System.out.println("Tu a " + age + " ans");

        int goldCoin = 0;
        System.out.println(goldCoin);

        goldCoin += 10;
        System.out.println(goldCoin);

        goldCoin += 100;
        System.out.println(goldCoin);
    }

    public static void lesConditions(){
        System.out.println("Nous sommes dans la methode des conditions");
        
        int value1 = 24;
        boolean value2 = (value1 == 24); // Est ce que 24 est égal à 24 ?
        
        if (!value2)
            System.out.println("La valeur de value2 est : "+ value2);
        else
            System.out.println("La valeur de value2 est : "+ value2);


        switch (value1) {
            case 24:
                    System.out.println("La valeur de value 1 est: " + value1);
                break;
            case 13:
                    System.out.println("La valeur de value 1 est: " + value1);
                break;
            default:
                    System.out.println("La valeur par defaut de value 1 est: " + value1);
                break;
        }
    }

    public static void lesBoucles(){
        System.out.println("Nous sommes dans la methode des boucles");

        // -----------------------------------------
        int i = 10;
        // while (i != 10){
        //     if(i == 5)
        //         break;

        //     System.out.println("yoooo 1 : "+ i);
        //     i++;
        // }
        // -----------------------------------------
        // CETTE BOUCLE EST EXECUTé AU MOIN UNE FOIS
        do {
            // i++;
            // if(i == 5)
            //     break;

            System.out.println("yoooo 2 : "+ i);
        } while (i != 10);
        // -----------------------------------------

        for(int j = 0; j != 10; j++){
            System.out.println(j);
        }
    }

    public static void constructionDeClasse(){

        Cat monChat = new Cat("Mouni", 4);
    }

    public static int lesMethodes_getNumberTow(){
        return 2;
    }
    public static String sayHello(String msg){
        System.out.println(msg);
        return msg;
    }
    //--------------- LA SURCHARGE DE METHODE
    public static int sum(int a, int b){
        return a + b;
    }
    public static double sum(double a, double b){
        return a +b;
    }
    //---------------------------------------
    // public static void lesPlayers(){
    //     Player player = new Player();
    //     Player player1 = new Player("Fabrice");
    //     Player player2 = new Player("Bertrand", 15);
    //     player2.attack();
    //     int level = player2.score();
    //     System.out.println("Votre niveau est de : "+level);
    // }

    public static void emcapsulationDeDonnee(){
        SoftwareRegistration sr = new SoftwareRegistration(2028);
        sr.setExpirationYear(2050);
        System.out.println(sr.getExpirationYear());
    }

    public static void lesTableaux(){
         int data = 14; 
        //  int tab[]
        //  int[] tab
        //  int tab[] = {1, 2, 3}
        //  int tab[] = new int[3]; //declaration d'un tabeau de 3 entiers
        //  int tab = new int[]{1, 2, 3};

        int[] tab = {1, 2, 3, 4, 5};
        int[] tab2 = new int[10];
        // System.out.println(tab[0]);
        // System.out.println(tab[1]);
        // System.out.println(tab[2]);

        // for(int i = 0 ; i < tab.length; i++)
        //     System.out.println(tab[i]);

        // for(int element : tab) // Pour chaque element dans le tablau
        //     System.out.println(element);
        

            /*
             * Tableau à deux dimensions
             *   - Deux lignes
             *   - Trois colonnes
             */
        int[][] tab1 = {
            {1, 9, 3},
            {4, 2, 7}
        };
        // System.out.println(tab1[1][1]);
        
        // for(int i = 0; i < tab1.length; ++i)
        //     for(int j = 0; i < tab1[i].length; ++j)
        //         System.out.println(tab1[i][j]);

        // for(int[] i : tab1)
        //     for(int number : i)
        //         System.out.println(number);

        Arrays.fill(tab2, 15);

        for(int el : tab2)
            System.out.println(el);
    }

    public static void lesChainesDeCaracteres(){
    /*
     *  String . immuable (contenu non modifiable)
     *      > concat() -> plus rapide que "+"
     *      > length()
     *      > toUpperCase(), toLowerCase(), trim(), replace(<old>, <new>)
     *      > substring(<index>, <nb>)
     *      > <str1>.equals(<str2>) -> Pour verifier l'égalité de deux chaines de caratère
     *                              -> retourne (Vrai) ou (Faux)
     *      > <str1>.compareTo(<str2>) -> Pour verifier l'égalité de deux chaines de caratère en comparant leur code Ascin
     *                                 -> retourne (nbr -) ou (nbr +)
     * 
     */

        String s = "Bonjour";        
        String s2 = "tous le monde";

        System.out.println(s + " " + s2);
        System.out.println(s.concat(" ").concat(s2));

        String str = "new/titre-de-la-news/14";
        StringTokenizer st = new StringTokenizer(str, "/");

        while(st.hasMoreTokens())
            System.out.println(st.nextToken());

    }

    public static void lesPaquets(){

        Player player = new Player();
        Item item = new Item();

    }

    public static void lectureClavier() throws Exception {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Comment t'appel tu ? ");
        String name = br.readLine();
        System.out.println(name);

        // Scanner sc;

    }
}
