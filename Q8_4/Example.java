package Q8_4;
import java.util.List;
import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        List<Double> doubles = List.of(1.1, 2.2, 3.3);
        List<Number> numbers = new ArrayList<>();
        addItems(doubles, numbers);
        System.out.println(numbers);
    }
    public static <T> void addItems(List<? extends T> src, List<? super T> dest){
        for(T t : src){
            dest.add(t);
        }
    }
}

