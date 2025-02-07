package oops;

class Animal1 {
    void sound() {
        System.out.println("Animals make sounds");
    }
}

class Dog1 extends Animal1 {
   
    void sound() {
        System.out.println("dog barks");
    }
}

class Cat extends Animal1 {
   
    void sound() {
        System.out.println("cat meows");
    }
}

public class DynamicPolymorphismExample {
    public static void main(String[] args) {
        Animal1 myAnimal = new Animal1();
        Animal1 myDog = new Dog1();
        Animal1 myCat = new Cat();

        myAnimal.sound();
        myDog.sound();
        myCat.sound();
    }
}
