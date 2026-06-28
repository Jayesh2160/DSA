public class ShiftRightByOne {
    int[] ShiftArray(int[] arr, int n)
    {
        int temp=arr[n-1];
        for(int i=n-1;i>0;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        return arr;
    }
    int[]  ShiftArrayByK(int[] arr, int n, int k)
    {
        int[] srs = new int[k];
        int j = n-k;
        //int temp=6;
        for(int i=0;i<srs.length;i++)
        {
            if(j<n)
            srs[i]=arr[j++];
        }
        for(int i=n-k-1;i>=0;i--)
        {
            //if(temp<n)
            arr[n-1]=arr[i];
        }
        for(int i=0;i<srs.length;i++)
        {
            arr[i]=srs[i];
        }
        return arr;
    }
/*-------------------------------------------------------*/
    int[] ShiftArrayByK2(int[] arr, int n, int k)
    {
        int[] srs = new int[k];
        int[] srs2 = new int[n-k];
        int j = n-k;
        int c=0;
        //int temp=6;
        for(int i=0;i<srs.length;i++)
        {
            if(j<n)
                srs[i]=arr[j++];
        }

        System.arraycopy(arr, 0, srs2, 0, srs2.length);
        for(int i=0;i<n-1;i++)
        {
            if(i<srs.length)
            arr[i]=srs[i];
            else{
                if(c<=srs2.length)
                arr[i]=srs2[c++];
            }

        }
        return arr;
    }
    void main()
    {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int n = arr.length;
        int k = 2;
        int[] ans = ShiftArrayByK2(arr,n,k);
        for(int i=0;i<n;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
