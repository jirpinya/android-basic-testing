package cc.somkiat.basicunittesting;

import java.util.regex.Pattern;

class NameValidation {

    private String status = "validate";
    private String message = "Success";

    public String validate (String name) throws NameException {
        isEmpty(name);
        isNull(name);
        isSpecialsAlphabet(name);
        isContainNumber(name);
        isContainSpace(name);
        isLessThanFive(name);
        isMoreThanTwenty(name);
        return status;
    }

    public String getStatus(){
        return status;
    }

    public String getMessage(){
        return message;
    }

    public void isEmpty(String name) throws NameException{
        if(name.isEmpty()){
            status = "invalidate";
            message = "Name is empty";
            throw new NameException(message);
        }
    }

    public void isNull(String name) throws NameException{
        if(name == null){
            status = "invalidate";
            message = "Name is null";
            throw new NameException(message);
        }
    }

    public void isSpecialsAlphabet(String name) throws NameException{
        if(!Pattern.matches("[a-zA-Z]+", name)){
            status = "invalidate";
            message = "Name is specials alphabet";
            throw new NameException(message);
        }
    }

    public void isContainNumber(String name) throws NameException{
        if (name.matches(".*\\d+.*")){
            status = "invalidate";
            message = "Name contain number";
            throw new NameException(message);
        }
    }


    public void isContainSpace(String name) throws NameException{
        if (name.contains(" ")){
            status = "invalidate";
            message = "Name contain space";
            throw new NameException(message);
        }
    }


    public void isLessThanFive(String name) throws NameException{
        if(name.length() < 5) {
            status = "invalidate";
            message = "Name is less than 5";
            throw new NameException(message);
        }
    }

    public void isMoreThanTwenty(String name) throws NameException{
        if(name.length() > 20) {
            status = "invalidate";
            message = "Name is more than 20";
            throw new NameException(message);
        }
    }
}