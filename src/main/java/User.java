public class User {
    public static void main (String[] args) {

        int average= 0;
        UserUser[] users = new UserUser[6];
        String[] names = {"Asia", "Basia", "Kasia", "Zosia", "Tomek", "Romek"};
        int[] ages = {20, 55, 40, 30, 35, 66};

        for(int i=0; i<users.length; i++) {
            users[i] = new UserUser();
            users[i].name = names[i];
            users[i].age = ages[i];
        }

        for(int i=0; i<users.length; i++) {
            average = average + users[i].age;
        }
        average = average / users.length;
        System.out.println("Srednia wieku: " +average);

        for (int i=0; i<users.length; i++) {
            if (users[i].age<average) {
                System.out.println("Imię: " + users[i].name+ " wiek: " +users[i].age);
            }
        }
    }
}
