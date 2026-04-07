public class Loopy {
    static void main(String[] args) {
        int interest = calculateInterest(10000.0,2.00);
        System.out.println("R10 000 at 2% interest is " + interest);

        }

        }
        public static double calculateInterest(double amount, double interestrate){
            return (amount * (interestrate / 100));
        }
}
