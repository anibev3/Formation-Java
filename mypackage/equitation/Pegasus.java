package mypackage.equitation;

public class Pegasus extends Horse {
    
    public Pegasus(String name) {
        // super simple permet d'acceder a l'information d'un constructeur parent
        super(name); // ça veut dire utilise le constructeur qui viens au dessu dont il herite
        this.mPosZ = 100;
    }
    
    // si la methode move existe dans la classe pegasus,
    public void move(int x, int y) {
        // super.<methode> permet d'acceder a l'information d'une methode parent
        super.move(x, y);
        System.out.println("Le pegase se deplace (X = "+ x +", Y = "+ y +")");
    }

    public void fly(int z) {
        this.mPosZ = z;
        System.out.println("Le pegase s'eleve dans les airs a (Z = " + this.mPosZ + ")");
    }

    private int mPosZ;
}
