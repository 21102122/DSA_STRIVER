package Array_medium;

public class majority_element_moreThan_nBy2 {
    public static void main(String[] args) {

        int []arr={2,2,1,1,2,2};
        int ans = majorityOfElement(arr);
        System.out.println(ans);
    }
    public static int majorityOfElement(int []arr){
        int n = arr.length;
        int cnt=0;
        int el = 0;


//        Applying the algorithm
        for (int i = 0; i <n ; i++) {
            if (cnt== 0){
                cnt=1;
                el= arr[i];
            } else if (el==arr[i]) {
                cnt++;

            }else {
                cnt--;
            }
            // checking if the stored element
            // is the majority element;

        }
        int cnt1 =0;
        for (int i = 0; i < n; i++) {
            if (arr[i]==el){
                cnt1++;
            }
        }
        if (cnt1>(n/2)){
            return el;
        }
        return -1;
    }
}
