
class Animal {
    void makeServiceSound() {
        System.out.println("The animal makes a generic sound");
    }
}


class Dog extends Animal {
    
    @Override
    void makeServiceSound() {
        System.out.println("The Dog barks: Woof Woof!");
    }
}


class Cat extends Animal {
    
    @Override
    void makeServiceSound() {
        System.out.println("The Cat meows: Meow!");
    }
}

public class main3 {
    public static void main(String[] args) {
        
        Animal genericAnimal = new Animal();
        
        
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        System.out.println("--- Method Overriding Demo ---");
        genericAnimal.makeServiceSound(); 
        myDog.makeServiceSound();         
        myCat.makeServiceSound();        
    }
}