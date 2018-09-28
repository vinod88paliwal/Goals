package sorting;

/**
 * Created by vpaliwal on 11/22/17.
 */
public class MergeSort {

    int [] array;
    int[] tempArray;
    int length;

    public static void main(String[] args) {

        MergeSort obj = new MergeSort();

        int[] arr  = {33,2,4,-7,8,-94,44,22};

        obj.sort(arr);

        for(int n : arr)
        {
            System.out.print(n+" ");
        }

    }

    public void sort(int[] arr) {

        this.array = arr;
        this.length = arr.length;
        this.tempArray = new int[length];

        doMergeSort(0, length-1);

    }

    private void doMergeSort(int left , int right)
    {

        if (left < right)
        {
            int middle = left + (right -left)/2;

            doMergeSort(left,middle);
            doMergeSort(middle+1,right);

            mergeLeftRightParts(left,middle,right);
        }
    }

    private void mergeLeftRightParts(int left,int middle,int  right)
    {

        System.out.println(left+" "+right);
        for (int i =left ; i <=right ; i++)
            tempArray[i] = array[i];

        int i=left;
        int j = middle+1;
        int k =left;

        while (i <= middle && j <= right)
        {
            if(tempArray[i] <= tempArray[j])
            {
                array[k] = tempArray[i];
                i++;
            }else {
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }

        while (i <= middle)
        {
            array[k] = tempArray[i];
            k++;
            i++;
        }

    }

}
