import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class ArmstrongNumbersTest {
	@Test
    public void test01() {
        //given
        int number = 123;

        //when & then
        assertThat(ArmstrongNumbers.isArmstrongNumber(number)).isFalse();
    }

    @Test
    public void test02() {
        //given
        int number = 0;

        //when & then
        assertThat(ArmstrongNumbers.isArmstrongNumber(number)).isFalse();
    }
    @Test
    public void test03() {
        //given
        int number = -5;

        //when & then
        assertThat(ArmstrongNumbers.isArmstrongNumber(number)).isFalse();
    }

    @Test
    public void test04() {
        //given
        int number = 153;

        //when & then
        assertThat(ArmstrongNumbers.isArmstrongNumber(number)).isTrue();
    }

    @Test
    public void test05() {
        //given
        int number = 1890;

        //when & then
        assertThat(ArmstrongNumbers.isArmstrongNumber(number)).isFalse();
    }

    @Test
    public void test06() {
        //given
        int number = 8208;

        //when & then
        assertThat(ArmstrongNumbers.isArmstrongNumber(number)).isTrue();
    }

    @Test
    public void test07() {
        //given
        int number = 63102;

        //when & then
        assertThat(ArmstrongNumbers.isArmstrongNumber(number)).isFalse();
    }

    @Test
    public void test08() {
        //given
        int number = 92727;

        //when & then
        assertThat(ArmstrongNumbers.isArmstrongNumber(number)).isTrue();
    }

}
