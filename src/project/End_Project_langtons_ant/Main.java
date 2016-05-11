package project.End_Project_langtons_ant;

/**
 * Created by lewis on 5/11/16.
 */
public class Main {

    public static void main(String[] args) {
        Grid grid = new Grid(20, 20);
        Ant_Terminal ant = new Ant_Terminal(10, 10, "NORTH", grid);
        ant.run();
        grid.printGrid();
    }
}
