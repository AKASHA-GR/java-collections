package com.xworkz.lambda.runner;

import java.util.function.*;

public class FunctionPackageRunner {
    public static void main(String[] args) {

        Function<String,Integer> function1 = s -> s.length();
        System.out.println("1. Function:" + function1.apply("Hi,I am Akaza!"));

        BiFunction<Integer,Integer,Integer> function2 = (a,b) -> a + b;
        System.out.println("2. BIFunction:" + function2.apply(10, 20));

        UnaryOperator<Integer> function3 = (x) -> x * x;
        System.out.println("3. UnaryOperator:" + function3.apply(5));

        BinaryOperator<Integer> function4 = (a,b) -> a * b;
        System.out.println("4. BinaryOperator:" + function4.apply(5,4));

        Predicate<Integer> function5 = (x) -> x >10;
        System.out.println("5. Predicate:" + function5.test(15));

        BiPredicate<String,String> function6 = (a,b) -> a.equals(b);
        System.out.println("6. BiPredicate:" + function6.test("Java","Java"));

        Consumer<String> function7 = (s) -> System.out.println("7. Consumer:" + s);
        function7.accept("Hello");

        BiConsumer<String,Integer> function8 = (name,age) -> System.out.println("8. BiConsumer:"+name + " " +age);
        function8.accept("Akasha",23);

        Supplier<String> function9 = () -> "Lambda";
        System.out.println("9. Supplier:" + function9.get());

        BooleanSupplier function10 = () -> true;
        System.out.println("10. BooleanSupplier:" + function10.getAsBoolean());

        IntSupplier function11 = () -> 100;
        System.out.println("11. IntSupplier:" + function11.getAsInt());

        LongSupplier function12 = () -> 3456789876543L;
        System.out.println("12. LongSupplier:" + function12.getAsLong());

        DoubleSupplier function13 = () -> 999.9;
        System.out.println("13. DoubleSupplier:" + function13.getAsDouble());

        IntPredicate function14 = (x) -> x % 2 == 0;
        System.out.println("14. IntPredicate: " + function14.test(9));

        LongPredicate function15 = (x) -> x > 100;
        System.out.println("15. LongPredicate:" + function15.test(200));

        DoublePredicate function16 = (x) -> x > 11.5;
        System.out.println("16. DoublePredicate:" + function16.test(66.66));

        IntConsumer function17 = x -> System.out.println("17. IntConsumer: " + x);
        function17.accept(10);


        LongConsumer function18 = x -> System.out.println("18. LongConsumer: " + x);
        function18.accept(100L);


        DoubleConsumer function19 = x -> System.out.println("19. DoubleConsumer: " + x);
        function19.accept(20.5);

        ObjIntConsumer<String> function20 = (s, x) ->
                System.out.println("20. ObjIntConsumer: " + s + " " + x);
        function20.accept("Age", 22);





    }
}
