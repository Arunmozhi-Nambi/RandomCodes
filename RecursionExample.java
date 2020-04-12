import java.io.*;
import java.util.*;
import java.util.function.Predicate;

class RecursionExample{

public static void main(String args[]) {
    Predicate<String> startsWithA = (text) -> text.startsWith("A");
    Predicate<String> endsWithX = (text) -> text.endsWith("x");

    Predicate<String> compose = startsWithA.and(endsWithX);

    String input = "A Hardworking person should relax";
    boolean result = compose.test(input);

    System.out.println("result:"+result);

}
}