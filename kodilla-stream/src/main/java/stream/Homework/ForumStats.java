package stream.Homework;

import stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {

        double young = UsersRepository.getUsersList()
                .stream()
                .filter(a -> a.getAge()<=40)
                .mapToInt(p -> p.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println(young);

        double old = UsersRepository.getUsersList()
                .stream()
                .filter(a -> a.getAge()>40)
                .mapToInt(p -> p.getNumberOfPost())
                .average()
                .getAsDouble();
        System.out.println(old);
    }
}
