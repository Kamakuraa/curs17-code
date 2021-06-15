package ro.fasttrackit.curs17;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class JavaFunctionalInterfaces {
    public static void main(String[] args) {
        tryFunction("word", a -> a.length());
        tryFunction("wordmaillung", String::length);
        tryFunction("test123", word -> (int) word.charAt(0));

        String name = "Ana";
        trySup(() -> name);

        tryConsumer(price -> System.out.println(price + 100));
        tryConsumer(price -> System.out.println("pretule este " + price));
        tryPredicate(s -> s.length() > 10);
        tryPredicate(s -> s.charAt(0) == 'a');
        tryPredicate(s -> Character.isUpperCase(s.charAt(0)));
        tryPredicate(JavaFunctionalInterfaces::methodePredicated);

    }

    public static boolean methodePredicated(String word) {
        return word.length() > 5;
    }

    private static void tryPredicate(Predicate<String> stringPredicate) {
        System.out.println(stringPredicate.test("abc123"));
    }


    private static void tryConsumer(Consumer<Long> longConsumer) {
        longConsumer.accept(123L);

    }

    private static void trySup(Supplier<String> stringSupplier) {
        System.out.println("insideSuplier");
        System.out.println(stringSupplier.get());
    }

    public static void tryFunction(String word, Function<String, Integer> func) {
        System.out.println(word);
    }
}
