package am.aca.generics;

public class SingleValue<T> {

    private T value;

    public SingleValue(T value) {
        this.value = value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void printType() {
        System.out.println(value.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
