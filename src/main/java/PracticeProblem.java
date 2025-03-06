public class PracticeProblem {

	public static void main(String args[]) {

	}

	
public static boolean validIndex(int[] arr, int num){
	try{
		int num2 = arr[num];
		return true;
		
	}
	catch(ArrayIndexOutOfBoundsException e){
		return false;
	}
}

public static int divide(int num, int num2){
	try{
		return num/num2;
	}
	catch(ArithmeticException e){
		return 0;
	}
}

public static int safeConvertStringtoInt(String word){
	try{
		return Integer.parseInt(word);
	}
	catch(NumberFormatException e){
return 0;
	}
}
}
