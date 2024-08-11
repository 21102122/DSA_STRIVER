package Binery_search_on_ans;
//https://takeuforward.org/binary-search/koko-eating-bananas/
//https://leetcode.com/problems/koko-eating-bananas/description/
public class koko_eat_banana {
    public static void main(String[] args) {

        int[] v = {7, 15, 6, 3};
        int h = 8;
        int ans = bruteForce(v, h);
        System.out.println("Koko should eat at least " + ans + " bananas/hr.(according brute force)");

        int ans1 = Optimal(v,h);
        System.out.println("Koko should eat at least " + ans1 + " bananas/hr.(according optimal)");
    }




//    Naive Approach(Brute-force):
//The extremely naive approach is to check all possible answers from 1 to max(a[]). The minimum number for which the required time <= h, is our answer.
//
//Algorithm:
//
//First, we will find the maximum value i.e. max(a[]) in the given array.
//We will run a loop(say i) from 1 to max(a[]), to check all possible answers.
//For each number i, we will calculate the hours required to consume all the bananas from the pile. We will do this using the function calculateTotalHours(), discussed below.
//The first i, for which the required hours <= h, we will return that value of i.
//calculateTotalHours(a[], hourly):
//
//a[] -> the given array
//Hourly -> the possible number of bananas, Koko will eat in an hour.
//We will iterate every pile of the given array using a loop(say i).
//For every pile i, we will calculate the hour i.e. ceil(v[i] / hourly), and add it to the total hours.
//Finally, we will return the total hours.


    public static int findMax(int v[]){
        int maxi = Integer.MIN_VALUE;
        int n = v.length;
        for (int i = 0; i <n ; i++) {
            maxi=Math.max(maxi,v[i]);
        }
        return maxi;
    }



    public static int calculateTotalHours(int v[], int hourly){
        int n = v.length;
        int totalHours = 0;

        for (int i = 0; i <n ; i++) {
            totalHours+=Math.ceil((double) (v[i])/(double)(hourly));

        }
        return totalHours;
    }

    public static int bruteForce(int v[],int h){
        int maxi = findMax(v);

//        find minimum value of k
        for (int i = 0; i <maxi ; i++) {
           int reqTime =calculateTotalHours(v,i);
           if(reqTime<=h){
               return i;
           }

        }

        return maxi;
    }




//    Optimal Approach(Using Binary Search):
//We are going to use the Binary Search algorithm to optimize the approach.
//
//The primary objective of the Binary Search algorithm is to efficiently determine the appropriate half to eliminate, thereby reducing the search space by half. It does this by determining a specific condition that ensures that the target is not present in that half.
//
//Now, we are not given any sorted array on which we can apply binary search. But, if we observe closely, we can notice that our answer space i.e. [1, max(a[])] is sorted. So, we will apply binary search on the answer space.
//
//Algorithm:
//First, we will find the maximum element in the given array i.e. max(a[]).
//Place the 2 pointers i.e. low and high: Initially, we will place the pointers. The pointer low will point to 1 and the high will point to max(a[]).
//Calculate the ‘mid’: Now, inside the loop, we will calculate the value of ‘mid’ using the following formula:
//mid = (low+high) // 2 ( ‘//’ refers to integer division)
//Eliminate the halves based on the time required if Koko eats ‘mid’ bananas/hr:
//We will first calculate the total time(required to consume all the bananas in the array) i.e. totalH using the function calculateTotalHours(a[], mid):
//If totalH <= h: On satisfying this condition, we can conclude that the number ‘mid’ is one of our possible answers. But we want the minimum number. So, we will eliminate the right half and consider the left half(i.e. high = mid-1).
//Otherwise, the value mid is smaller than the number we want(as the totalH > h). This means the numbers greater than ‘mid’ should be considered and the right half of ‘mid’ consists of such numbers. So, we will eliminate the left half and consider the right half(i.e. low = mid+1).
//Finally, outside the loop, we will return the value of low as the pointer will be pointing to the answer.
//The steps from 2-4 will be inside a loop and the loop will continue until low crosses high.
//
//Note: Please make sure to refer to the video and try out some test cases of your own to understand, how the pointer ‘low’ will be always pointing to the answer in this case. This is also the reason we have not used any extra variable here to store the answer.
//
//calculateTotalHours(a[], hourly):
//
//a[] -> the given array
//Hourly -> the possible number of bananas, Koko will eat in an hour.
//We will iterate every pile of the given array using a loop(say i).
//For every pile i, we will calculate the hour i.e. ceil(v[i] / hourly), and add it to the total hours.
//Finally, we will return the total hours.
    public static int Optimal(int v[],int h){
        int maxi = findMax(v);

        int n = v.length;
//        find minimium value of k

        int start =1;
        int end = findMax(v);
        while (start<=end){
            int mid = start+(end-start)/2;
            int requiredTime=calculateTotalHours(v,mid);
            if(requiredTime<=h){
                 end =  mid -1;

            }else{
                start= mid+1;
            }
        }
        return start;
    }



}
