/*


filename: TestGuitar

author:

brief purpose of the program:
Guitars representing each representing a unique test case
and call each all of the getter methods along with the toString and




*/
import java.awt.Color;

public class TestGuitar {




			public static void main(String[] args) {


		Guitar test1 = new Guitar(7, 30.2, "Fender", Color.BLACK);
		Guitar test2 = new Guitar();
		Guitar test3 = new Guitar(9, 50.3, "johandark", Color.cyan);

// test1
 System.out.println("***Output***");
 System.out.println("toString(): "+test1.toString());

System.out.println("getNumStrings(): "+test1.getNumStrings());

System.out.println("getGuitarLength(): "+test1.getGuitarLength());

System.out.println("getGuitarManufacturer(): "+test1.getGuitarManufacturer());

System.out.println("getGuitarColor(): "+test1.getNameReflection(test1.getGuitarColor()));

 System.out.println("playGuitar(): "+test1.playGuitar()+"\n\n");

// test2
 System.out.println("***Output***");
 System.out.println("toString(): "+test2.toString());

System.out.println("getNumStrings(): "+test2.getNumStrings());

System.out.println("getGuitarLength(): "+test2.getGuitarLength());

System.out.println("getGuitarManufacturer(): "+test2.getGuitarManufacturer());

System.out.println("getGuitarColor(): "+test2.getNameReflection(test2.getGuitarColor()));

 System.out.println("playGuitar(): "+test2.playGuitar()+"\n\n");





// test3
 System.out.println("***Output***");
 System.out.println("toString(): "+test3.toString());

System.out.println("getNumStrings(): "+test3.getNumStrings());

System.out.println("getGuitarLength(): "+test3.getGuitarLength());

System.out.println("getGuitarManufacturer(): "+test3.getGuitarManufacturer());

System.out.println("getGuitarColor(): "+test3.getNameReflection(test3.getGuitarColor()));

 System.out.println("playGuitar(): "+test3.playGuitar());




	}







	}