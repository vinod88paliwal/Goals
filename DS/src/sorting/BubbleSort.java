package sorting;

/**
 * Created by vpaliwal on 11/22/17.
 */
public class BubbleSort {


    public static void main(String[] args) {

        BubbleSort obj = new BubbleSort();

        int[] arr  = {33,2,4,7,8,94,44,22};

        obj.sort(arr);

        for(int n : arr)
        {
            System.out.print(n+" ");
        }
    }

    private void sort(int[] arr) {

        int length = arr.length;

        for (int i=0; i< length-1; i++)
        {
            for (int j=0; j< length-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }

    }
}
