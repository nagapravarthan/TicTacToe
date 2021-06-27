import java.util.Scanner;

public class tictactoe {
	@SuppressWarnings("unused")
	private static char[] boardArray;
	private static int[] boardArrayIndex = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	// Returns the board in the form of a 1D array
	private static char[] Board() {
		char[] dummyBoardArray = new char[10];
		for (int i = 0; i < dummyBoardArray.length; i++) {
			dummyBoardArray[i] = '$';
		}
		return dummyBoardArray;
	}

	// boardArrayIndex array
	@SuppressWarnings("unused")
	private static boolean IsEmpty(int index) {
		if (boardArrayIndex[index] == 0) {
			return true;
		} else {
			return false;
		}
	}
		// Allows the user to input 'X' or 'O'
	
 
private static void ChooseLetter() {
	
	char firstCharacterInput = ' ';
	char computerCharacterInput = ' ';
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter input Mr. player");
	System.out.println("Enter 'X' or 'O' : ");
	firstCharacterInput = sc.next().charAt(0);
	
	switch (firstCharacterInput) {
	case 'X': {
		firstCharacterInput = 'X';
		computerCharacterInput = 'O';
		break;
	}
	case 'O': {
		firstCharacterInput = 'O';
		computerCharacterInput = 'X';
		break;
	}
	default:
	}
	
	System.out.println("User input is : " + firstCharacterInput + " and computer input is : " + computerCharacterInput);
	sc.close();
}


private static void ShowBoard(char[] boardArray) {
	System.out.println("THE BOARD");
	System.out.println(" ");
	System.out.print("|  ");
	for (char i = 1; i < 3; i++) {
		System.out.print(boardArray[i] + "  |  ");
	}
	System.out.print(boardArray[3] + "  ");
	System.out.print("|");
	System.out.println();
	System.out.println(" ");
	System.out.print("|  ");
	for (char i = 4; i < 6; i++) {
		System.out.print(boardArray[i] + "  |  ");
	}
	System.out.print(boardArray[6] + "  ");
	System.out.print("|");
	System.out.println();
	System.out.println(" ");
	System.out.print("|  ");
	for (char i = 7; i < 9; i++) {
		System.out.print(boardArray[i] + "  |  ");
	}
	System.out.print(boardArray[9] + "  ");
	System.out.println("|");
	System.out.print(" "); 
}
public static void main(String[] args) {		
	char[] boardArray = Board();
	ChooseLetter();
	ShowBoard(boardArray);
}
}

