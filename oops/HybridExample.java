package oops;

class Grandparent1 {
    void showGrandparent() {
        System.out.println("This is Grandparent Class");
    }
}

// Multilevel Inheritance
class Parent2 extends Grandparent1 {
    void showParent() {
        System.out.println("This is Parent Class");
    }
}

// Hierarchical Inheritance
class ChildOne1 extends Parent2 {
    void showChildOne() {
        System.out.println("This is ChildOne Class (Child of Parent)");
    }
}

class ChildTwo1 extends Parent2 {
    void showChildTwo() {
        System.out.println("This is ChildTwo Class (Child of Parent)");
    }
}

public class HybridExample {
    public static void main(String[] args) {
        
        ChildOne1 obj1 = new ChildOne1();
        obj1.showGrandparent();  
        obj1.showParent();       
        obj1.showChildOne();     

        
        ChildTwo1 obj2 = new ChildTwo1();
        obj2.showGrandparent();  
        obj2.showParent();       
        obj2.showChildTwo();    
    }
}
