package t4;

class SpaceShip {

    private int myX;
    private int myY;
    private int myXmax;
    private int myYmax;
    private int myColor;
    private int defaultColor;
    
    public SpaceShip(int x, int y) {
        defaultColor = 0xfffb7df4; // pink
        myX = x;
        myY = y;
        myXmax = 600;
        myYmax = 300;
        myColor = defaultColor; 
    }

    public int getX() {
        return myX;
    }

    public int getY() {
        return myY;
    }

    public int getColor() {
        return myColor;
    }
    
    public void setColor(int color) {
        myColor = color;
    }
    
    public void move() {
        myX++;
        myY++;
    }
    
    public void print() {
        System.out.printf("Spaceship at (%d,%d), color %x\n", myX, myY, myColor);
    }
    
}
/*
class SpaceShipTest {
    public static void main(String[] args) {
        SpaceShip sr;
        SpaceShip ship = new SpaceShip(20,20);
        ship.print();
        ship.move();
        ship.print();
        ship.setColor(0xffff0000);
        ship.print();
       
    }
   }
 */