public class SoftwareRegistration {
    
    /*
     * [LES ACCESSEURS]
     *      getters : accés à un attribut (lecture)
     *      setters : modification d'un attribut
     */

     public SoftwareRegistration(int expirationDate){

        this.mExpiration = expirationDate;
        System.out.println("Votre produit est valide jusqu'en " + this.mExpiration);
     }

     private static int mNumberOfRegistration = 5;
      
     private int mExpiration;
     public int getExpirationYear(){ return this.mExpiration;}
     public void setExpirationYear(int expirationYear){ this.mExpiration = expirationYear;}
}
