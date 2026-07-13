import java.util.Arrays;
public class ArraysDemo{
    public static void main(String[] args) {
        int[] arr={5,2,8,1,4};
 
        // Length property
        System.out.println("Length of an array:"+arr.length);
        //toString()
        System.out.println("Print an array:"+Arrays.toString(arr));
        // sort an array
        Arrays.sort(arr);
        System.out.println("Sort:"+Arrays.toString(arr));
        // binarySearch()
        int index=Arrays.binarySearch(arr,4);
        System.out.println("Binary Search"+index);
        //copyOf()
        int copy[]=Arrays.copyOf(arr,arr.length);
        System.out.println("copy of an array:"+Arrays.toString(copy));
        //copyOfRange()
        int range[]=Arrays.copyOfRange(arr, 1, 4); 
        System.out.println("Copied Range:"+Arrays.toString(range));
        // fill array
        int[] fillarr=new int[5];
        Arrays.fill(fillarr,10);
        System.out.println("Filled Array"+Arrays.toString(fillarr));
         //  equals()
        System.out.println("Is an Array equal to copy ?:"+arr.equals(copy));
    }
}
