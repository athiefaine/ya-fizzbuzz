import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FizzBuzzTest {

    @DisplayName("Should calculate the correct FizzBuzz")
    @ParameterizedTest(name = "FizzBuzz of {0} should print \"{1}\"")
    @CsvSource({
            "1, 1",
            "2, 2",
            "3, Fizz",
            "6, Fizz",
            "5, Buzz",
            "10, Buzz",
            "15, FizzBuzz",
            "45, FizzBuzz"
    })
    public void should_fizzbuzz_all(int number, String expectedResult) {
        Assertions.assertThat(FizzBuzz.of(number)).isEqualTo(expectedResult);
    }

}
