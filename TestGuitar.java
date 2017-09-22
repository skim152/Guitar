/*


TestGuitar

Author: Shinyeob Km

  A private int data field named numStrings that defines the number of strings on the guitar. The default value should be 6.
  A private double data field named guitarLength that defines the length of the guitar in inches. The default value should be 28.2
  A private String data field named guitarManufacturer that defines the manufacturer of the guitar. The default value should be “Gibson”.
  A private Color data field named guitarColor that defines the color of the guitar. The default value should be Color.Red.
  A no argument constructor that creates a Guitar using the default number of strings, length, manufacturer and color.
  A constructor that creates a Guitar using a specified number of strings, length, manufacturer and color.
  Getter methods for all data fields.
  A playGuitar() method that returns a string representation of 16 randomly selected
musical notes of random duration. For example, the first part of the string returned might look like this: [A(2), G(3), B(0.5), C(1), C(1), D(0.25), ...]. You can assume one octave in the key of C where valid notes include A, B, C, D, E, F and G and duration values are .25, .5, 1, 2, and 4 representing sixteenth notes, eighth notes, quarter notes, half notes and whole notes, respectively.
  A toString() method that displays the number of strings, length, manufacturer and color in String format

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
