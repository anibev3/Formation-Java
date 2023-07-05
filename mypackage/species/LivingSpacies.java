package mypackage.species;

// Une class est abstraite si une au minimun de ses methode est abstraite
abstract public class LivingSpacies { // Une classe abstraite ne peut pas avoir d'instance
    
    protected String mName;

    public String whoAmI() {
        return mName;
    }

    abstract public void eat();
    abstract public void speak();
}
 