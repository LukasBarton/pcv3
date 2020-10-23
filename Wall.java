public class Wall {
    private int x;
    private int y;
    private int width;
    private int height;

    public void setX(int value) {
        this.x = value;
    }

    public void setY(int value) {
        this.y = value;
    }

    public void setWidth(int value) {
        this.height = 1;
        this.width = value;
    }

    public void setHeight(int value) {
        this.width = 1;
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
}
