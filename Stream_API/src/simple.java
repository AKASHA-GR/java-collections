import java.util.Arrays;
import java.util.List;

public class simple {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Akash", "Rahul", "Anil", "Aman");

        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.println(name);
            }
        }

        System.out.println("=============================================");


        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);
    }
}
