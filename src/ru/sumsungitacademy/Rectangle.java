package ru.sumsungitacademy;

public class Rectangle extends Figure implements Moveable {
    private float height;
    private float width;

    public Rectangle(float xx, float yy, float height, float width) {
        super(xx, yy);
        this.height = height;
        this.width = width;
    }

    @Override
    public float getArea() {
        return this.width * this.height;
    }

    @Override
    public float getPerimeter() {
        return 2 * this.height + 2 * this.width;
    }

    @Override
    public void move(float dx, float dy) {

    }

    @Override
    public void resize(float koeff) {
        this.height *= koeff;
        this.width *= koeff;

    }

    @Override
    public String toString() {
        System.out.println("Rectangle");
        System.out.println("Center: (" + (this.x + 0.5 * this.width) + "," + (this.y + 0.5 * this.height) + ")");
        System.out.println("Height: " + this.height);
        return "Width: " + this.width;
    }
}
