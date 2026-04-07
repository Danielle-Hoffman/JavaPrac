public class OverLoad {
    static void main(String[] args) {

        System.out.println(" New score is " + calculatescore("Tim ", 500));
        System.out.println(" New score is " + calculatescore(10));

        calculatescore(23);

        calculatescore();
    }

    public static int calculatescore(String playername, int score) {
        System.out.println(" Player " + playername + " scored " + score + " points ") ;
        return score * 1000 ;
    }
    public static int calculatescore(int score){
        return calculatescore("Anonymous", score);
    }
// Changing the data type doesn't change the signature so we cannot make it void
    // In order to overlaod a method you need to make it slightly unique everytime
    //  while keeping the data types the same
    public static int  calculatescore(){
        System.out.println("No player name and no score");
        return 0 ;
    }

}
