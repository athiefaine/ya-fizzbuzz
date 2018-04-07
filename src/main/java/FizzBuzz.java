import javafx.util.Pair;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FizzBuzz {


    public static String of(int number) {
        return Optional.ofNullable(
                Stream.of(
                            new Pair<>(3, "Fizz"),
                            new Pair<>(5, "Buzz"))
                        .filter(pair -> number % pair.getKey() == 0)
                        .map(Pair::getValue)
                        .collect(Collectors.joining()))
                .filter(s -> !s.isEmpty())
                .orElse(String.valueOf(number));
    }
}
