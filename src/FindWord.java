import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWord {

    public static void main(String[] args) {
        try {


            String flag = "a";
            String str = "Asfasfa sfvavx Asfacac sfasfasf ;safasf asavsvas";
            Pattern pattern = Pattern.compile("\\b[" + flag.toLowerCase() + flag.toUpperCase() + "][a-zA-Z]*");
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()){
                throw new TextLenghtException("Нет результатов");
            }
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }
        catch (TextLenghtException e){
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Некорректный ввод");
        }
    }
}
