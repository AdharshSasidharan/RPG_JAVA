package net.javacodes.main;
import java.util.*;
public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	GameLogic.printHeading("Testing helper methods!!");
	GameLogic.anythingToContinue();
	GameLogic.clearConsole();
	int input=GameLogic.readInt("Enter 1, 2 or 3: ", 3);
	System.out.println("You chose number "+ input);
}
}
