public class MainChallenge {
    public static void main(String[] args) {
        isSuper(" ", 3, 4);
    }

    public static void isSuper(String gender, int powers, int enemies) {
        if (gender.equals("female")) {
            System.out.println("A girl saves the day");
        } else if (gender.equals("male")) {
            System.out.println("A boy saves the day");

        } else if (gender.equals(" ")) {
            System.out.println("That's an empty string");
        }
            if (powers >= 2 && enemies > 3) {
                System.out.println("A formidable superhero");

            } else {
                System.out.println("HaHaHa you call that a Hero! try again");
            }

        }

        }

