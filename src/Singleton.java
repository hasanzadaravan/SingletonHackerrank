public class Singleton {
    private static Sing sing;

    Singleton() {

    }

    public static Sing getSingleton() {
        if (sing == null) {
            return new Sing();
        } else {
            return sing;
        }
    }

    public String getString(String string) {

        return "Hello I am a singleton! Let me say" + string + "to you";
    }
}
