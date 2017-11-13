package cc.somkiat.basicunittesting;

import java.util.regex.Pattern;

class NameValidation {

    private String resultMessage = "Name Validation Success";

    public boolean validate (String name){
        if (isEmpty(name) == true){
            resultMessage = "Name is empty";
        }
        else if (isNull(name) == true){
            resultMessage = "Name is null";
        }
        else if (isAlphabet(name) == true){
            resultMessage = "Name is alphabet";
        }
        else if (isContainNumber(name)  == true) {
            resultMessage = "Name contain number";
        }
        return true;
    }

    public boolean isEmpty(String name) {
        if(name.isEmpty()){
            return true;
        }
        return false;
    }

    public boolean isNull(String name) {
        if(name == null){
            return true;
        }
        return false;
    }

    public boolean isAlphabet(String name) {
        if(Pattern.matches("[a-zA-Z]+", name)){
            return true;
        }
        return false;
    }

    public boolean isContainNumber(String name) {
        if (name.matches(".*\\d+.*")){
            return true;
        }
        return false;
    }
}
