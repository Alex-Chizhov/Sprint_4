public class Praktikum {

    public static void main(String[] args) {
        // Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
        // и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.

        String name = "Тимоти Шаламе";
        Account acc = new Account(name);
        System.out.println(acc.checkNameToEmboss()); // true

    }

}