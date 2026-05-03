package school.redrover.Lecture24;

public enum RPS {
    ROCK {
        @Override
        public boolean beats(RPS other) {
            return other == SCISSORS;
        }
    },
    PAPER,
    SCISSORS;

    public boolean beats(RPS other) {
        return ordinal() - other.ordinal() == 1;
    }
}
