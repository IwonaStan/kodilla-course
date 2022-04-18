public class Application {
    public static void main(String[] args) {

        ApplicationUser adam = new ApplicationUser("Adam",40.5, 178.0);
        adam.checkUser();
        ApplicationUser roman = new ApplicationUser("Roman",20.0, 154.0);
        roman.checkUser();

    }
}
