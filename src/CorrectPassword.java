import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CorrectPassword {
    public static void main(String[] args) {
        try{
        String password = "abAasdassd1";
        if (password.length() < 8 || password.length() > 16){
            throw new TextLenghtException("Пароль должен быть в диапазоне от 8 до 16 символов");
        }
        Pattern pattern = Pattern.compile("^(?=.*[A-Z]{1,16})(?=.*[0-9]{1,16})[A-Za-z0-9]{8,16}$");
        Matcher matcher = pattern.matcher(password);
        if (!matcher.find()){
            throw new TextLenghtException("Пароль должен содержать одну или более заглавных" +
                    " латинских букв и одну или более цифру");
        }

        System.out.println(matcher.group());

    }catch (TextLenghtException e){
            System.out.println(e.getMessage());
        }
}
}


