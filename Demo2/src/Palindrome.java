public class Palindrome {

    public static void main(String[] args) {
        int r,sum=0,temp;
        int n=454;
        temp=n;
        while(n>0) {
            r = n % 10;
            sum = sum * 10 + r;
            n = n / 10;
            System.out.println(sum);
            System.out.println(n);
        }
        if(sum==temp){
            System.out.println("palindrome");


        }
       // I am not great
        //I am great.
    }
}
