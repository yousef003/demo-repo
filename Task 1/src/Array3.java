public class Array3 extends ArrayProcessor{
    public Array3 (){
        sortingBehavior  = new InsertionSort() ;
        searchingBehavior=new BinarySearch();
        filteringBehavior=new GreaterThan();

    }

    @Override
    public void sorting(int[] arr) {
        sortingBehavior.sorting(arr);

    }

    @Override
    public int search(int[] arr, int x) {
        return searchingBehavior.search(arr,x);

    }

    @Override
    public int[] filter(int[] arr, int n) {
        return filteringBehavior.filter(arr,n);

    }
}


