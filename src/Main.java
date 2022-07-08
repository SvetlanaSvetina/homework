public class Main {
    public static void main(String[] args) {

        int ticketCost = 6000; // стоимость билета
        int ruble = 20; // количество рублей для одной бонусной милли
        int bonus = ticketCost / 20;

        if (ticketCost >= 20) {
            System.out.println("Вам начислено миль - " + bonus);
        } else {
            System.out.println("У вас нет миль");
        }

    }


}
