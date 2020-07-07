package Zumrut;

abstract class Shape {

    public abstract int area();
    public Shape (){
        System.out.println("Shape constructor called");
    }
}

class Cube extends Shape {
int a;
public Cube (int a) {
    this.a = a;
}
    public int area(){
        return a * a;
    }

    @Override
    public String toString() {
        return "area " + area();
    }
}

class Rectangular extends Shape {
    int length;
    int width;

    public Rectangular(int length, int width) {
        this.length =length;
        this.width = width;

    }
    @Override
    public int area() {
        return length * width;
    }

    @Override
    public String toString() {
        return "area " + area();
    }
}

public class TestClass {

    public static void main(String[] args){
    Shape shape1 = new Cube(2);
    Shape shape2 = new Rectangular(2, 4);
        System.out.println(shape1.toString());
        System.out.println(shape2.toString());
    }
}
