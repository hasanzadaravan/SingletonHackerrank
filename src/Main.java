import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();

        Sing sing =new Sing();
        System.out.println(sing.getString(string));
        Sing sing1=new Sing();
        sing1.getString("sas");
    }
}

  class Sing {
    private static Sing sing;

    Sing() {

    }

    public static Sing getSingleton() {
        if (sing == null) {
            return new Sing();
        } else {
            return sing;
        }
    }

    public String getString(String string) {

        return "Hello I am a singleton! Let me say" + " "+string + " "+ "to you";
    }
}