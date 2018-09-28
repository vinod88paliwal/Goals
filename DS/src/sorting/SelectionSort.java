package sorting;

/**
 * Created by vpaliwal on 11/22/17.
 */
public class SelectionSort {


    public static void main(String[] args) {


        SelectionSort obj = new SelectionSort();

        int[] arr  = {33,2,4,-7,8,-94,44,22};

        obj.sort(arr);

        for(int n : arr)
        {
            System.out.print(n+" ");
        }

    }

    private void sort(int[] arr) {

        int length = arr.length;

        for(int i =0; i< length-1; i++)
        {
            int minIndex = i;

            for(int j=i +1 ; j< length ; j++)
            {
                if(arr[j] < arr[minIndex])
                    minIndex =j;

                int smallerNumber = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = smallerNumber;

            }
        }
    }
}
