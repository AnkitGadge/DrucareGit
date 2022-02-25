import java.util.Collections;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExercise {
    static Consumer<Person> c1 = (per) -> System.out.println(per.getGender().toUpperCase());
    static Consumer<Person> c2 = (per) -> System.out.println(per.getSalary() + " Before Giving Bonus");
    static Consumer<Person> c3 = (per) -> System.out.println(" After Giving Bonus " + per.getSalary() + 1000);
    static BiConsumer<Double, List<String>> salaryhobby = (Salary, hobbies) ->
            System.out.println("Salary: " + Salary + " " + "Hobby " + hobbies);
    static BiConsumer<String, Double> getNameSalary = (name, salary) ->
            System.out.println("Name: " + name + " " + "Salary: " + salary);


    static List<Person> list = PersonRepository.getAllPersons();

    public static void main(String[] args) {
        //1. Changing Gender of Each person to UpperCase
        list.forEach(c1);
        System.out.println(" ");
        list.forEach(c2);
        System.out.println(" ");
        list.forEach(c3);
        System.out.println(" ");
        setSalaryhobby();
        System.out.println(" ");
        getNameSalary();
        System.out.println(" ");
    }

    static void setSalaryhobby() {
        list.forEach((per) -> {
            salaryhobby.accept(per.getSalary(), Collections.singletonList(per.getHobbies().toString().toUpperCase()));
        });

    }

    static void getNameSalary() {
        list.forEach((per) -> {
            getNameSalary.accept(per.getName(), per.getSalary());
        });

    }
}
