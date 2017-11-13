package cc.somkiat.basicunittesting;

class NameValidation {

    private String resultMessage = "Name Validation Success";

    public boolean validate (String name){
        if (nameIsEmpty(name) == false){
            resultMessage = "Name is Empty";
        }
        else if (nameIsNull(name) == false){
            resultMessage = "Name is Null";
        }
        return true;
    }
    public boolean nameIsEmpty(String name) {
        if(name.isEmpty()){
            return false;
        }
        return true;
    }

    public boolean nameIsNull(String name) {
        if(name == null){
            return false;
        }
        return true;
    }

}
