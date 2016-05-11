package project.End_Project_langtons_ant;

/**
 * Created by lewis on 5/11/16.
 */
public class Ant_Terminal {
    // Variables
    // Position of the ant
    int xPos;
    int yPos;
    // Which way is the ant facing
    String direction;
    Grid g;
    boolean isFinished;

    public Ant_Terminal(int xPos, int yPos, String direction, Grid g) {
        // Constructor
        this.xPos = xPos;
        this.yPos = yPos;
        this.direction = direction;
        this.g = g;
    }

    // Getter X Y Coordinates
    public int getXPos() {
        return xPos;
    }

    public int getYPos() {
        return yPos;
    }

    // Setter X Y Coordinates
    protected void setXPos(int xPos) {
        this.xPos = xPos;
    }

    protected void setYPos(int yPos) {
        this.yPos = yPos;
    }

    public String getDirection() {
        return direction;
    }

    protected void setDirection(String direction) {
        this.direction = direction;
    }

    public void run() {
        while (xPos >= 0 && yPos >= 0 && xPos < g.getWidth() && yPos < g.getHeight()) {
            System.out.println(xPos + "," + yPos + "," + "Facing " + direction + " Color " + g.isWhite(xPos, yPos));
            if (xPos == 0) {
                isFinished = true;
            } else if (xPos == g.getWidth()) {
                isFinished = true;
            } else if (yPos == 0) {
                isFinished = true;
            } else if (yPos == g.getHeight()) {
                isFinished = true;
            }

            // Determine Directions ...

            if (direction.equals("NORTH")) {
                if (g.isWhite(xPos, yPos)) {
                    g.setBlack(xPos, yPos);
                    setDirection("WEST");
                    xPos--; //move West
                } else {
                    g.setWhite(xPos, yPos);
                    setDirection("EAST");
                    xPos++; //move East
                }
            } else if (direction.equals("WEST")) {
                if (g.isWhite(xPos, yPos)) {
                    g.setBlack(xPos, yPos);
                    setDirection("SOUTH");
                } else {
                    g.setWhite(xPos, yPos);
                    setDirection("NORTH");
                }
                xPos--;
            } else if (direction.equals("SOUTH")) {
                if (g.isWhite(xPos, yPos)) {
                    g.setBlack(xPos, yPos);
                    setDirection("EAST");
                } else {
                    g.setWhite(xPos, yPos);
                    setDirection("WEST");
                }
                yPos--;
            }

            else if (direction.equals("EAST")) {
                if (g.isWhite(xPos, yPos)) {
                    g.setBlack(xPos, yPos);
                    setDirection("NORTH");
                } else {
                    g.setWhite(xPos, yPos);
                    setDirection("SOUTH");
                }
                xPos++;
            }
        }
    }
}
