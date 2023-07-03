public class MainApp{

    public static void main(String[] args){

        // yoMan(NIMBER);
        // Les operateurs
        // lesOperateurs();
        // lesConditions();
        // lesBoucles();
        // constructionDeClasse();
        lesMethodes();
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

    public static void lesMethodes(){

    }
}
