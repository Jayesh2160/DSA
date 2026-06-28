import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoDArrays {

    public List<Integer> sum(int[][] arr)
    {
        List<Integer> list = new ArrayList<>();
        int n = arr.length;//rows
        int m = arr[0].length;//columns

        for(int i=0;i<n;i++)
        {
            int sum = 0;
            for(int j=0;j<m;j++)
            {
                int value = arr[j][i]; //I just switched the position of i and j to
                //return sum row wise and columnwise
                sum+=value;
            }
            list.add(sum);
        }
        return list;
    }
    /*---------------------------------------------------------------------*/
    public List<Integer> waveMatrix(int[][] arr)
    {
        List<Integer> list = new ArrayList<>();
        int n = arr.length;
        int m = arr[0].length;
        int count = 0;
        for(int j=0;j<n;j++)
        {
            if((j & 1) == 0)
            {
                for(int i=m-1;i>=0;i--)
                {
                    list.add(arr[i][j]);
                }
            }
            else
            {
                for(int i=0;i<m;i++)
                {
                    list.add(arr[i][j]);
                }
            }

        }
        return list;
    }
    /*-----------------------------------------------------------------------*/
    public void transpose(int[][] arr)
    {
        int n = arr.length;
        int m = arr[0].length;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();

        }
    }
    void main()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr= new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
//        List<Integer> list= waveMatrix(arr);
//        for(int num:list)
//        {
//            System.out.println(num);
//        }
        transpose(arr);

    }
}
