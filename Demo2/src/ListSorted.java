/*
import java.util.ArrayList;
import java.util.stream.Collectors;

public class ListSorted {
    public static void main(String[] args) {


        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(2);
        al.add(1);
        al.add(5);
        al.add(3);
        al.add(10);
        al.add(6);
        al.add(0);
        al.add(6);
        al.stream().distinct().collect()

        for(int i=0;i<al.size()-1;i++){

            for(int j=i+1;j<=al.size()-1;j++){
                if(al.get(i)>al.get(j)){
                    int temp=al.get(i);
                    al.set(i,al.get(j));
                    al.set(j,temp);

                }
            }


        }
        System.out.println(al);

    }
}*/
