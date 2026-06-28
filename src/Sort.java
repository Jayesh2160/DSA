public class Sort {
    int[] SortZerosAndOnes(int[] arr, int n)
    {
        int i = 0;
        int j = n-1;
        while(i<j)
        {
            if(arr[i]!=0 && arr[j]!=1)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return arr;
    }
    void main()
    {
        int[] arr = {1,0,0,1,1,0,0,1};
        int n = arr.length;
        int[] ans = SortZerosAndOnes(arr,n);
        for(int i=0;i<ans.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
