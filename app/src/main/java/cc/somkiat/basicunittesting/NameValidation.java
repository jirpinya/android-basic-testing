package cc.somkiat.basicunittesting;

import java.util.regex.Pattern;

class NameValidation {

    private String message = "Success name validate!!";

    public String validate (String name){
        try {
            isNull(name);
            isEmpty(name);
            isContainNumber(name);
            isSpecialsAlphabet(name);
            isLessThanFive(name);
            isMoreThanTwenty(name);
        }
        catch(Exception e) {
            return message;
        }
        return message;
    }

    public void isEmpty(String name) throws NameException{
        if(name.isEmpty()){
            message = "Name is empty.";
            throw new NameException(message);
        }
    }

    public void isNull(String name) throws NameException{
        if(name == null){
            message = "Name is null.";
            throw new NameException(message);
        }
    }

    public void isSpecialsAlphabet(String name) throws NameException{
        if(!Pattern.matches("[a-zA-Z]+", name)){
            message = "Name is specials alphabet.";
            throw new NameException(message);
        }
    }

    public void isContainNumber(String name) throws NameException{
        if (name.matches(".*\\d+.*")){
            message = "Name contain number.";
            throw new NameException(message);
        }
    }

    public void isLessThanFive(String name) throws NameException{
        if(name.length() < 5) {
            message = "Name is less than 5.";
            throw new NameException(message);
        }
    }

    public void isMoreThanTwenty(String name) throws NameException{
        if(name.length() > 20) {
            message = "Name is more than 20.";
            throw new NameException(message);
        }
    }
}