package basic;

public class exp20 {
    public static void main(String[] args) {

//        Write a Java program to create and display a unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there.
//Expected Output
//
//123
//124
//...
//
//431
//432
//Total number of the three-digit-number is 24



        int count = 0;

        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=4 ; j++) {
                for (int k = 1; k <4 ; k++) {
                    if (i!=j && j!=k && k!=i){
                        System.out.println(i*100+j*10+k);
                        count++;
                    }

                }

            }

        }
        System.out.println("Total number of unique three digit number:  "+count);
    }
}

//explaination of code
// Variable Declaration:
//int count = 0;


//Nested Loops:
//

//for (int i = 1; i <= 4; i++) {
//    for (int j = 1; j <= 4; j++) {
//        for (int k = 1; k <= 4; k++) {
//            // Ensure that all digits are unique
//            if (i != j && j != k && i != k) {
//                // Print the unique three-digit number
//                System.out.println(i * 100 + j * 10 + k);
//                // Increment the count of unique numbers
//                count++;
//            }
//        }
//    }
//}
//The three nested loops generate all possible combinations of the digits 1, 2, 3, and 4.
//The if condition ensures that all digits in each combination are unique.




//Printing and Counting:
//if (i != j && j != k && i != k) {
//    System.out.println(i * 100 + j * 10 + k);
//    count++;
//}
//If the digits are unique, the program prints the three-digit number and increments the count.