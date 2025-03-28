public class TestCircle {
    public static void main(String[] args) {

        Point center= new Point(10,10);
        Circle circle = new Circle(5,center);

        System.out.println("Circle area"+ circle.area());
        System.out.println("Circle perimeter"+ circle.perimeter());

        Circle circleA= new Circle(10, new Point(20,20));
        boolean intersect=circle.intersect(circleA);
        if(intersect){
            System.out.println("Circles are intersecting");
        }
        else{
            System.out.println("Circle are not intersecting");
        }
    }
}
