import java.util.ArrayList;

public class ArrayCombination {
    //1111- remote
    public static void main(String[] args) {
        int a[]= new int[]{2,1,4,8,32,30,50,7};

        for(int i=0;i<=a.length;i++){

            for(int j=i+1;j>=i;j++){

                if(a[i]>a[j]){
                    int temp3=a[i];
                    a[i]=a[j];
                    a[j]=temp3;
                }
            }
        }

    }
}
