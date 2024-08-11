package Array_medium;

public class stock_buy_sell {
    public static void main(String[] args) {
        int []arr = {7,1,5,3,6,4};
        int ans = maxPro(arr);
        System.out.println(ans);

    }
    public static int maxPro(int arr[]){
        int maxPro =0;
        int minPrice = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<minPrice){
                minPrice = arr[i];
            }
            int profit = arr[i]-minPrice;
            if (profit>maxPro){
                maxPro = profit;
            }

        }
        return maxPro;
    }
}