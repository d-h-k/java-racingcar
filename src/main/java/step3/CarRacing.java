package step3;

import step3.model.Match;
import step3.present.InputPresent;
import step3.present.OutputPresent;

public class CarRacing {
    public static void main(String[] args) {
        InputPresent inputPresent = new InputPresent();
        OutputPresent outputPresent = new OutputPresent();

        int iterations = inputPresent.iterations();
        int participates = inputPresent.participates();
        Match match = new Match(participates, iterations);


        outputPresent.printResult(match.display());

    }
}
