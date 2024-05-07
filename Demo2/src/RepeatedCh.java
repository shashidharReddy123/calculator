import java.util.HashMap;

public class RepeatedCh {
    public static void main(String[] args) {
        String name="shashidhar";
        int count=0;
        HashMap<Character,Integer> m = new HashMap<Character,Integer>();
        for(int i=0;i<=name.length()-1;i++){
            char[] ch=name.toCharArray();

            if(m.containsKey(ch[i])){

                m.put(ch[i],(Integer)m.get(ch[i])+1);
            }
            else {
                m.put(ch[i], 1);
            }


        }
        System.out.println(m);
    }
}
