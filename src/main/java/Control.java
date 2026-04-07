public class Control {
    static void main(String[] args) {


//  if (value == 1){
//        System.out.println("Value is equal to 1");
//    } else if (value == 2) {
//        System.out.println("Value was 2");
//    }else {
//        System.out.println("Was not one or two");
//    }
        coffeeshop("M");
        System.out.println(getprice("s"));
        seasonfinder(12);
        System.out.println(calculate(2, 2,"+"));

        int switchValue = 0;

        switch (switchValue) {
            case 2:
                System.out.println("Value is 2");
                break;
            case 4:
                System.out.println("Value is 4");
                break;
            default:
                System.out.println("Ain't nothing in there ");
                break;
        }
    }
// 1. The Coffee Shop (Level: Easy)
//Write a program that takes a character representing a drink size and prints the price.
//
//'S' or 's': $2.50
//
//'M' or 'm': $3.50
//
//'L' or 'l': $4.50
//
//Default: "Invalid size"
//
//Tip: Remember that you can "stack" cases (e.g., case 'S': case 's':) so that both upper and lowercase letters trigger the same block of code.
//

    public static void  coffeeshop(String size){
        if (size == null){
            System.out.println("Invalid");
            return;
        }

        switch(size){
            case "s" :
            case "S":
                System.out.println("That'll be $2.50 ");
                break;
            case "m":
            case"M":
                System.out.println("That'll be $3.50");
                break;
            case"l":
            case "L":
                System.out.println("That'll be $4.50");
                break;
            default:
                System.out.println("Invalid size ");

        }


        }
        public static double getprice(String size){

            if (size == null){
                System.out.println("Invalid");
                return 0.00;
            }

            switch(size){
                case"s": return 2.50;
                case"m": return 3.50;
                case"l": return 4.50;
                default:
                    return 0.00;

            }
//2. The Season Finder (Level: Easy)
//Create a script where a user enters a month number (1-12) and the program outputs the season.
//
//12, 1, 2: Winter
//
//3, 4, 5: Spring
//
//6, 7, 8: Summer
//
//9, 10, 11: Autumn
//
//Default: "That’s not a month on this planet."

    }
        public static void seasonfinder(int num){
            switch (num) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Winter");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Spring");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Summer");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Autumn");
                    break;
                default:
                    System.out.println("That's not a month on this planet gang it goes from 1 - 12 only");
                    break;
            }

//Ready for the "Final Boss" of Switch exercises?
//        Try creating a method called calculate(double n1, double n2, String operator).
//
//Input: Two numbers and a String like "+", "-", "*", or "/".
//
//        Action: Use a switch on the operator string.
//
//Math: Return the result of the calculation.
//
//The Twist: If the operator is "/", check if n2 is 0. If it is, return 0 (or print an error) so the program doesn't explode!


            }
            public static int calculate(int n1, int n2, String operator) {
            if (operator == null){
                    System.out.println("The operator cannot be Null");
                return 0;
            }

                switch (operator) {
                    case "*":
                        return n1 * n2;
                    case "%":
                        return n1 % n2;
                    case "/":
                        if (n2 == 0) {
                            System.out.println("Error: Division Error");
                            return 0;
                        }
                        return n1 / n2;

                    case "+":
                        return n1 + n2;
                    case "-":
                        return n1 - n2;
                    default:
                        return 0;


                }
            }

        }






