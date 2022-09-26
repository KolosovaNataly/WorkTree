import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> notables = new ArrayList<>(List.of(
                new Person("Anatolii", "Petrov-Sidorov", 16),
                new Person("Natalii", "Tolkacheva-Kolosova", 33),
                new Person("Sergey", "Popov", 17),
                new Person("Oleg", "Boykov-Suslikov-Bob", 13)
        ));
        Collections.sort(notables, new ComparePerson());
        System.out.println(notables);
    }
}
