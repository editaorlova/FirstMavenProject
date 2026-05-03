package school.redrover.Lecture24;

public enum State {
    CALIFORNIA("California", "CA"),
    NEW_YORK("New York","NY"),
    WASHINGTON("Washington","WA");

    private final String code;
    private final String name;

    State(String name, String code) {
        this.name = name;
        this.code = code;
    }
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
