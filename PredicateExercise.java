import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExercise {
    static Predicate<Person> heightPredicate = (per) -> per.getGender().equals("Female");
    static Predicate<Person> genderPredicate = (check) -> check.getSalary() > 2000;
    static BiPredicate<String, Integer> check = (gender, height) -> gender.equals("Female") && height >= 120;
    static List<Person> list = PersonRepository.getAllPersons();

    public static void main(String[] args) {
        list.forEach((per) -> {
            if (heightPredicate.test(per))// based on requirement
                System.out.println(per);
        });
        System.out.println(" ");
        list.forEach((per) -> {
            if (genderPredicate.test(per))// based on requirement
                System.out.println(per);
        });

//        list.forEach((per) -> {
//            if (genderPredicate.and(heightPredicate).test(per))// based on requirement
//                System.out.println(per);
//        });
        System.out.println(" ");
        getGenderHeight();
    }

    static void getGenderHeight() {
        list.forEach((per) -> {
            if (check.test(per.getGender(), per.getHeight()))
                System.out.println(per);
        });

//        list.forEach((per) -> {
//            System.out.println(check.test(per.getGender(), per.getHeight()));
//        });
//        list.forEach((per) -> {
//            if(check.test(per.getGender(), per.getHeight())) {
//                System.out.println(per);
//            }
//        });

    }
}
