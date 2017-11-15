package cc.somkiat.basicunittesting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class EmailValidation {

    private String message = "Success email validate!!";

    public String validate (String email){
        try {
            isNull(email);
            isEmpty(email);
            emailIsNotPattern(email);
        }
        catch(Exception e) {
            return message;
        }
        return message;
    }

    public void isNull(String email) throws EmailException{
        if (email == null) {
            message = "Email is null.";
            throw new EmailException(message);
        }
    }

    public void isEmpty(String email) throws EmailException{
        if (email.isEmpty()) {
            message = "Email is empty.";
            throw new EmailException(message);
        }
    }

    public void emailIsNotPattern(String email) throws EmailException{
        String expression = "^[\\w\\.]+@([\\w]+\\.)+[A-Z]{2,7}$";
        CharSequence inputString = email;
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputString);
        if (!matcher.matches()){
            message = "Email is not pattern.";
            throw new EmailException(message);
        }
    }
}
