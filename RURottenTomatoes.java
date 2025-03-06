/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author:
 * Mychal Ortega
 * mlo77@scarletmail.rutgers.edu
 * mlo77
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes {

    public static void main(String[] args) {
        int max = 0;
        int sum = 0;
        int index = 0;
        //counter is 2 because args 0 and 1 are the numbers for rows(r) and columns(c)
        int counter = 2;
        //rows
        int r = Integer.parseInt(args[0]);
        //columns
        int c = Integer.parseInt(args[1]);
        //intialize array
        int review[][]  = new int[r][c];
        int sums[] = new int[c];
        //enter review numbers(args) into array
        for(int i = 0; i < r; i++){
            for(int j=0; j<c; j++){
                review[i][j] = Integer.parseInt(args[counter]);
                counter++;
            }
        }
            //add the values of each column into each each column index in the 1d array sums[]
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                sums[j]+= review[i][j];

            }
        }
            // checks for the highest value out of the sums array
        for(int i = 0; i < sums.length; i++){
            int x = sums[i];
            if(x > max){
                max = x;
                index = i;

        }

    }
        System.out.println(index);
        System.out.println(max);
		// WRITE YOUR CODE HERE
    }
	
}

