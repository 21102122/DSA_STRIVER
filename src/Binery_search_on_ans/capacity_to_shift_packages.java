package Binery_search_on_ans;

public class capacity_to_shift_packages {
    public static void main(String[] args) {
        int[] weights = {5, 4, 5, 2, 3, 4, 5, 6};
        int d = 5;
        int ans = BruteForce(weights, d);
        int ans1 = optimal(weights, d);
//        System.out.println("The minimum capacity should be: " + ans);
        System.out.println("The minimum capacity should be: " + ans1);
    }
    public static int findDays( int weight[], int cap){
        int n =weight.length;
        int day =1;
        int load = 0;
        for (int i = 0; i <n ; i++) {
            if(load+weight[i]>cap){
                day+=1;
                load= weight[i];
            }else {
                load+=weight[i];
            }
        }
        return day;
    }
    public static int BruteForce(int weight[],int d){
        int n = weight.length;
        int sum =0;
        int maxi =Integer.MIN_VALUE;

        for (int i = 0; i <n ; i++) {
            sum+=weight[i];
            maxi=Math.max(weight[i],maxi );

        }
        for (int i = maxi; i <=sum ; i++) {
            if(findDays(weight,i)<=d){
                return i;
            }

        }
        return -1;
    }

//    bineary search
    public static int optimal(int[] weight, int d){

        int n = weight.length;
        int sum =0;
        int maxi =Integer.MIN_VALUE;

        for (int i = 0; i <n ; i++) {
            sum+=weight[i];
            maxi=Math.max(weight[i],maxi );

        }
        int start = maxi;
        int end = sum;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(findDays(weight,mid)<=d){
                end = mid-1;
            }else{
                start =mid+1;
            }
        }
        return start;
    }

}
