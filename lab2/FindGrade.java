public class FindGrade {
    public static void main(String args[]) {
        if (args.length == 1) {
            int score = Integer.parseInt(args[0]);
            if (score > 100 || score < 0) {
                System.out.println("its not volid");
            } else if (score >= 90) {
                System.out.println("your grade is A");
            } else if (score >= 80) {
                System.out.println("your grade is B");
            } else if (score >= 70) {
                System.out.println("your grade is C");
            } else if (score >= 60) {
                System.out.println("your grade is D");
            } else {
                System.out.println("your grade is F");
            }


        }
    }
}