public class selectionsort {

     public static void selections(int array[]){
         for(int i=0;i< array.length-1;i++){
             int min_index=i;
             for(int j=i+1;j< array.length;j++){
                 if(array[min_index]>array[j]){
                     min_index=j;
                 }
             }
             int temp = array[i];
             array[i]=array[min_index];
             array[min_index]=temp;
         }
     }
    public static void print(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]+" ");
        }
    }

    public static void main(String [] args){
        int arr[] = {22,13,13,11,12,33};
        selections(arr);
        System.out.println("Sorted array:");
        print(arr);

    }
}
