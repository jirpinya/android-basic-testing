package cc.somkiat.basicunittesting;


import android.util.Patterns;

import java.util.regex.Pattern;

class EmailValidation {

    private String resultMessage = "Success";

    public boolean validate (String name){

        if (isEmpty(name) == true){
            resultMessage = "Email is empty";
        }
        else if (isNull(name) == true){
            resultMessage = "Email is null";
        }
        else if (isEmailPattern(name) == true){
            resultMessage = "Email validation";
        }
        return true;
    }

    public boolean isEmpty(String email) {
        if (email.isEmpty()) {
            return true;
        }
        return false;
    }
    public boolean isNull(String email) {
        if (email == null) {
            return true;
        }
        return false;
    }

    public boolean isEmailPattern(String email){
        final Pattern pattern = Patterns.EMAIL_ADDRESS;
        if (pattern.matcher(email).matches()) {
            return true;
        }
        return false;
    }
}
