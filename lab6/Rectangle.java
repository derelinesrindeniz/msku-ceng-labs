public class Rectangle {
    int sideA;
    int sideB;
    Point topLeft;
    public Rectangle( int sideA, int sideB , Point topLeft ){
        this.sideA=sideA;
        this.sideB=sideB;
        this.topLeft=topLeft;
    }
    public int area(){
        return sideA * sideB;
    }
    public int  perimeter(){
        return (sideA+sideB)*2;
    }
    public Point[] corners(){
        Point[] corners =new Point[4];
        corners[0]=topLeft;
        corners[1]=new Point(topLeft.xCoord +  sideA ,topLeft.yCoord);
        corners[2]=new Point(topLeft.xCoord, topLeft.yCoord-sideB);
        corners[3]=new Point(topLeft.xCoord + sideA,topLeft.yCoord-sideB);
        return corners;
    }

}
