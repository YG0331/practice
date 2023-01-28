public class Maze {
    int y;
    int x;

    public Maze(int y, int x) {
        this.y = y;
        this.x = x;
    }

    @Override
    public String toString() {
        return (String.valueOf(y) + String.valueOf(x));
    }
}
