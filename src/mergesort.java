public class mergesort {
   public static void merges(int a[],int beg,int end) {
       if (beg < end) {
           int mid = (beg + end) / 2;
           merges(a, beg, mid);
           merges(a, mid + 1, end);
           merge(a, beg, mid, end);
       }
   }

    public static void merge(int a[], int beg, int mid, int end) {
        int i = beg;
        int j = mid + 1;
        int k = beg;
        int[] temp = new int[a.length]; // Create a temporary array to store merged elements

        while (i <= mid && j <= end) {
            if (a[i] < a[j]) {
                temp[k] = a[i];
                i++;
            } else {
                temp[k] = a[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of the first subarray, if any
        if(j>end){
            while (i <= mid) {
                temp[k] = a[i];
                i++;
                k++;
            }
        }


        // Copy the remaining elements of the second subarray, if any
        else {
            while (j <= end) {
                temp[k] = a[j];
                j++;
                k++;
            }
        }


        // Copy the merged elements back to the original array
        for (int index = beg; index <= end; index++) {
            a[index] = temp[index];
        }
    }

    public static void print(int a[]){
        for (int j : a) {
            System.out.println(j + " ");
        }
    }

    public static void main(String[] args){
        int arr[] = {3,6,2,5};
        int n=arr.length;
        System.out.println("Before sort array: ");
        print(arr);
        merges(arr,0,n-1);
        System.out.println("MergeSorted array: ");
        print(arr);
    }
}
