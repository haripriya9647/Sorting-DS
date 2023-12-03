public class bubblesort {
    public static void bubbles(int array[]){
        int temp=0;
        for(int j=0;j< array.length-1;j++) {
            for (int i = 0; i < array.length -j- 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }

            }
        }
    }
    public static void print(int array[]){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]+" ");
         }
    }

    public static void main(String[] args){
        int arr[] = {2,3,5,4,6};
        bubbles(arr);
        System.out.println("Sorted array :");
        print(arr);
    }
}
