/*
Problem 1 - GCR Array Method Level 3
Create a program to find the shortest, tallest, and mean height of players present in a football team.
Hint => 
The formula to calculate the mean is: mean = sum of all elements/number of elements
Create an int array named heights of size 11 and get 3 digits random height in cms for each player in the range 150 cms to 250 cms
Write the method to Find the sum of all the elements present in the array.
Write the method to find the mean height of the players on the football team
Write the method to find the shortest height of the players on the football team 
Write the method to find the tallest height of the players on the football team
Finally display the results
Author : <Utakarsh Jain>
* Date : 24-09-2026
*/
class MeanHeight {

    public int findSum(int heights[]) { 
        int sum = 0;
        for (int height : heights) {
            sum += height; //Calculating the sum of heights
        }
        return sum; // Returning the sum of heights
    }
    public double findMean(int heights[]) {
        int sum = findSum(heights); //Calculating the sum of heights
        return (double) sum / heights.length; //Calculating the mean height
    }
    public int findShortest(int heights[]) {
        int shortest = heights[0]; //Initializing the shortest height
        for (int height : heights) { //Iterating through the heights
            if (height < shortest) {
                shortest = height; //Updating the shortest height
            }
        }
        return shortest; // Returning the shortest height
    }
    public int findTallest(int heights[]) {
        int tallest = heights[0]; //Initializing the tallest height
        for (int height : heights) {
            if (height > tallest) { //Checking if the current height is greater than the tallest height
                tallest = height; //Updating the tallest height
            }
        }
        return tallest; // Returning the tallest height
    }
    public static void main(String[] args) {
        MeanHeight obj = new MeanHeight();
        int heights[] = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150;
        }
        System.out.print("Heights of players: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        int sum = obj.findSum(heights);
        double mean = obj.findMean(heights);
        int shortest = obj.findShortest(heights);
        int tallest = obj.findTallest(heights);
        System.out.println("\nSum of heights: " + sum);
        System.out.println("Mean height: " + mean);
        System.out.println("Shortest height: " + shortest);
        System.out.println("Tallest height: " + tallest);
    }
}