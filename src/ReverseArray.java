public class ReverseArray {
    static int[] Reverse(int[] arr)
    {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i]=temp;

            i++;
            j--;
        }
        return arr;
    }
    static void main()
    {
        int[] arr = {1,2,3,4,5};
        int[] reverse = Reverse(arr);
        for(int i=0;i<reverse.length;i++) {
            System.out.println(reverse[i]);
        }
    }
}
