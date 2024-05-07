public class ReverseString {
    public static void main(String[] args) {
        String S="ramu";
        String revrse="";
        int j=S.length()-1; 




        for(int i=S.length()-1;i>=0;i--){
            System.out.println(i);
            revrse+=S.charAt(i);
            System.out.println(revrse);


        }
        System.out.println(revrse);
        //reverse
    }
}
