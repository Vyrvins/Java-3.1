public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketsPrice = 10_000;
        int bonusMiles = service.calculate(ticketsPrice);
        System.out.println(bonusMiles);
    }
}
