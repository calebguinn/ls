
public class BingeOnLastShip {
    public static void watchLastShip(LastShip lastShip) {
        if (!lastShip.isEmpty()) {
            lastShip.watchOneEpisode();
            watchLastShip(lastShip);
        }
    }

    public static void main(String[] args) {
        LastShip ls = new LastShip();
        watchLastShip(ls);
    }

}