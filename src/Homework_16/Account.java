package Homework_16;

import java.util.Objects;

public class Account {

    //1. Создать класс счёт (Account). Поля идентификатор счёта (id), номер счёта, валюта счёт (String), сумма счёта (Double).
    //Выполнить переопределение equals и hashcode по двум полям (id и номер счёта), так как логически, эти поля будут уникальными для каждого счёта.

    private int id;
    private String accountNumber;
    private String currency;
    private double accountBalance;

    public Account(int id, String accountNumber, String currency, double accountBalance) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.accountBalance = accountBalance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public boolean equals(Object o) {

        if (o.getClass() != this.getClass()) {
            return false;
        }
        //Приведение типа Object к типу Employee
        Account account = (Account) o;
        //Сравнение идентификаторов
        return Objects.equals(this.id, account.id) &&
                Objects.equals(this.accountNumber, account.accountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, accountNumber);
    }
}