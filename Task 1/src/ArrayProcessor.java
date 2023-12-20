public class ArrayProcessor {
    public SortingBehavior sortingBehavior ;
    public  SearchingBehavior searchingBehavior;
    public FilteringBehavior filteringBehavior;
    public void display(int [] arr ) {
        if (arr.length == 0 ) {
            System.out.println("empty");
        } else {
            for (int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
            System.out.print("\n");

        }
    }

    public  void   sorting(int [] arr  ) {}

    public  int search( int [] arr ,int x){
        return 0;

    }

    public  int [] filter(int [] arr , int n   ){
        return arr  ;
    }

}
