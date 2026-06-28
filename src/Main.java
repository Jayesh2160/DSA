//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

int getmultiply(int[] arr,int x,boolean flag) {
  for(int i=0;i<arr.length;i++)
  {
    if(arr[i]==x)
    {
      flag=true;
      return i;
    }
  }
  return -1;
}
int maxNum(int[] arr)
{
  int max = Integer.MIN_VALUE;
  for(int i:arr)
  {
    if(i>max)
    {
      max = i;
    }
  }
  return max;
}
int[] sum(int[] arr2)
{
  int posiSum = 0;
  int negSum = 0;
  for(int i: arr2)
  {
    if(i>=0)
    {
      posiSum=posiSum+i;
    }
    else {
      negSum=negSum+i;
    }
  }
  int[] ans = {posiSum,negSum};
  return ans;
}

int unsortedNum(int[] arr)
{
  try {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < arr[i + 1]) {
        continue;
      } else {
        return arr[i + 1];
      }
    }
  }catch(Exception e)
  {
    return -1;
  }
  finally {
    return 0;
  }

}

int[] swap(int[] arr)
{

  try {
    for (int i = 0; i < arr.length; i = i + 2) {
      int temp = arr[i];
      arr[i] = arr[i + 1];
      arr[i + 1] = temp;
    }
  }catch(ArrayIndexOutOfBoundsException e)
  {
    return arr;
  }
  return arr;
}

int[] intersectionOfArray(int[] arr, int[] arr2)
{
  int size = arr.length >= arr2.length ? arr.length : arr2.length;

  int[] ans = new int[size];
  int k=0;
  for(int i=0;i<arr.length;i++)
  {
    for(int j=0;j<arr2.length;j++)
    {
      if(arr[i]==arr2[j])
      {
        ans[k++]=arr[i];
      }

    }
  }
  return ans;
}

void main() {
//  int[] arr = new int[]{10, 13, 25, 76, 3, 89, 97, 34};
//  int[] arr2 = new int[]{-10, 34, 45, -22, -11, 1};
//  int[] a=sum(arr2);
//  System.out.println("Positive sum:" +a[0]);
//  System.out.println("Negative sum:" +a[1]);

//  int[] arr = {2,4,7,8,9,10};
//  int[] swaparray = swap(arr);
//  for(int i:swaparray)
//  {
//    System.out.print(i+" ");
//  }
  int[] arr = {2,4,6,5,4,8};
  int[] arr2 = {4,6,7,8};
  int[] ans = intersectionOfArray(arr,arr2);
  for(int i: ans)
  {
    if(i>0)
    System.out.println(i);
    else
      continue;
  }
}
