package src;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        IntStream.range(1, 10).boxed()
                .forEach(element -> {
                    IntStream.range(1, element)
                            .boxed()
                            .forEach(integer -> System.out.print("*"));
                    System.out.println();
                });
    }
}
