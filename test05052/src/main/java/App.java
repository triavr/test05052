import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
//вариант без Stream API
/*        int[] numbers = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};
        int count=0;
        for(int i:numbers){
            if(i > 0) count++;
        }
        System.out.println(count);*/

//вариант с Stream API
        long count2 = IntStream
                .of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5)
                .filter(w -> w > 0)  //Лямбда выражение
                .count();
        System.out.println(count2);

        List<Log> logs = List.of(
                new Log("Сибирская сосна", 10),
                new Log("Дуб монгольский", 30),
                new Log("Берёза карликовая", 5));
        logs.stream().map(x -> x.getType()).forEach(System.out::println);

          Stream.generate(() -> Math.random()) .limit(8).forEach(System.out::println);

    }

}
