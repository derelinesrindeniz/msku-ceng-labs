public class FindPrimes {
    public static void main(String[] args) {
        int max = Integer.parseInt(args[0]);
        //System.out.println("Max number");
        //System.out.println(max);

        //1.For each number less than max
        for(int number= 2 ; number< max; number++){
            //1.1 xheck if the number is prime or not.
            int divisor=2;//Let divisor = 2;
            boolean isPrime = true; //Let isPrime= true;
            while(divisor < number && isPrime){
                //While divisor is less than number and isPrime is true
                if(number% divisor==0){
                    //If the number is divisible by divisor
                    isPrime= false; //isPrime = false


                }
                divisor++;//increament divisor;
            }
            if (isPrime){ //1.2 If the isPrime is (still) true
                System.out.print(number + " "); //1.2.1Print the number
            }

        }
    }
}
