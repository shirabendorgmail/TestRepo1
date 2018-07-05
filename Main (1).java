import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        String challenge12 = "11111-1111";
        String challenge12b = "11111";
        System.out.println(challenge12.matches("[0-9]{5}(-[0-9]{4}){0,1}"));
        System.out.println(challenge12b.matches("[0-9]{5}(-[0-9]){0,1}"));



    }
}
