public class Player {
    private int x;
    private int y;
    private int width;
    private int height;

    public void setX(int value){
      this.x = value;
    }
    public void setY(int value){
        this.y = value;
    }
    public void setWidth(int value){
        this.width = value;
    }
    public void setHeight(int value){
        this.height = value;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isCollidingWithPlayer(Player player){
        if (player.getX() < this.x + this.width && player.getX() + player.getWidth() > this.x && player.getY() < this.y + this.height && player.getY() + player.getHeight() > this.y){
        return true;
        }
        return false;
    }
    public boolean isCollidingWithWall(Wall wall){
        if (wall.getX() < this.x + this.width && wall.getX() + wall.getWidth() > this.x && wall.getY() < this.y + this.height && wall.getY() + wall.getHeight() > this.y){
        return true;
        }
        return false;
    }
}