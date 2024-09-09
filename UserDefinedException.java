class invalidException extends Exception{
    public invalidException(String message){
        super(message);
    }
}
class AgeValidater{
    public void validator(int age) throws invalidException{
        if(age<18){
            throw new invalidException("You are underaged.");
        }
        else{
            System.out.println("access granted");
        }
    }
}

public class UserDefinedException {
    public static void main(String[] args){
        AgeValidater validate = new AgeValidater();
        try {
            validate.validator(14);
        } catch (invalidException e) {
            System.out.println("caught an exception: "+e.getMessage());
        }
    }
}
