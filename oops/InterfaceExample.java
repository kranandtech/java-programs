package oops;

interface Animal {
    void sound();
   
}

class Dog implements Animal {
    public void sound() {
        System.out.println("dog barks");
    }

   
}

public class InterfaceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.sound();
        
    }
}
