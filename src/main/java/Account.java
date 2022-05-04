public class Account {

    private final String name;
    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        // в строке не меньше 3 и не больше 19 символов
        if (name.length() >= 3 && name.length() <= 19) {

            // в строке есть только один пробел
            int space_count = (int) name.chars().filter(character -> character == ' ').count();
            if (space_count == 1) {

                // пробел стоит не в начале и не в конце строки
                if (name.charAt(0) != ' ' && name.charAt(name.length() - 1) != ' ') {
                    return true;
                }
            }
        }
        return false;
    }


}
