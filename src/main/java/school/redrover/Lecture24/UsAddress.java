package school.redrover.Lecture24;

public record UsAddress(

        String street,
        String city,
        State state,
        String zip
) {
    public String prettyPrint() {
        return String.format("%s%n%s, %s %s", street, city, state.getCode(), zip);
    }
}

/*
1 Apple Circle
Cupertino, CA 94111
 */
