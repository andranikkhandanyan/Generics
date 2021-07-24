package am.aca.generics;

public class Main {

    public static void main(String[] args) {
	    SingleValue<Integer> obj1 = new SingleValue<>(10);
	    Integer value = obj1.getValue();
        System.out.println(value);
        obj1.printType();

	    SingleValue<String> strValue = new SingleValue<>("Contribution");
        System.out.println(strValue);
        strValue.printType();
        System.out.println();

        System.out.println("Paired full name: " + getFullName());
        System.out.println("Coordinates: " + getCoordinates());
        System.out.println();

        Stats<Integer> integerStats = new Stats<>(new Integer[]{1, 5, 10});
        System.out.println("Integer stats");
        System.out.println("average: " + integerStats.average());

        Stats<Double> doubleStats = new Stats<>(new Double[]{1.0, 5.0, 10.0});
        System.out.println("Double stats");
        System.out.println("average: " + doubleStats.average());

        System.out.println("Is same average ? " + integerStats.isSameAvg(doubleStats));
    }

    public static Pair<String, String> getFullName() {
        return new Pair<>("Awesome", "Fox");
    }

    public static Pair<Double, Double> getCoordinates() {
        return new Pair<>(40.1988876,44.4885518);
    }
}
