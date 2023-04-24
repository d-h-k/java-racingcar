package step3.model;

import step3.present.DisplayRaceVO;

<<<<<<< HEAD
=======
import java.util.ArrayList;
>>>>>>> b8d8ece5fd2708917f8a34289618a29482ed2856
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Match {

    private final List<Racer> racerList;
    private final List<Racer> winnerList;

    public Match(List<Car> participates, int iterations) {
<<<<<<< HEAD
        this.collect = IntStream.range(0, participates.size())
            .boxed()
            .map(integer -> new Racer(iterations, participates.get(integer)))
            .collect(Collectors.toList());
    }

    public List<DisplayRaceVO> display() {
        return collect.stream()
            .map(racer -> new DisplayRaceVO(new Result(racer.getResults()), racer.getCar()))
            .collect(Collectors.toList());
=======
        this.racerList = makeRacers(participates, iterations);
        this.winnerList = getWinnerList();
    }

    private static List<Racer> makeRacers(List<Car> participates, int iterations) {
        return IntStream.range(0, participates.size())
            .boxed()
            .map(integer -> new Racer(iterations, participates.get(integer)))
            .collect(Collectors.toList());
    }

    public List<DisplayRaceVO> display() {
        return racerList.stream()
            .map(racer -> new DisplayRaceVO(new Result(racer.getResults()), racer.getCar()))
            .collect(Collectors.toList());
    }

    public List<String> winnerDisplay() {
        return new ArrayList<>(winnerList).stream()
            .map(racer -> racer.getCar().getName())
            .collect(Collectors.toList());
    }

    private List<Racer> getWinnerList( ) {
        return racerList.stream()
            .filter(racer -> racer.isSamePosition(getMaxPosition()))
            .collect(Collectors.toList());
    }

    private int getMaxPosition() {
        return racerList.stream()
            .mapToInt(Racer::getFinalPosition)
            .max()
            .orElseThrow(() -> new RuntimeException("최대값을 구할 수 없습니팅"));
>>>>>>> b8d8ece5fd2708917f8a34289618a29482ed2856
    }

    public List<String> winnerDisplay() {
        //전체 점수를 가져온데
        List<Integer> positions = collect.stream().map(racer -> racer.getFinalPosition()).collect(Collectors.toList());
        //최고득점을 가져온다
        int maxPos = positions.stream().mapToInt(pos -> pos.intValue()).max().getAsInt();
        //최고득점인 사람을 찾는다
        List<String> collect1 = collect.stream().filter(racer -> racer.getFinalPosition() == maxPos).map(racer -> racer.getCar().getName()).collect(Collectors.toList());
        return collect1;
    }

}
