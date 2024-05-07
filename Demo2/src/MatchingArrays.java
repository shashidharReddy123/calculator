public class MatchingArrays {
    public static void main(String[] args) {
        int n[] = {1,2,3,4,5};
        int m[]={3,2,4,5,1};
        for(int i=0;i<=n.length-1;i++){
            int temp=n[i];
            boolean same=false;
            for(int j=0;j<=m.length-1;j++){
                int temp2=m[j];

                if(temp==temp2){
                    same=true;

                }

                }
            if(!same){
                System.out.println("both are not equal");
                break;

            }
            if(n[0]==4&&same){
                System.out.println("both are equal");

            }
            //hi how are you-1
            //i am fine-2
            //number3 mama
            //shashidhar is good.
            //Shashidhar the don.


        }

    }
}
