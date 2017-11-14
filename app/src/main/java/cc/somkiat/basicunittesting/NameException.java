package cc.somkiat.basicunittesting;

class NameException extends Exception
{
    private String message;

    public NameException(String message)
    {
        this.message = message;
        //super(message);
    }

}