package project.End_Project_langtons_ant;

import java.util.Random;

public class Lang_Ant {
	int lines_on_X = 40;
	
	int length = 10000;
	int waiting = 100;
	int Colors = 3;
	//If you change the number of colors, then remember to change the direction of the colors. (In the enum Color)
	
	int sizeY = lines_on_X;
	int sizeX = 70;

	Color matrix[][] = new Color[sizeY][sizeX];
	Pair_Class<Integer, Integer> position = new Pair_Class<Integer, Integer>(sizeY/2, sizeX/2);


	Random ran = new Random();

	int direction = ran.nextInt(4);
	//1 = north, 2 = east, 3 = south, 4 = west
	
	public enum Color{
		empty(" ", 0),
		color1("|", -1),
		color2("\\",-1),
		color3("-", 1),
		color4("/", 1);
		
		private final String color_color;  
		private final int type_color;
		  
        Color(String acolor, int bcolor){  
            this.color_color = acolor; 
            this.type_color = bcolor;
        }  
        public String color_color(){  
            return this.color_color;  
        } 
        public int type_color(){
        	return this.type_color;
        }
	}
	

	private int change_direction(Color color){
		int Itmp = direction;
		if (color.type_color == -1){
			if(Itmp == 1){
				Itmp = 4;
			}
			else{
				Itmp -= 1;
			}
		}
		else if (color.type_color == 1){
			if(Itmp == 4){
				Itmp = 1;
			}
			else{
				Itmp += 1;
			}
		}
		else if (color.type_color == 0){
			//Don't change colors;
		}
		else{
			System.err.println("Something wrong with direction");
		}
		return Itmp;
	}
	
	private Color change_color(Color color, int colors){
		Color result = Color.color1;
		
			if(color == Color.color1){
				result = Color.color2;
			}
			else if (color == Color.color2 && colors >= 3){
					result = Color.color3;
			}
			else if (color == Color.color3 && colors >= 4){
						result = Color.color4;
			}
			else{
				result = Color.color1;
			}
		return result;
	}

	private Pair_Class<Integer, Integer> change_position(Pair_Class<Integer, Integer> current_position, int direction){
		Pair_Class<Integer, Integer> new_position = current_position;
		
		if (direction == 1){
			if (new_position.key != 0)
				new_position.key -= 1;
			else
				new_position.key = sizeY - 1;
		}
		if (direction == 2){
			if (new_position.value != sizeX - 1)
				new_position.value += 1;
			else
				new_position.value = 0;
		}
		if (direction == 3){
			if (new_position.key != sizeY - 1)
				new_position.key += 1;
			else
				new_position.key = 0;
		}
		if (direction == 4){
			if (new_position.value != 0)
				new_position.value -= 1;
			else
				new_position.value = sizeX - 1;
		}
		return new_position;
	}
	
	public static void wait (int millisecs){
		long t0, t1;
		t0 =  System.currentTimeMillis();
		do{
			t1 = System.currentTimeMillis();
			}
		while (t1 - t0 < millisecs);
		}
	
	public void main(){
		int n;
		initilize();
		for (n = 0; n < length; n++){
			System.out.println(n);
			ant();
			wait(waiting);
		}
		System.out.println("n");
		System.out.println(n);
		
		System.out.println("Direction");
		System.out.println(direction);
		
		System.out.println("PosX   PosY");
		System.out.println(position.key + "       " + position.value);
		clearConsole();
		
	}
	
	private void initilize()
	{
		
		for(int i = 0; i < sizeY; i++){
			String Stmp = "";
			for (int j = 0; j < sizeX; j++){
				matrix[i][j] = Color.empty;
				Stmp = Stmp + matrix[i][j].type_color;
			}
			System.out.println(Stmp);
			clearConsole();

		}
	}
	
	private void print_matrix()
	{
		for(int i = 0; i < sizeY; i++){
			String Stmp = "";
			for (int j = 0; j < sizeX; j++){
				if (i == position.key && j == position.value)
					Stmp = Stmp + "X";
				else
					Stmp = Stmp + matrix[i][j].color_color;
					
			}
			System.out.println(Stmp);
			clearConsole();

		}
	}
	
	private void ant(){
		Color Position_color = matrix[position.key][position.value];
		
		try{matrix[position.key][position.value] = change_color(Position_color, Colors);}
		catch (ArrayIndexOutOfBoundsException ex){System.err.println("change_color");}
		
		try{Position_color = matrix[position.key][position.value];}
		catch (ArrayIndexOutOfBoundsException ex){System.err.println("position_color");}
		
		try{direction = change_direction(Position_color);}
		catch (ArrayIndexOutOfBoundsException ex){System.err.println("change_direction");}
		
		try{position = change_position(position, direction);}
		catch (ArrayIndexOutOfBoundsException ex){System.err.println("change_position");}
		
		try{print_matrix();}
		catch (ArrayIndexOutOfBoundsException ex){System.err.println("print_matrix");}
		}
	public final static void clearConsole()
	{
		try
		{
			final String os = System.getProperty("os.name");

			if (os.contains("Windows"))
			{
				Runtime.getRuntime().exec("cls");
			}
			else
			{
				Runtime.getRuntime().exec("clear");
			}
		}
		catch (final Exception e)
		{
			//  Handle any exceptions.
		}
	}
	}

