package core;

import graphics.GUI;
import java.util.*;
public class Macro {
	
	public static void main(String[] args) {
		//Initialized a few basic variables
		Scanner input=new Scanner(System.in);
		//Prompts the user if they want to use a gui or a console
		System.out.println("Welcome to the MacroStorage program. Would you like to work with macros in the console or a GUI? (true=GUI, false=console)");
		boolean choice=input.nextBoolean();
		if(choice=true){
			GUI display = new GUI(400, 300);
		}
		else{
			
		}
	}
	
}
