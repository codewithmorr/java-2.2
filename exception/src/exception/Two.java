package exception;

public class Two {

    public static void main(String[] args) {
        methodA();
    }

    public static void methodA() {
        try {
            throw new ClassNotFoundException();
        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
