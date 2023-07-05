package mypackage.species;

/* 
 *  une class abstraite permet de factoriser du code 
 * par rapport a des objets qui sont etroitement lié
 */

// Une class est abstraite si une au minimun de ses methode est abstraite
abstract public class Feline { // Une classe abstraite ne peut pas avoir d'instance
    
    protected String mName;

    public String whoAmI() {
        return mName;
    }

    abstract public void sleep();
     public void speak() {
        System.out.println("the tiger rugis less than Lion !!");
    }
}
 
