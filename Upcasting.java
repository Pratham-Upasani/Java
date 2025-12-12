public class Upcasting{
    public static void main(String[] args){
        Animal a = new Dog(); //Now using Base class's object, we can use child class's overriden method
        a.show();  //Dog's show method override Animal's method so it will override
        Animal a1 = new Fish();
        a1.show();  //Fish has display() so show() version from Animal class runs instead
    }
}
class Animal{
    void show(){
        System.out.println("Animal makes a sound.");
    }
}
class Dog extends Animal{
    @Override
    void show(){
        System.out.println("Dog Barks.");
    }
}
class Fish extends Animal{
    void display(){     //No more overriding so no upcasting(Parent's show method calls instead)
        System.out.println("Fish swims.");
    }
}