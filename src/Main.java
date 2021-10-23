public class Main {
    public static void main(String[] args) {
        int clientAccount = 100;
        int replenishment = 900;
        int bonus = replenishment / 100;
        int total;
        if (replenishment >= 1000) {
            total = clientAccount + replenishment + bonus;
            System.out.println("На счету " + total);
            System.out.println("Бонус " + bonus);
        } else {
            total = clientAccount + replenishment;
            System.out.println("На счету " + total);
        }
    }
}
