public class Array2 extends   ArrayProcessor{
    public Array2(){
    sortingBehavior  = new BubbleSort() ;
    searchingBehavior=new BinarySearch();
    filteringBehavior=new LessThan();

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



