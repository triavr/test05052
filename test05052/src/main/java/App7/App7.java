package App7;
import java.util.function.Function;

public class App7 {
    public static void main(String[] args) {
        {
            // Функция, которая принимает число
            // и возвращает половину
            Function<Integer, Double> half = a -> a / 2.0; //Стрим, Лямбда 

            // Теперь утроим вывод половины функции

            half = half.andThen(a -> 3 * a);

            // применить функцию, чтобы получить результат

            System.out.println(half.apply(10));
        }
    }
}



