
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

