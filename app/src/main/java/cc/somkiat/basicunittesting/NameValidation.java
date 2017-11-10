package cc.somkiat.basicunittesting;

class NameValidation {

    public boolean validate (String name){
        //return isEmpty(name) && isNull(name);
        return true;
    }
    public boolean isEmpty(String name) {
        if(name.isEmpty()){
            return false;
        }
        return true;
    }

}
