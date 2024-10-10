import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PairFinder {
    public static void main(String[] args) {
        String text = "aKkjhlSFj;jlkjASFlLKlkLFaKAPjapsfasfpjFS";
        Pattern pattern = Pattern.compile("([a-z])([A-Z])");
        Matcher matcher = pattern.matcher(text);
        StringBuilder resultText = new StringBuilder(text);
        int offset = 0;

        while (matcher.find()) {
            String replacement = "!" + matcher.group() + "!";
            resultText.replace(matcher.start() + offset, matcher.end() + offset, replacement);
            offset += 2;
        }

        System.out.println("Изменённая строка: " + resultText);
    }
}
