public class Main {
    public static void main(String args[]) {
        Player pl = new Player();
        pl.setWidth(3);
        pl.setHeight(3);
        pl.setX(1);
        pl.setY(1);
        Player pl1 =new Player();
        pl1.setWidth(1);
        pl1.setHeight(1);
        pl1.setX(6);
        pl1.setY(6);
        Wall wl = new Wall();
        wl.setX(16);
        wl.setY(15);
        wl.setHeight(20);
       System.out.println(pl.isCollidingWithPlayer(pl1));
       System.out.println(pl.isCollidingWithWall(wl));
    }
}
