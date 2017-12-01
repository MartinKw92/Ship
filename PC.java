import java.util.Random;

public class PC {

    private Ship ship;

    public void placeShip() {
        Random rand = new Random();
        ship.setX(rand.nextInt(11));
        ship.setY(rand.nextInt(11));
    }

    public void placeShip(int x, int y) {
        ship.setX(x);
        ship.setY(y);
    }

    public void calculateShot(int x, int y) {
        if(ship.getX() == x || ship.getY() == y) {
            ship.setAlive(false);
        }
    }

    //expected Ship pos: (0, 0)
    public PC(Ship ship) {
        this.ship = ship;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }
}
