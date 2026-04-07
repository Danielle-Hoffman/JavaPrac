public class OverChal {
    //Create a method static void show(String text) that prints: Text: [text]
    //
    //Create a method static void show(int num) that prints: Number: [num]
    //
    //Create a method static void show(int num, String text) that prints the number and text together.

    //You cannot overload a method by only changing the return type.
    // Parameters are the only thing that truly distinguish overloaded methods.

    static void main(String[] args) {
    show("I love programming");
    show(21);
    show(21, "What a number that is!");
    show();
    }
    public static void show(String text){
        System.out.println(text);
    }

    public static void show(int num){
        System.out.println(num);
    }

    public static void show(int num, String text){
        System.out.println(num + " " + text);
    }

    public static void show(){
        System.out.println("Ain't nothing to show");
    }
}

