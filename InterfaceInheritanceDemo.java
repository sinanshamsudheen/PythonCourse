
// Define the Animal interface
interface Animal {
    void eat();
    void sleep();
}

// Define the Pet interface that extends Animal
interface Pet extends Animal {
    void play();
    void beFriendly();
}

// Implement the Pet interface in the Dog class
class Dog implements Pet {
    @Override
    public void eat() {
        System.out.println("Dog is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing.");
    }

    @Override
    public void beFriendly() {
        System.out.println("Dog is being friendly.");
    }
}

// Main class to test the implementation
public class InterfaceInheritanceDemo {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.sleep();
        myDog.play();
        myDog.beFriendly();
    }
}
