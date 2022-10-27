public class BonusMilesService {
    public int calculate(int ticketsPrice) {
        int result;
        if (ticketsPrice < 20) {
            result = 0;
        } else {
            result = ticketsPrice / 20;
        }
        return result;
    }
}
