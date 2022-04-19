public class User {
    public static void main (String[] args) {

        int average= 0;
        UserUser[] users = new UserUser[4];
        String[] names = {"Asia", "Basia", "Kasia", "Zosia"};
        int[] ages = {20, 35, 40, 30};

        for(int i=0; i<users.length; i++) {
            users[i] = new UserUser();
            users[i].name = names[i];
            users[i].age = ages[i];
        }

        for(int i=0; i<users.length; i++) {
            average = average + users[i].age;
        }
        average = average / users.length;
        System.out.println("srednia " +average);

        for (int i=0; i<users.length; i++) {
            if (users[i].age<average) {
                System.out.println("Imię: " + users[i].name+ " wiek: " +users[i].age);
            }
        }
    }
}
