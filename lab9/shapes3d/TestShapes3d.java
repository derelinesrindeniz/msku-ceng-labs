package shapes3d;

public class TestShapes3d {
    public static  void main(String[] args){
        Cylinder cylinder = new Cylinder(5,10);
        System.out.println(cylinder.toString());
        System.out.println(cylinder.volume());
        System.out.println(cylinder.area());

        Cube cube =new Cube(4);
        System.out.println(cube.toString());
        System.out.println(cube.volume());
        System.out.println(cube.area());



    }
}
