import java.util.ArrayList;
import java.util.List;

public class Example {
    //1111-remote


    public static void main(String[] args) {
        int[] arr = {1, 20, 3, 15, 5};
        int sum = 33;
        int start = 0;
        int end = 0;
        List al=Example.m1(arr, sum);
        System.out.println(al);
    }


    public static List m1(int arr[], int sum) {

        int  rrr=33;
        for (int i = 0; i <= arr.length-1; i++) {

            int result=arr[i];


            for (int j = i + 1; j <= arr.length-1; j++) {
                result+=arr[j];
                if (result==rrr) {

                    ArrayList al = new ArrayList();
                    al.add(i);
                    al.add(j);
                    return al;
                }


                }
            }


        return  null;
    }
}







