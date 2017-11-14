package cc.somkiat.basicunittesting;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class EmailValidation {

    private String status = "validate";
    private String message = "Success";

    public String validate (String email) throws EmailException{
        isEmpty(email);
        isNull(email);
        emailIsNotPattern(email);
        return status;
    }

    public String getStatus(){
        return status;
    }

    public String getMessage(){
        return message;
    }

    public void isEmpty(String email) throws EmailException{
        if (email.isEmpty()) {
            status = "invalidate";
            message = "Email is empty";
            throw new EmailException(message);
        }
    }
    public void isNull(String email) throws EmailException{
        if (email == null) {
            status = "invalidate";
            message = "Email is null";
            throw new EmailException(message);
        }
    }

    public void emailIsNotPattern(String email) throws EmailException{
        String expression = "^[\\w\\.]+@([\\w]+\\.)+[A-Z]{2,7}$";
        CharSequence inputString = email;
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputString);
        if (!matcher.matches()){
            status = "invalidate";
            message = "Email is not pattern";
            throw new EmailException(message);
        }
    }
}
