package am.aca.generics;

public class Stats<T extends Number> {

    private final T[] stats;

    public Stats(T[] stats) {
        this.stats = stats;
    }

    public double average() {
        double sum = 0.0;
        for (T value : stats) {
            sum += value.doubleValue();
        }

        return sum / stats.length;
    }

    boolean isSameAvg(Stats<?> ob) {
        return average() == ob.average();
    }
}
