// Java practice absolute basics


public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Danielle");

        boolean isScary = false;
        if (!isScary){
            System.out.println("AH OMG WHAT IS THAT");
            System.out.println("Boo you clown, you've scared me");
        }
        int redFlag = 100;
        if (redFlag >= 100) {
            System.out.println("That man gotta go!");
        }

        int greenFlag = 105;
        if ((redFlag > greenFlag) && (greenFlag != 20)); {
            System.out.println("Wow that's a failing relationship");
            System.out.println("That man gon hurt you baby");
        }
        if (greenFlag == redFlag || redFlag < greenFlag);{
        System.out.println("Your man is green with red sprinkles");
    }
        boolean love = false;
        if (!love) {
            System.out.println("I am in love");
        }
        String trust = "I trust you";
        boolean trustWorthy = true;
        if (trustWorthy)
            System.out.println(trust);

        double  twenty = 20.00d;
        {
            double eight = 80.00d;
            double answer = (twenty + eight) * 100d;
            System.out.println("My values total are " + answer);
            double theRemainder = answer % 40.00d;
            System.out.println("The remainder is " + theRemainder);
            boolean noRemainder = true;
            System.out.println("No remainder " + noRemainder);;
            if (!noRemainder)
                System.out.println("You got some remainder");

        }


        }

    }


