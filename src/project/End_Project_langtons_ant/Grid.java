package project.End_Project_langtons_ant;

/**
 * Created by lewis on 5/11/16.
 */
public class Grid {
    boolean[][] grid;
    int height;
    int width;

    // constructor with user parameters
    public Grid(int height, int width) {
        this.height = height;
        this.width = width;
        grid = new boolean[height][width];
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                grid[h][w] = true;
            }
        }
    }

    // Methods
    // Getter and Setter for grid
    public boolean[][] getGrid() {
        return grid;
    }

    public void setGrid(boolean[][] grid) {
        this.grid = grid;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public boolean isWhite(int h, int w) {
        return grid[h][w];
    }

    protected void setWhite(int h, int w) {
        if (h < height && w < width)
            grid[h][w] = true;
    }

    protected void setBlack(int h, int w) {
        if (h < height && w < width)
            grid[h][w] = false;
    }

    public void printGrid() {
        for (int h = 0; h < 19; h++) {
            for (int w = 0; w < 19; w++) {
                if (isWhite(h, w)) {
                    System.out.printf("S", grid[h][w]);
                } else
                    System.out.printf("X", grid[h][w]);
            }
            System.out.println();
        }
    }

}
