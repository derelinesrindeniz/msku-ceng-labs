public class GCDloop {
    public static  void main(String[] args){
        int number1=10;
        int number2=90;

        int result=findGcd(number1, number2);
        System.out.println("GCD of" + " " + number1 + " " + "and" + " "+ number2 + " is " + result);
    }
    private static int findGcd(int number1,int number2){
        int remainder;
        do{
            remainder= number1 % number2;
            number1=number2;
            number2=remainder;
        }
        while(remainder!= 0);
            return number1;




    }

}
