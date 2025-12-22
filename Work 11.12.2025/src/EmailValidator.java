public class EmailValidator implements Validator {

    @Override
    public boolean isValid(String input){
        if(input.matches(".*@.*\\.*")) return true;
        else return false;
    }
}