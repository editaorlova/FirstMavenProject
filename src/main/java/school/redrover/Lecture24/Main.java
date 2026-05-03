package school.redrover.Lecture24;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

//    static Map<DayOfWeek, Double> allBets = new HashMap<>();

    public static void main(String[] args) {
//        addBet(DayOfWeek.MONDAY, 100.0); //DayOfWeek.MONDAY - инстанс класса день недели
//        addBet(DayOfWeek.TUESDAY, 200.0);
//        addBet(DayOfWeek.MONDAY, 150.0);
//
//        System.out.println(getBets(DayOfWeek.MONDAY));
//
//        System.out.println(DayOfWeek.MONDAY.toString());
//
//        DayOfWeek monday = DayOfWeek.valueOf("MONDAY");
//        System.out.println(monday);

        System.out.println(RPS.ROCK.ordinal());
        System.out.println(RPS.PAPER.ordinal());
        System.out.println(RPS.SCISSORS.ordinal());

        System.out.println(Arrays.toString(RPS.values()));

        System.out.println(RPS.SCISSORS.beats(RPS.PAPER));
        System.out.println(RPS.SCISSORS.beats(RPS.ROCK));
        System.out.println(RPS.PAPER.beats(RPS.ROCK));
        System.out.println(RPS.PAPER.beats(RPS.SCISSORS));
        System.out.println(RPS.ROCK.beats(RPS.SCISSORS));
        System.out.println(RPS.ROCK.beats(RPS.PAPER));

        UsAddress  appleHq = new UsAddress(
                "1 Apple Circle", "Cupertino",
                State.CALIFORNIA, "94111"
        );
        System.out.println(appleHq.prettyPrint());
        System.out.println();

        System.out.println("Welcome to " + State.NEW_YORK.getName());
    }

//    static void addBet(DayOfWeek dayOfWeek, Double bet) {
//        Double currentSum = allBets.getOrDefault(dayOfWeek, 0.0);
//        allBets.put(dayOfWeek, currentSum + bet);
//    }
//
//    static Double getBets(DayOfWeek dayOfWeek) {
//        return allBets.get(dayOfWeek);
//    }
}
