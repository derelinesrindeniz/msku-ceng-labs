package shapes2d;

public class Square {
    public int side;
    public Square(int side){
        this.side=side;

    }
    public int area(){
        return side*side;

    }

    @Override
    public String toString(){
        return  "side:" + side;
    }

}
