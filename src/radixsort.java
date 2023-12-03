public class radixsort {
  public static void countsort(int[] a,int place){
      int m = max(a);
      int[] countarray = new int[m+1];
      int[] output = new int[a.length];

      for(int i=0;i<countarray.length;i++){
          countarray[i]=0;
      }
      for(int i=0;i<a.length;i++){
          countarray[(a[i]/place)%10]++;
      }
      for (int i=1;i<10;i++){
          countarray[i]+=countarray[i-1];
      }
      for (int i=a.length-1;i>=0;i--){
          output[countarray[(a[i]/place)%10]-1] = a[i];
          countarray[(a[i]/place)%10]--;
      }
      for (int i=0;i<a.length;i++){
          a[i]=output[i];
      }


  }
   public static void radix(int[] a){
      int high = max(a);
       for(int i=1;high/i>0;i*=10){
          countsort(a,i);
       }
   }

   public static int max(int[] a){
       int maxnum = a[0];
       for(int i=1;i<a.length;i++){
           if(a[i]>maxnum)
               maxnum=a[i];
       }
       return maxnum;
   }
    public static void print(int[] a){
        for (int j : a) {
            System.out.println(j + " ");
        }
    }
    public static void main(String[] args){
        int[] arr = {22,56,333,77,25,57,34};
        radix(arr);
        System.out.println("Sorted array:");
        print(arr);
    }
}
