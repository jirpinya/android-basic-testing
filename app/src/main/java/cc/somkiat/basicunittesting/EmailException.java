package cc.somkiat.basicunittesting;

class EmailException extends Exception
{
    private String message;

    public EmailException(String message)
    {
        this.message = message;
        //super(message);
    }
}