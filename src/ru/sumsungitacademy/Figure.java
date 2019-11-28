package ru.sumsungitacademy;

 abstract class Figure {
    protected float x;
    protected float y;
    public Figure(float xx, float yy){
        this.x=xx;
        this.y=yy;
    }
    public abstract float getArea();
    public abstract float getPerimeter();
}
