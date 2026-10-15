/*
Rotate Elements in a List
Rotate the elements of a list by a given number of positions.
Example:
Input: [10, 20, 30, 40, 50], rotate by 2 → Output: [30, 40, 50, 10, 20].
Name : Utakarsh Jain
Date: 14/10/2026

*/
package main.java.ListInterface;
import java.util.ArrayList;
import java.util.List;
public class RotateElement {
    static void RotateList (List<Integer> list , int position){ // rotate the elements of the list by a given number of positions
       int n = list.size(); 
       if(n==0){ // check if the list is empty
        return;
       }
       position = position % n;  // rotate the list by a given number of positions 
       for(int i =0;i<position;i++){ // iterate over the list
        int temp = list.get(0); // store the first element
        list.remove(0); // remove the first element
        list.add(temp); // add the first element to the end
       }
    }
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10); 
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Original List: " + list); 
        int positions = 2;
        RotateList(list, positions); // rotate the list by a given number of positions

        System.out.println("Rotated List: " + list);
    }
}
