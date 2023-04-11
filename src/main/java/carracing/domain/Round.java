package carracing.domain;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class Round implements Comparable<Round> {
    private static final int FIRST_ROUND_VALUE = 1;
    private static final AtomicInteger INDEX = new AtomicInteger(FIRST_ROUND_VALUE);

    private Integer roundId;
    private List<Score> scores;
    private List<Record> records;

    public Round(List<Score> scores, List<Record> records) {
        this.roundId = INDEX.getAndIncrement();
        this.scores = scores;
        this.records = records;
    }

    @Override
    public int compareTo(Round other) {
        return Integer.compare(this.getRoundId(), other.getRoundId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Round round = (Round) o;
        return roundId == round.roundId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roundId);
    }

    public int getRoundId() {
        return roundId;
    }

    public List<Score> getScores() {
        return scores;
    }

    public List<Record> getRecords() {
        return records;
    }

}
