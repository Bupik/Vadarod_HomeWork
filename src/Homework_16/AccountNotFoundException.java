package Homework_16;

public class AccountNotFoundException extends RuntimeException{

    //3. Создать своё непроверяемое исключение AccountNotFoundException. В этом классе добавьте поле String errorCode, переопределите гетеры и сетеры.

    private String errorCode;

    public AccountNotFoundException(String errorCode) {
        super("Account not found");
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}