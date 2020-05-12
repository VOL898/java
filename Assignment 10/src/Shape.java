public class Shape<T> {

    private T value;

    private Shape(){

    }

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public static <T> Shape create() {
        return new Shape<T>();
    }

}