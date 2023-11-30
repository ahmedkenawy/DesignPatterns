package com.keno.designpatterns.creational.prototype;


class ConcreteProtoType{
    public static void main(String[] args) {
        // Creating prototype objects
        Shape circlePrototype = new Circle();
        Shape squarePrototype = new Square();

        // Creating new objects by cloning prototypes
        Shape newCircle = circlePrototype.clone();
        Shape newSquare = squarePrototype.clone();

        // Drawing the cloned objects
        newCircle.draw();  // Output: Drawing a Circle
        newSquare.draw();  // Output: Drawing a Square
    }
}
// Prototype interface
interface Shape extends Cloneable {
    Shape clone();
    void draw();
}

// Concrete prototype implementations
class Circle implements Shape {
    @Override
    public Shape clone() {
        return new Circle();
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square implements Shape {
    @Override
    public Shape clone() {
        return new Square();
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}

