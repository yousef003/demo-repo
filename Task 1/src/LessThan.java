import java.util.ArrayList;

public class LessThan implements FilteringBehavior {
    public int[] filter(int[] arr, int n) {
        int w =arr.length;
        ArrayList<Integer> temp = new ArrayList<>() ;

        for (int i =0; i < w ;i++)
            if (arr[i] < n)
                temp.add(arr[i]);

        int [] arr1=new int[temp.size()];

        for (int i = 0 ; i< temp.size(); i++)
            arr1[i] = temp.get(i);

        return arr1;

    }
}
