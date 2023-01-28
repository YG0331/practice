import java.util.Stack;

public class App2 {
    public static void main(String[] args) throws Exception {
        // Creating temp Stack
        Stack<Maze> stack_maze = new Stack<Maze>();

        int[][] maze = {
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
                { 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 1 },
                { 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1 },
                { 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1 },
                { 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1 },
                { 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1 },
                { 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1 },
                { 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }
        };
        int startx = 1;
        int starty = 1;
        int endx = 10;
        int endy = 8;
        int steps = 0;
        stack_maze.push(new Maze(1, 1));
        Maze check = stack_maze.peek();
        System.out.print(stack_maze.peek() + "->");
        Maze pop_maze = (new Maze(-1, -1));
        while (startx != endx || starty != endy) {
            int temp = 0;
            for (int i = 0; i < 1; i++) {

                if (maze[starty + 1][startx] == 0 && ((starty + 1) != check.y || startx != check.x)
                        && ((starty + 1) != pop_maze.y || startx != pop_maze.x)) {
                    check = stack_maze.peek();
                    starty += 1;
                    stack_maze.push(new Maze(starty, startx));
                    System.out.print(stack_maze.peek() + "->");
                    temp = 1;
                    steps++;
                    break;
                }
                if (maze[starty][startx + 1] == 0 && (starty != check.y || (startx + 1) != check.x)
                        && (starty != pop_maze.y || (startx + 1) != pop_maze.x)) {
                    check = stack_maze.peek();
                    startx += 1;
                    stack_maze.push(new Maze(starty, startx));
                    System.out.print(stack_maze.peek() + "->");
                    temp = 1;
                    steps++;
                    break;
                }
                if (maze[starty - 1][startx] == 0 && ((starty - 1) != check.y || startx != check.x)
                        && ((starty - 1) != pop_maze.y || startx != pop_maze.x)) {
                    check = stack_maze.peek();
                    starty -= 1;
                    stack_maze.push(new Maze(starty, startx));
                    System.out.print(stack_maze.peek() + "->");
                    temp = 1;
                    steps++;
                    break;
                }
                if (maze[starty][startx - 1] == 0 && (starty != check.y || (startx - 1) != check.x)
                        && (starty != pop_maze.y || (startx - 1) != pop_maze.x)) {
                    check = stack_maze.peek();
                    startx -= 1;
                    stack_maze.push(new Maze(starty, startx));
                    System.out.print(stack_maze.peek() + "->");
                    temp = 1;
                    steps++;
                    break;
                }
            }
            if (temp == 0) {
                pop_maze = stack_maze.pop();
                System.out.print(stack_maze.peek() + "->");
                Maze change = stack_maze.peek();
                starty = change.y;
                startx = change.x;
                steps++;
                // System.out.println(stack_maze.peek());
            }
            temp = 0;
        }
        System.out.print("總共走了" + steps + "步");

    }
}
