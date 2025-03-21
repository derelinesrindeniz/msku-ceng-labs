public class GCDRec {
    public static  void main(String[] args){
        int number1=10;
        int number2=90;

        int result=findGcd(number1, number2);
        System.out.println("GCD of" + " " + number1 + " " + "and" + " "+ number2 + " is " + result);
    }
    private static int findGcd(int number1,int number2){
        //base n1 %n2 == 0 return n2
        int remainder= number1 % number2;
        if(remainder==0){
            return number2;
        }
        //recursive definition
        //findGCD(n1,n2) = findGCD(n2, number1%number2)
        return findGcd(number2 ,remainder);






    }

}
