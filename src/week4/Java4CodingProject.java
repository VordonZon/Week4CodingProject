package week4;

public class Java4CodingProject {

	public static void main(String[] args) {
	
	//1.
		//Create a new int of ages and subract the last element from the first
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		System.out.println(ages[ages.length - 1] - ages[0]);
		
		//This is a new int array showing that the algorithm is dynamic
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 93, 45};
		System.out.println(ages2[ages2.length - 1] - ages2[0]);
		
		//This code finds the average age in ages2
		int averageAge = 0;
		for(int num : ages2) {
			averageAge += num;
		}
		averageAge = averageAge / ages2.length;
		System.out.println("Average Age: " + averageAge);
	//-----------------------------------------
	//2.
		//String array with names
		String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		
		//Finds average length of names in array
		int averageNum = 0;
		for(String name : names) {
			averageNum += name.length();
		}
		averageNum /= names.length;
		System.out.println("Average name length: " + averageNum);
		
		//Concatenates all names together in a single string
		StringBuilder newName = new StringBuilder();
		for(String name : names) {
			newName.append(name);
			newName.append(" ");
		}
		System.out.println(newName);
	//-------------------------------------------
		
	//3. access the last element in any array: array[array.length - 1]
		System.out.println("Last Element: " + names[names.length - 1]);
	
	//4. access first element in an array: array[0]
		System.out.println("First Element: " + names[0]);
	
	//5. Creates new int array and adds the lengths of each string into nameLengths[] from names[]
		int[] nameLengths = new int[names.length];
		for(int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
			System.out.println("Name Length: " + nameLengths[i]);
		}
		
	//6. finds sum of all values in nameLengths[]
		int sum = 0;
		for(int length : nameLengths) {
			sum += length;
		}
		System.out.println("Sum of lengths: " + sum);
		
	//7. Calls a method and Prints HelloHelloHello
		System.out.println(repeatString("Hello",3));
	
	//8. Returns a full name given a first and last name
		System.out.println(createFullName("Jim","Jam"));
		
	//9. Checks if a given int[] is greater than 100
		int[] array100 = {50,5,10,36};
		System.out.println(isGreaterThan100(array100));
	
	//10. Finds the average of doubles in an array
		double[] doubleArr1 = {12.567,54.00,34.44,60.01};
		System.out.println("Double Average: " + averageDouble(doubleArr1));
		
	//11. Prints true if the elements from the first double[] greater than the second double[]
		double[] doubleArr2 = {55.30,45.556,2.00,55.02};
		System.out.println("Is first array larger? " + compareDoubleArr(doubleArr1,doubleArr2));
		
	//12. Prints true if the boolean is true and double is greater than 10.50
		System.out.println("Will Buy Drink? " + willBuyDrink(true,11.00));
	
	//13. Returns a list of names concatenated with a last name
		String[] firstNames = {"Ted", "Greg", "Alan", "Peter"};
		createSiblingNames(firstNames,"Henscheid");
	}
	
	//7. Creates a new stringbuilder and appends an input string together int amount, returns string
	public static String repeatString(String string, int num) {
		StringBuilder newString = new StringBuilder();
		for(int i = 1; i <= num; i++) {
			newString.append(string);
		}
		return newString.toString();
	}
	//8. Creates StringBuilder and concatenates first and last String with a space between, returns string
	public static String createFullName(String first, String last) {
		StringBuilder name = new StringBuilder();
		name.append(first + " " + last);
		return name.toString();
	}
	//9. Adds elements of int[] and returns true if sum is > 100
	public static boolean isGreaterThan100(int[] arr) {
		int sum = 0;
		for(int num : arr) {
			sum += num;
		}
		return sum > 100;
	}
	//10. Iterates through the doubles of an array and returns the average
	public static double averageDouble(double[] arr) {
		double average = 0;
		for(double num : arr) {
			average += num;
		}
		return average /= arr.length;
	}
	//11. Iterates through both arrays separately and finds if arr1 average is greater than arr2 average
	public static boolean compareDoubleArr(double[] arr1 ,double[] arr2) {
		double average1 = 0;
		double average2 = 0;
		
		for(double num : arr1) {
			average1 += num;
		}
		for(double num : arr2) {
			average2 += num;
		}
		
		average1 /= arr1.length;
		average2 /= arr2.length;
		return average1 > average2;
	}
	
	//12. Returns true if its hot outside and there is enough money
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;
	}
	//13. Takes a list of first names and a last name and return a full name for each first name
	public static String[] createSiblingNames(String[] firstNames, String lastName) {
		
		//loops through each first name and adds first name and last name to new string array
		//made this method to prevent having to type my family last name so many times
		String[] fullNames = new String[firstNames.length];
		for(int i = 0; i < firstNames.length; i++) {
			fullNames[i] = firstNames[i].concat(" " + lastName);
			System.out.println("Sibling FullName " + fullNames[i]);
		}
		return fullNames;
	}
}
