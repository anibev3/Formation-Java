public class Cat{

    // Les attributs
    private String mName;
    private int mAge;

    // Le constructeur
    public Cat(String name, int age) {

        this.mName = name;
        this.mAge = age;
        System.out.println(this.mName +" - "+ this.mAge);
    }


}