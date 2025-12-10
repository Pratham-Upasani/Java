import java.util.Scanner;

public class AbstractClassDemo{
    public static void main(String[] args){
        Square s = new Square();
        s.getData();
        System.out.println("The Perimeter of square is "+s.perimeter());
        System.out.println("The Area of square is "+s.area());

        Rectangle r = new Rectangle();
        r.getData();
        System.out.println("The Perimeter of rectangle is "+r.perimeter());
        System.out.println("The Area of rectangle is "+r.area());

        Circle c = new Circle();
        c.getData();
        System.out.println("The Perimeter of square is "+c.perimeter());
        System.out.println("The Area of square is "+c.area());
    }
}

abstract class Shape{
    Scanner sc = new Scanner(System.in);
    abstract void getData();
    abstract double perimeter();
    abstract double area();
}

class Square extends Shape{
    double side;
    
    @Override
    void getData(){
        System.out.print("\nEnter the side of square: ");
        side=sc.nextDouble();
    }

    double perimeter(){
        return 4*side;
    }

    double area(){
        return side*side;
    }
}

class Rectangle extends Shape{
    double l,b;
    
    @Override
    void getData(){
        System.out.print("\nEnter the length of rectangle: ");
        l=sc.nextDouble();
        System.out.print("Enter the breadth of rectangle: ");
        b=sc.nextDouble();
    }

    double perimeter(){
        return 2*(l+b);
    }

    double area(){
        return l*b;
    }

}

class Circle extends Shape{
    double radius;
    final double PI=3.14;
    
    @Override
    void getData(){
        System.out.print("\nEnter the radius of circle: ");
        radius=sc.nextDouble();
    }

    double perimeter(){
        return 2*PI*radius;
    }

    double area(){
        return PI*radius*radius;
    }
}