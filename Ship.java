public class Ship {

    private int x;
    private int y;
    boolean isAlive = true;

    public Ship() {
        x = 0;
        y = 0;
    }

    public Ship(int x, int y) {
        //this.x = x;
        //this.y = y;
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        if(x >= 0 && x <= 10) {
            this.x = x;
        }
        else {
            this.x = 0;
        }
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        if(y >= 0 && y <= 10) {
            this.y = y;
        }
        else {
            this.y = 0;
        }
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void shoot(int a, int b){

    }
}
