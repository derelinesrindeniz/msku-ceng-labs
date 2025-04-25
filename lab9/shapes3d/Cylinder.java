package shapes3d;

import shapes2d.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius,double height){
        super(radius);
        this.height=height;
    }
    public double volume(){
        return height*area();
    }
    @Override
    public double area(){
        return 2*super.area() + 2*Math.PI*radius*height;
    }

    @Override
    public String toString(){
        return "height:"+ height + super.toString();
    }


}
