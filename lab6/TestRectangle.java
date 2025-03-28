public class TestRectangle {
    public static void main(String[]  args){
        Point topLeft= new Point(10,10);
        Rectangle rect = new Rectangle(4,6,topLeft);

        System.out.println("Area:" + rect.area());
        System.out.println("Perimer:"+ rect.perimeter());
        System.out.println("Corners:");
        for (int i=0;i < rect.corners().length; i++){
            System.out.println("Coordinate x "  + " "+ rect.corners()[i].xCoord+ "Coordinate y" + " " + rect.corners()[i].yCoord);
        }

    }

}
