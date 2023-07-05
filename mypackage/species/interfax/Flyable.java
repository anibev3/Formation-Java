package mypackage.species.interfax;

/**
 * Flyable
 */
interface Flyable {

    public final int flySpeed = 20;
    public void fly(String energy);
    public void boost(int vts);
}

// une interface fonctionnelle est une interface qui a une seul et unique methode fonctionnel
