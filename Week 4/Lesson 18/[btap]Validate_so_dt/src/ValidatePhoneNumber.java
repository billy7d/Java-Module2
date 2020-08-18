import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static final String PHONENUMB_REGEX = "\\(\\d{2}\\)\\-\\(\\d{10}\\)" ;

    public ValidatePhoneNumber(){

    }

    public boolean isValid(String string){
        Pattern pattern = Pattern.compile(PHONENUMB_REGEX);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
