public class App {
    public static void main(String[] args) throws Exception {
        User user = new User();

        System.out.println(user.onBuy());  
        System.out.println(user.onLock());  
        System.out.println(user.onBuy());   
        System.out.println(user.onDisable());
        System.out.println(user.onActive()); 
    }
}
