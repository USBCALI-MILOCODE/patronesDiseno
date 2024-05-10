public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("PATRON SINGLETON");

        Singleton singleton = Singleton.getInstance();

        singleton.showMessage();
    }
}
