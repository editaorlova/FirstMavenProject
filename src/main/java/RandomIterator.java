import java.util.Iterator;
import java.util.Random;

public class RandomIterator implements Iterator<Integer> {

    Random random = new Random();

    private final int limit;

    public RandomIterator(int limit) {
        this.limit = limit;
    }

    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Integer next() {
        return random.nextInt(limit);
    }
}
