import java.util.HashMap;

public class RepeatedChar {

   static String S="Shashidhar";

    public static void main(String[] args) {


        char[] c=S.toCharArray();

        HashMap<Character,Integer> m = new HashMap<Character,Integer>();

        System.out.println(c.length);

        for(char f:c){
            if(m.containsKey(f)){
                m.put(f,m.get(f)+1);
            }
            else {
                m.put(f,1);

            }

        }
        System.out.println(m.toString());

    }


}
