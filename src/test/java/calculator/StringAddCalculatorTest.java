package calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringAddCalculatorTest {
    private static final Logger log = Logger.getLogger("StringAddCalculatorTest");
    private StringAddCalculator stringAddCalculator;
    @BeforeEach
    public void beforeEach() {
        stringAddCalculator = new StringAddCalculator();
    }

    /*
    투두리스트 목록
     */

    @DisplayName("")
    @Test
    public void run() {
        //given
        //when
        //then
    }

    @DisplayName("null 값 입력시 0을 반환해야 한다")
    @Test
    public void nullStringInput() {
        log.info("예시 : null >> 0");
        //given
        //when
        //then
    }

    @DisplayName("숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환한다")
    @Test
    public void 숫자_하나() {
        log.info("예시 : 1 >> 1");
        //given
        //when
        //then
    }

    @DisplayName("10 이상의 숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환한다")
    @Test
    public void 숫자_10이상_하나() {
        log.info("예시 : 10 >> 10");
        //given
        //when
        //then
    }

    @DisplayName("자릿수가 긴 숫자 하나를 문자열로 입력할 경우 해당 숫자를 반환한다")
    @Test
    public void 숫자_큰걸로_하나() {
        log.info("예시 : 100 >> 100");
        //given
        //when
        //then
    }



    @DisplayName("숫자 두개를 컴마(,) 구분자로 입력할 경우 두 숫자의 합을 반환한다.(예 : “1,2”)")
    @Test
    public void run() {
        //given
        //when
        //then
    }

    @DisplayName("구분자를 컴마(,) 이외에 콜론(:)을 사용할 수 있다. (예 : “1,2:3” => 6)")
    @Test
    public void run() {
        //given
        //when
        //then
    }

    @DisplayName("“//”와 “\\n” 문자 사이에 커스텀 구분자를 지정할 수 있다. (예 : “//;\\n1;2;3” => 6)")
    @Test
    public void run() {
        //given
        //when
        //then
    }

    @DisplayName("음수를 전달할 경우 RuntimeException 예외가 발생해야 한다. (예 : “-1,2,3”)")
    @Test
    public void run() {
        //given
        //when
        //then
    }

    @DisplayName("")
    @Test
    public void run() {
        //given
        //when
        //then
    }
}
