import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TextLengthException extends Exception {
    public TextLengthException(String message) {
        super(message);
    }
}

public class CorrectIp {
    public static void main(String[] args) {
        try {
            String ip = "192.168.1.1"; // Пример IP-адреса
            Pattern pattern = Pattern.compile("^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|" +
                    "[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\." +
                    "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
            Matcher matcher = pattern.matcher(ip);
            if (matcher.matches()) {
                System.out.println("Все верно");
            } else {
                throw new TextLengthException("Проверьте корректность введенного IP");
            }
        } catch (TextLengthException e) {
            System.out.println(e.getMessage());
        }
    }
}
