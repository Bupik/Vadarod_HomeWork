package Homework_16;

public class NotEnoughMoneyException extends RuntimeException{

    //NotEnoughMoneyException. В этом классе добавьте поле String errorCode, переопределите гетеры и сетеры.

    private String errorCode;

    public NotEnoughMoneyException(String errorCode) {
        super("Not enough money");
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}