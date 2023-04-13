package step3.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Racer {
    private static final Random random = new Random();
    private final List<Integer> scores;
    private final List<String> raceResults;

    public Racer(int roundCount) {
        this.scores = IntStream.rangeClosed(1, roundCount).boxed().map(integer -> randomScore()).collect(Collectors.toList());
        this.raceResults = resultCalculate();
    }

    private List<String> resultCalculate() {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < this.scores.size(); i++) {
            String currnetRet = getCurRet(i);
            result.add(currnetRet);
        }
        return result;
    }

    private String getCurRet(int curPos) {
        int length = 0;
        for (int j = 0; j < curPos; j++) {
            if (scores.get(j) > 4) {
                length++;
            }
        }
        return lengthToString(length);
    }

    private String lengthToString(int length) {
        String start = "";
        for (int i = 0; i < length; i++) {
            start += "-";
        }
        return start;
    }

    public List<String> getRaceResults() {
        return raceResults;
    }

    private Integer randomScore() {
        return random.nextInt(9);
    }
}
