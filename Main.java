      // Import the ArrayList CLASS
// (from the java.util PACKAGE)
import java.util.ArrayList;

public class Main {


      //Return index of target
      public static int binarySearch(ArrayList<Integer> list, int target){
            //Set up "search area" bounds
            int left = 0;
            int right = list.size() - 1;

            while(left <= right){
                  //Set up a new "middle" each iteration
                  int middle = (left + right) / 2;
                  if (target < list.get(middle)){
                        right = middle - 1;
                  }
                  else if (target > list.get(middle)){
                        left = middle + 1;
                  }
                  else {
                        return middle; //found target
                  }
            }
            // Return -1 if target not found in list
            return -1;


      }
   public static void main(String []args) {
      // DECLARE an ArrayList object
      // Type <> is required, each ArrayList can hold one type of object
      ArrayList<String> buzzwords; 

      // DECLARE & CREATE an ArrayList
      // by calling the CONSTRUCTOR method
      ArrayList<String> shoppingList = new ArrayList<String>();

      // ArrayList can ONLY store OBJECTS!! 
      // so for int and double (primitive types)
      // you must use their WRAPPER CLASSES
      // Integer ad Double "wrap" primitives into OBJECTS
      // objects have methods, primitives don't 
      ArrayList<Integer> ages = new ArrayList<Integer>();
      ArrayList<Double> testScore = new ArrayList<Double>();
      // Java will handle the "wrapping" for you, 
      // this is called AUTOBOXING

      // Use the .add( obj ) METHOD to populate/fi;; list
      testScore.add(40.00);
      System.out.println(testScore); // prints [40.0]

      //7.2 Arraylist METHODS

      ArrayList<String> toBuy = new ArrayList<String>();

      // .add(obj) appends obj to END OF LIST

      toBuy.add("Plastic");
      toBuy.add("Gunpowder");
      toBuy.add("Adhesive");
      toBuy.add("Hostage");
      System.out.println("Shopping list");
      System.out.println(toBuy);

      // .size() returns int -> number of items

      System.out.println(toBuy.size() + " things left to buy!");

      //  .add(int index, obj) -> "INSERT" at index
      toBuy.add(0, "Chloroform");
      System.out.println(toBuy);
      // ALSO shifts over elements from that index on

      //.get(int index) returns an object of the same type as the list holds
      // like arra(int index)
      int lastIndex = toBuy.size() - 1;
      String lastElement = toBuy.get(lastIndex);
      System.out.println(lastElement);
      System.out.println(toBuy.get(3));

      // .set(int index, obj) REPLACES element at that index with the new obj
      // retruns the replaced element (same type as the list holds)
      String replacedElement = toBuy.set(3, "Gun");
      System.out.println(toBuy);
//Often, you won't need to store the return output
      toBuy.set(2, "Knife"); //like calling a Void method
      System.out.println(toBuy);


      String removedElement = toBuy.remove(1);
      System.out.println(toBuy);
      System.out.println("Did not need the plastic:" + removedElement);





      ArrayList<String> toDoList = new ArrayList<String>();
      toDoList.add("Take a bath");
      toDoList.add("Clean the knife");
      toDoList.add("Destroy evidence");
      toDoList.add("Capture Hostage");

      System.out.println(toDoList);

      String newElement = toDoList.set(1, "Reload the guns");
System.out.println(toDoList);
System.out.println(toDoList.size() + " Things to do before the cops catch me.");
System.out.println("I should really " + toDoList.get(1));

String deleted = toDoList.remove(0);
System.out.println(toDoList);


// 7.3 Traversing with Loops
ArrayList<Integer> bingoNumbers = new ArrayList<Integer>();
bingoNumbers.add(99);
bingoNumbers.add(29);
bingoNumbers.add(77);
bingoNumbers.add(13);

//Enhanced FOR-EACh LOOP
int total = 0;
int product = 1;
for (Integer num : bingoNumbers){
      total = total + num; 
      System.out.println("Sum of bingo numbers" + total);

      product *= num;


}
System.out.println("Product of bingo numbers " + product);
 // STANDARD FOR LOOP (indexed)
int sum = 0;
     // DIFFERENT from Arrays:
     //1. use ArrayList.size() instead of Array.length
     //2. use ArrayList.get(i) istead of Array[i]
      for (int i=0; i < bingoNumbers.size(); i++) {
            sum = sum + bingoNumbers.get(i);

      }
      System.out.println(sum);

      ArrayList<String> watchList = new ArrayList<String>();
      watchList.add("Death Note");
      watchList.add("JJBA part 4");
      watchList.add("Saiki K");
      watchList.add("Bleach");
      watchList.add("AOT");

      //Example: search & remove
      boolean found = false; //haven't searched yet
      int index = 0; // need index to use list methods
      String watchedShow = "AOT";
      while (index < watchList.size()){
            if (watchedShow.equals(watchList.get(index))){
                  watchList.remove(index);
                  found = true;
            }
            else {
                  index++;
            }
            
      }
      System.out.println(watchList);

      // Testing BINARY SEARCH method on a SORTED list
      ArrayList<Integer> gradeLevels = new ArrayList<Integer>();
      // Populate a list using a loop
      for (int i= 0; i <= 12; i++) {
            gradeLevels.add(i);
      }
      System.out.println("Grade Levels: ");
      System.out.println(gradeLevels);
      int indexOfTarget = binarySearch(gradeLevels, 9);
System.out.println("Index of Target: " + indexOfTarget);
 
   }
}


