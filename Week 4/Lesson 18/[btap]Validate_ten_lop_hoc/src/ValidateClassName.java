import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateClassName {
    private static final String CLASSNAME_REGEX = "[CAP]\\d{4}[GHIKLM]";

    public ValidateClassName(){}

    public boolean isValidate(String string){
        Pattern pattern = Pattern.compile(CLASSNAME_REGEX);
        Matcher matcher = pattern.matcher(string);
        return matcher.matches();
    }
}
