package hw2;
/** Creates an array of 5 references to Rectangle objects, but only creates

 *  2 Rectangle objects. Assumes the definition of class Rectangle that is

 *  in a previous section of this module.

 */

class Main {

      public static void main(String args[]) {
    	  
    	  System.out.println("adding line to check git!");

Rectangle[] array;
            array = new Rectangle [5];

            array[0] = new Rectangle();

            array[0].setHeight(99);

            array[0].setWidth(45);

            array[1] = new Rectangle();

     

            for (int i = 0; i < array.length; i ++) {

                   System.out.println(array[i]);

//implicitly calls toString() unless array[i] is null
            }

      }

}

 

 
