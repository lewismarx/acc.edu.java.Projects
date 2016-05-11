package project;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Created by lewis on 5/9/16.
 */
public class Langtonant extends JFrame{


        private JPanel planePanel;
        private static final int ZOOM = 4;

        public Langtonant(final boolean[][] plane){
            planePanel = new JPanel(){
                @Override
                public void paint(Graphics g) {
                    for(int y = 0; y < plane.length;y++){
                        for(int x = 0; x < plane[0].length;x++){
                            g.setColor(plane[y][x] ? Color.BLACK : Color.WHITE);
                            g.fillRect(x * ZOOM, y * ZOOM, ZOOM, ZOOM);
                        }
                    }
                    //mark the starting point
                    g.setColor(Color.GREEN);
                    g.fillRect(plane[0].length / 2 * ZOOM,
                            plane.length / 2 * ZOOM, ZOOM/2, ZOOM/2);
                }
            };
            planePanel.setSize(plane[0].length - 1, plane.length - 1);
            add(planePanel);
            setSize(ZOOM * plane[0].length, ZOOM * plane.length + 30);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setVisible(true);
        }

        public static void main(String[] args){
            if(args.length > 0) {
                if (args[0] != "-l") {
                    System.out.println("Using default size: 100x100");


                    System.err.println("no args used");
                    new Langtonant(runAnt(100, 100));
                    System.out.println("finished drawing");
                }
            }
            else {
                new Langtonant(runAnt(Integer.parseInt(args[1]), Integer.parseInt(args[1])));

                System.out.println("Finished Drawing");
            }
            }

        private static boolean[][] runAnt(int height, int width){
            boolean[][] plane = new boolean[height][width];
            int antX = width/2, antY = height/2;//start in the middle-ish
            int xChange = 0, yChange = -1; //start moving up
            while(antX < width && antY < height && antX >= 0 && antY >= 0){
                System.out.println(antX + " " + antY + " " + "Width" + width + "Height" + height);
                if(plane[antY][antX]){
                    //turn left
                    if(xChange == 0){ //if moving up or down
                        xChange = yChange;
                        yChange = 0;
                    }else{ //if moving left or right
                        yChange = -xChange;
                        xChange = 0;
                    }
                }else{
                    //turn right
                    if(xChange == 0){ //if moving up or down
                        xChange = -yChange;
                        yChange = 0;
                    }else{ //if moving left or right
                        yChange = xChange;
                        xChange = 0;
                    }
                }
                plane[antY][antX] = !plane[antY][antX];
                antX += xChange;
                antY += yChange;
            }
            return plane;
        }
    }






