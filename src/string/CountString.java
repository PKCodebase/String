package string;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountString {
    public static void main(String[] args) {
        String str = "HelloWorld";
        Map<Character, Long> freqMap = str.chars()
                .mapToObj(c -> (char) c) // Convert int to Character
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        freqMap.forEach((ch, freq) -> System.out.print(ch + "" + freq));
    }
}
