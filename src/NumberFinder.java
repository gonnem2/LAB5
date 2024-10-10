import java.util.regex.*;
import java.util.Scanner;


public class NumberFinder {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            String text = "12 -23 124.124 asaff15125";

            if (text.isEmpty()) {
                throw new TextLenghtException("Пусто");
            }

            Pattern pattern = Pattern.compile("\\d+\\.\\d+|\\d+|-\\d+\\.\\d+|-\\d+");
            Matcher matcher = pattern.matcher(text);

            if (!matcher.find()) {
                throw new NumbersNotFound("No numbers found in the text.");
            }

            matcher.reset();
            while (matcher.find()) {
                System.out.println(matcher.group());
            }

        } catch (TextLenghtException e) {
            System.out.println(e.getMessage());
        } catch (NumbersNotFound e) {
            System.out.println(e.getMessage());
        }
    }
}
