import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("무작위의 서로 다른 세 정수로 이루어진 정수를 생성한다.")
class NumberUtilTest {

    @DisplayName("생성된 정수는 세 자리 수이다.")
    @Test
    void generate_number_is_three() throws Exception {
        // Given
        int number = NumberUtil.generateNumber();

        // When
        int numberLength = Integer.toString(number).length();

        // Then
        assertThat(numberLength).isEqualTo(3);
    }

    @DisplayName("생성된 정수는 서로 다른 무작위 정수로 이루어져있다.")
    @Test
    void generate_number_is_different() throws Exception {
        // Given
        int number = NumberUtil.generateNumber();

        // When
        int firstNumber = number / 100;
        int secondNumber = (number / 10) % 10;
        int thirdNumber = number % 10;

        // Then
        assertThat(firstNumber).isNotEqualTo(secondNumber);
        assertThat(firstNumber).isNotEqualTo(thirdNumber);
        assertThat(secondNumber).isNotEqualTo(thirdNumber);
    }
}