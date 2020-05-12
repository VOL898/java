public class Demo {

    public static void main(String[] args) {

        Shape<Integer> integerObject = Shape.<Integer>create();
        Shape<Double> doubleObject = Shape.<Double>create();
        Shape<String> stringObject = Shape.<String>create();

        integerObject.setValue(21);
        doubleObject.setValue(2.1);
        stringObject.setValue("Twenty One");


        System.out.println(integerObject.getValue());
        System.out.println(doubleObject.getValue());
        System.out.println(stringObject.getValue());

    }

}
