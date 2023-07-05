package mypackage.species;

public class Lion extends Feline  implements Flyable{

    public Lion() {
        mName = "Lion";
    }

    public void sleep() {
        System.out.println("the Lion sleep lot of..!!");
    }

    public void fly(String energy) {
        System.out.println("Je me propulse avec du " + energy);
    }

    public void boost(int vts){
        System.out.println("Je me propulse avec du " + vts);
    }


    
}
