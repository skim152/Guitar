/*
  Author: Shinyeob Kim
  What does this program do? :
  
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


import  java.awt.* ;
import java.util.Random;
import java.lang.reflect.Field;

public class Guitar{

// datafield
	private int numStrings;
	private double guitarLength ;
	private String guitarManufacturer ;
	private Color guitarColor ;

//not arg constructor Guitar
	public Guitar(){

		     numStrings = 6;
			 guitarLength = 28.2;
			 guitarManufacturer = "Gibson";
	         guitarColor = Color.red;

		}
//constructor
	public Guitar(int NumberOfStrings ,double length, String manufacturer, Color color ){

		numStrings = NumberOfStrings;
					 guitarLength = length;
					 guitarManufacturer = manufacturer;
	         guitarColor =color;


		}


//getNumStrings
	public int getNumStrings(){

		return numStrings;

		}


//getGuitarLength
	public double getGuitarLength(){

		return guitarLength;

		}

//getGuitarManufacturer
	public String getGuitarManufacturer(){

		return guitarManufacturer;

		}

//getGuitarColor
	public Color getGuitarColor(){

		return  guitarColor;

		}



//playGuitar
public String playGuitar( ) {

	int first,second;


	Random random = new Random();



		double[] DurationValues = {0.25,0.5,1,2,4};

		char[] character = {'A','B','C','D','E','F','G'};




		String output = "[";

		for (int i=0 ; i <= 15 ; i++) {

			first = random.nextInt(7);

			second = random.nextInt(5);

			output += character[first] + "(" + String.valueOf(DurationValues[second]) + ")";

			if (i < 15){

			output = output + ",";

	                       	}


		}

		return output += ']';



	}




// toString

public String toString(){

String infoString = "(numStrings="+getNumStrings()+", Length="+getGuitarLength()+

", manufacturer="+getGuitarManufacturer()+", color="+getNameReflection(getGuitarColor())+")";
	 return infoString;

	}


//getNameReflection to get name of color

public static String getNameReflection(Color colorParam) {
        try {

            Field[] field = Class.forName("java.awt.Color").getDeclaredFields();
            for (Field f : field) {
                String colorName = f.getName();
                Class<?> t = f.getType();
                if (t == java.awt.Color.class) {
                    Color defined = (Color) f.get(null);
                    if (defined.equals(colorParam)) {

                        return colorName.toUpperCase();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error... " + e.toString());
        }
        return " ";
    }


	}

