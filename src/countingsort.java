public class countingsort {
  public static void countings(int a[]){
      int maxnumber = max(a);
   int countarr[] = new int[maxnumber+1];
      int output[] = new int[a.length];
// initialize count array value with zero
   for(int i=0;i<countarr.length;i++){
       countarr[i]=0;
   }
   // find frequency
      for(int i=0;i<a.length;i++){
          countarr[a[i]]++;
      }
      //find cumulative frequency
      for(int i=1;i<= countarr.length-1;i++){
          countarr[i]+=countarr[i-1];
      }
      for(int i=a.length-1;i>=0;i--){
          output[countarr[a[i]]-1] = a[i];
          countarr[a[i]]--;
      }
      for(int i=0;i<a.length;i++){
          a[i]=output[i];
      }

  }
  public static int max(int a[]){
      int maxnum=a[0];
      for(int i=1;i<a.length-1;i++){

          if(a[i]>maxnum)
              maxnum=a[i];
      }
      return maxnum;
  }

    public static void print(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }

    public static void main(String[] args){
        int arr[]={3,1,4,2,6,7,0};
        countings(arr);
        System.out.println("Sorted array: ");
        print(arr);
    }
}
