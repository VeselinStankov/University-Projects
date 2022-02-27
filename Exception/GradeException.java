package Exception;

public class GradeException extends Exception {

    String message;

    public GradeException(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
}
