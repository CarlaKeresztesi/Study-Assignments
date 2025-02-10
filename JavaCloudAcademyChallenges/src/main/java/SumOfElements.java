
    //CHALLENGE: You will write a method called sumElements that takes an ArrayList of integers as a parameter.
    // The method should be able to handle an ArrayList of essentially any size. So, you won't always know
    // if there's a 3, 7, 15, or 150 element ArrayList that you're working with. Write the method so it can handle
    // any general ArrayList object. You will sum the elements of the ArrayList and then return the sum to the caller.
    // In the main method, you should test this method out and print out the sum that is returned.

    import java.util.ArrayList;

    public class SumOfElements {
        public static void main(String[] args) {

            ArrayList<Integer> someList = new ArrayList<>();

            someList.add(10);
            someList.add(22);
            someList.add(55);
            someList.add(121);

            int sum = sumElements(someList);

            System.out.println("Sum is " + sum);

        }//end of main

        public static int sumElements(ArrayList<Integer> list) {
           int sum = 0;
            for(int i = 0; i < list.size(); i++){ //list.size() returns all elements in a list
                sum += list.get(i); //list.get(i) -> retrieves the element at index i
            }//end for i

            return sum; //just to get the method to compile
        }//end sumElement

}
