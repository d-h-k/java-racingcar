package step3.model;

<<<<<<< HEAD
import java.util.function.UnaryOperator;

public class Car {
    private static final UnaryOperator<String> validateName = name -> {
        if (name.length() <= 5) {
            return name;
        }
        throw new IllegalArgumentException("자동차 이름은 5자를 초과할수 없다");
    };
    private final String name;

    public Car(String name) {
        this.name = validateName.apply(name);
=======
public class Car {
    private final String name;

    public Car(String name) {
        validateName(name);
        this.name = name;
    }

    private void validateName(String name) {
        if (name.length() > 5) {
            throw new IllegalArgumentException("자동차 이름은 5자를 초과할수 없다");
        }
>>>>>>> b8d8ece5fd2708917f8a34289618a29482ed2856
    }

    public String getName() {
        return this.name;
    }
}
