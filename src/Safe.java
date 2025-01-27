

public class Safe {
    private String pinCode;

    public Safe(String pinCode) {
        this.pinCode = "0000"; 
    }

    public void pin(String pinCode) {
        this.pinCode = pinCode;
    }}