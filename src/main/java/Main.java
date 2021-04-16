import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.IntConsumer;

public class Main {
    public static void main(String[] args) {
        /*String s = "AAAABBBCCXYZDDDDEEEFFFAAAAAABBBBBBBBBBBBBBBBBBBBBBBBBBBB";
        String result = "";
        Arrays.stream(s.chars().mapToObj(x -> String.valueOf((char) x))
                .reduce(result, (x, y) -> x.length() == 0 || x.substring(x.length() - 1).equals(y) ? x + y : x + '|' + y)
                .split("\\|"))
                .forEach(sequence ->{
                    System.out.print(sequence.charAt(0));
                    System.out.print(sequence.length());
                });*/
    }
}
