/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */

//Aaron Yafet

public class SimpleMerge
{

    public static void intSwap(int[] array, int j, int k)
    {
        int temp = array[j];
        array[j] = array[k];
        array[k] = temp;
    }

    public static void intSort(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {

            int minI = i;

            for (int j = i+1; j < array.length; j++)
            {
                if (array[j] < array[minI])
                {
                    minI = j;
                }
            }

            intSwap(array, i, minI);

        }
    }

    public static int[] simpleMerge(int[] arr1, int[] arr2)
    {
        int[] voidArr = new int[arr1.length+arr2.length];

        for (int i = 0; i < arr1.length; i++)
        {
            voidArr[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++)
        {
            voidArr[j+5] = arr2[j];
        }

        intSort(voidArr);

        return voidArr;
    }

}
