import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> notables = new ArrayList<>(List.of(
                new Person("Anatolii", "Petrov-Sidorov", 16),
                new Person("Natalii", "Tolkacheva-Kolosova", 33),
                new Person("Sergey", "Popov", 17),
                new Person("Oleg", "Boykov-Suslikov-Bob", 19)
        ));
        
        Predicate<Person> predicate = person -> person.getAge() < 18;
        notables.removeIf(predicate);
        Collections.sort(notables, new ComparePerson());
        System.out.println(notables);
    }
}
