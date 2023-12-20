// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayProcessor process = new Array1();
        int [] arr = {4,8,9,6};
        arr=process.filter(arr,4);
        process.display(arr);

        process.sorting(arr);
        process.display(arr);

        System.out.println(process.search(arr,4));
        System.out.println(process.search(arr,8));
        System.out.println("_____________________");


        process =new Array2();
        int [] arr1 = {7,9,0};
        arr1=process.filter(arr1,7);
        process.display(arr1);


        process=new Array3();

        int [] arr2 = {4,8,9,3,2,1,4,7,5};
        process.sorting(arr2);
        process.display(arr2);


        System.out.println(process.search(arr2,1));










    }
}