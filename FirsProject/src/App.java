import test.EmailApp;

public class App {
    public static void main(String[] args) throws Exception {
       EmailApp em1 = new EmailApp("Ahmed", "Chowdhury");
       System.out.println(em1.showInfo());
    }
}
