
//REMINDER: If there is no specified return type then state void 
public class Animal 
{
    public int age;

    public String gender;

    public void isMammal(){
        System.out.println("This is a public method isMammal() from class Animal");
        
    }

    public void mate(){
        System.out.println("This is a public method mate() from class Animal");
    }

    public static void main(String[] args) throws Exception 
    {
        //Fish is unused
        Fish myFish = new Fish();

        Zebra myZebra = new Zebra();
        Animal myAnimal = new Animal();

        myAnimal.isMammal();
        myAnimal.mate();
        myZebra.run();
        
        /*
         * Class fish has a private method to which I cannot access.
         * 
         * myFish.canEat();
         */


    }
}

//REMINDER: Subclass must be extended

class Fish extends Animal {
    private int sizeInFeets;

    private void canEat(){
        System.out.println("This is a private method canEat() from class Fish");
    }
}

class Zebra extends Animal {
    public boolean is_wild;

    public void run(){
        System.out.println("This is a priate method run() from class Zebra");
    }
}