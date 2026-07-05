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

        ObjLongConsumer<String>  function21 = (s,x) -> System.out.println("21.ObjLongConsumer:"+s+" " +x);
        function21.accept("Salary",50000L);

        ObjDoubleConsumer<String> function22 = (s,x) -> System.out.println("22.ObjDoubleConsumer:"+s+" "+x);
        function22.accept("Marks",95.5);

        IntFunction<String> function23 = (x) -> "Values:" +x;
        System.out.println("23.IntFuction:"+function23.apply(5));

        LongFunction<String> function24 = (x) -> "Long:"+x;
        System.out.println("24.LongFuction:"+function24.apply(1234566666643L));

        DoubleFunction<String> function25 = (x) -> "Double:" +x;
        System.out.println("25.DoubleFunction:"+function25.apply(34.8));

        ToIntFunction<String> function26 = (s) -> s.length();
        System.out.println("26.ToIntFunction:"+function26.applyAsInt("Java"));

        ToLongFunction<String> function27 = (s) -> s.length() * 10L;
        System.out.println("27.ToIntFunction:"+ function27.applyAsLong("Java"));

        ToDoubleFunction<String> function28 = (s) -> s.length() * 2.5;
        System.out.println("28.ToIntFunction:"+ function28.applyAsDouble("Java"));

        IntToLongFunction function29 = x -> x * 100L;
        System.out.println("29.IntToLongFunction:"+function29.applyAsLong(5));

        IntToDoubleFunction function30 = x -> x * 1.5;
        System.out.println("30.IntToLongFunction:"+ function30.applyAsDouble(5));

        LongToIntFunction function31 = x -> (int)x ;
        System.out.println("31.IntToLongFunction:"+ function31.applyAsInt(100L));

        LongToDoubleFunction function32 = x -> x * 2.5;
        System.out.println("32.LongToDoubleFunction:"+ function32.applyAsDouble(20));

        DoubleToIntFunction function33 = x -> (int)x;
        System.out.println("33.DoubleToLongFunction:"+function33.applyAsInt(15.6));

        DoubleToLongFunction function34 = x -> (long) x;
        System.out.println("34.DoubleToLongFunction:"+function34.applyAsLong(99.7));

        IntUnaryOperator function35 = x -> x+10;
        System.out.println("35.IntUnaryOperator:"+function35.applyAsInt(5));

        LongUnaryOperator function36 = x -> x+100L;
        System.out.println("36.LongUnaryOperator:"+function36.applyAsLong(50));

        DoubleUnaryOperator function37 = x -> x+100L;
        System.out.println("37.LongUnaryOperator:"+function37.applyAsDouble(5.5));

        IntBinaryOperator function38 = (a,b) -> a+b;
        System.out.println("38.IntBinaryOperator:"+function38.applyAsInt(33,77));

        LongBinaryOperator function39 = (a, b) -> a*b;
        System.out.println("38.IntBinaryOperator:"+ function39.applyAsLong(50,60));

        DoubleBinaryOperator function40 = (a, b) -> a/b;
        System.out.println("38.IntBinaryOperator:"+ function40.applyAsDouble(10,1000));

        ToIntBiFunction<String,String> function41 = (a, b) ->a.length() + b.length();
        System.out.println("41.ToIntBiFunction:"+function41.applyAsInt("Hi","Java"));

        ToLongBiFunction<String,String> function42 = (a, b) ->a.length() + b.length()*10L;
        System.out.println("42.ToIntBiFunction:"+function42.applyAsLong("Hi","JDBC"));

        ToDoubleBiFunction<String,String> function43 = (a, b) ->a.length() + b.length();
        System.out.println("43.ToIntBiFunction:"+ function43.applyAsDouble("Hi","SQL"));

    }
}
