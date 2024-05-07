import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.SortedMap;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        List al=Arrays.asList(1,2, 3, 5, 1, 2, 3, 4, 5);



        for(int i=0;i<al.size();i++){
            int temp=(int)al.get(i);
            int temp3=1;
            if(temp==0)
                continue;


            for(int j=0;j<al.size();j++){
                int temp2=(int)al.get(j);

                if(i!=j&&temp==temp2) {

                    temp3++;
                }

                }
            if(temp3==1) {
                System.out.println(temp);
            }

                }






    }
}
