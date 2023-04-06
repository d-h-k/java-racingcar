package step1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;


public class StringClassTest {
    private static final Logger log = Logger.getLogger("StringClassTest");

    @DisplayName("요구사항1 - \"1,2\"을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트를 구현한다.")
    @Test
    public void run1() {
        //given
        String preset = "1,2";
        //when
        //then
    }

    @DisplayName("요구사항1 - \"1\"을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다.")
    @Test
    public void run2() {
        //given
        String preset = "1";
        //when
        //then
    }

    @DisplayName("요구사항2 - \"(1,2)\" 값이 주어졌을 때 String의 substring() 메소드를 활용해 ()을 제거하고 \"1,2\"를 반환하도록 구현한다.")
    @Test
    public void run3() {
        //given
        String preset = "1";
        //when
        //then
    }

    @DisplayName("요구사항 3 - \"abc\" 값이 주어졌을 때 String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져오는 학습 테스트를 구현한다.")
    @Test
    public void run2342() {
        //given
        String preset = "";
        //when
        //then
    }


    @DisplayName("요구사항 3 - String의 charAt() 메소드를 활용해 특정 위치의 문자를 가져올 때 위치 값을 벗어나면 StringIndexOutOfBoundsException이 발생하는 부분에 대한 학습 테스트를 구현한다.")
    @Test
    public void run2324() {
        //given
        String preset = "";
        //when
        //then
    }


    @DisplayName("비기능 요구사항 정리")
    @Test
    public void run234() {
        log.info("JUnit의 @DisplayName을 활용해 테스트 메소드의 의도를 드러낸다.");
    }


}
