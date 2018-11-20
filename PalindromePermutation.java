public class PalindromePermutation{

     public static void main(String []args){
        String s="abcdcabD";
        s=s.toLowerCase();
        int len=s.length();
        int flag=0;
        int x[]=new int[256];
        for(int i=0;i<len;i++)
        {
            x[i]=0;   
        }
        for(int i=0;i<len;i++)
        {
            x[s.charAt(i)]++;
        }
        for(int i=0;i<256;i++)
        {
            if(x[i]%2==1)
            {
                if(flag==0)
                {
                    flag=1;
                }
                else
                {
                    System.out.println("Not a permutation of palindrome");
                    System.exit(0);
                }
            }
        }
        System.out.println("Permutation of palindrome");
     }
}
