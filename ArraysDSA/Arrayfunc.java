import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class Arrayfunc {
    public static void main(String[] args) {
        int arr[] = {8,3,5,0,9};
        int ele = Arrays.binarySearch(arr, 9);
        String str = Arrays.toString(arr);
        //IntStream Stream = Arrays.stream(arr);
        int newarr[] = Arrays.copyOf(arr,5);
        Arrays.sort(arr);
        //Stream.forEach(System.out::println);
        //System.out.println(Arrays.equals(arr,newarr));
        int ar[] = new int[10];
        Arrays.fill(ar,1);
        for (int e : ar) {
            System.out.print(e+" ");
        }
    }
}

