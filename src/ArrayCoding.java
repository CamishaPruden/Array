import java.util.Scanner;

/**
 * 
 */

/**
 * @author c.pruden
 *
 */
public class ArrayCoding {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		int index = -1;
		int[] myArray = {18, 2, 1, 15, 9};
		int Search;
		
		for(int i = 0; i < myArray.length; i++){
			System.out.print(myArray[i] + "   ");
		}
		
		System.out.println();
		System.out.print("Which value do you want the index of?");
		Search = userInput.nextInt();
		
		for(int i = 0; i < myArray.length; i++){
			if(myArray[i] == Search){
				index = i;
			}
		}
		
		if(index == -1){
			System.out.println("That value is not in the array.");
		}else {
			System.out.println(Search + " is at index " + index);
		}
		
		userInput.close();
	}

}
