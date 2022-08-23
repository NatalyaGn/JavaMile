public class main {
    public static void main(String[] args) {
        int ticket = 500; // цена билета
        int bonus = 20; // количество рублей для одной бонусной мили
        int bonusMile = ticket / bonus; //количество бонусных миль
        System.out.println(bonusMile + " бонусные мили");
    }

}
