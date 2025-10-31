package Homework_16;

public class Main {

    //6. В классе Main создайте пять счетов. Добавьте эти счета в банк (класс Bank)
    //7. В классе Main в блоке try catch выполните вызов метода по переводу денег со счёта на счёт.
    //При этом выполните обработку вашего выбрасываемого исключения в двух блоках catch
    //7.1 Если пришло исключение AccountNotFoundException то выведите в консоль «Откройте счёт в нашем банке для выполнения переводов»
    //7.2 Если пришло исключение NotEnoughMoneyException то выведите в консоль «Недостаточно средств для перевода»
    //7.3 В обоих случаях не пробрасывайте исключения дальше. Программа должна продолжать работу.
    //8. Добавьте блок finally. В блоке finally выведите в консоли «Спасибо, что воспользовались услугами банка»

    public static void main(String[] args) {

        Bank bank = new Bank();

        Account account1 = new Account(1, "BY001", "BYN", 1000.0);
        Account account2 = new Account(2, "BY002", "BYN", 500.0);
        Account account3 = new Account(3, "BY003", "BYN", 300.0);
        Account account4 = new Account(4, "BY004", "BYN", 700.0);
        Account account5 = new Account(5, "BY005", "BYN", 900.0);

        bank.addAccount(account1);
        bank.addAccount(account2);
        bank.addAccount(account3);
        bank.addAccount(account4);
        bank.addAccount(account5);

        try {
            bank.transferMoney("BY001", "BY002", 200.0);
            bank.transferMoney("BY003", "BY999", 100.0); // Ошибка: нет такого счёта
        } catch (AccountNotFoundException e) {
            System.out.println("Откройте счёт в нашем банке для выполнения переводов");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Недостаточно средств для перевода");
        } finally {
            System.out.println("Спасибо, что воспользовались услугами банка");
        }

        System.out.println("\n******************************************************\n");

        try {
            bank.transferMoney("BY003", "BY004", 500.0); // Ошибка недостаточно средств
        } catch (AccountNotFoundException e) {
            System.out.println("Откройте счёт в нашем банке для выполнения переводов");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Недостаточно средств для перевода");
        } finally {
            System.out.println("Спасибо, что воспользовались услугами банка");
        }
    }
}