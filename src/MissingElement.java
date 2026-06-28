import java.util.ArrayList;
import java.util.List;

public class MissingElement {
//    static int SingleMissing(int[] arr,int n)
//    {
//        int sum = 0, count=0;
//        for(int i = 0; i < arr.length; i++)
//        {
//            sum = sum +arr[i];
//        }
//        for(int i = 1 ; i<=n ;i++)
//        {
//            count = count + i;
//        }
//        return count-sum;
//    }
    /*--------------------------------------------------------------*/


    static List<Integer> MissingWithDuplicates(int[] arr, int n)
    {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            int value = Math.abs(arr[i]);
            int position = value - 1;
            if (arr[position] > 0) {
                arr[position] = -arr[position];
            }
        }
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]>0)
                {
                    int valueIndex = i+1;
                    list.add(valueIndex);
                }
            }

        return list;
    }
    static void main() {
        int[] arr = new int[] {1,4,4,3,2,2};
        int n = 6;
        List<Integer> list = MissingWithDuplicates(arr,n);
        System.out.println(list);
    }
}

