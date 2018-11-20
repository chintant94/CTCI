public class PalimdromeStrings{

     public static void main(String []args){
        String s1="asdfghjloqwertyuia";
        int length=s1.length();
        String s2="loiuytrewqjhgfdsaa";
        int length2=s2.length();
        int x[]=new int[256];
        if(length!=length2)
        {
            System.out.println("Not a permutation");
            System.exit(0);
        }
        for(int i=0;i<length;i++)
        {
            x[i]=0;
        }
        for(int i=0;i<length;i++)
        {
            x[s1.charAt(i)]++;
        }
        for(int i=0;i<length2;i++)
        {
            if(x[s2.charAt(i)]==0)
            {
                System.out.println("Not a permutation");
                System.exit(0);
            }
            else
            {
                x[s2.charAt(i)]--;
            }
        }
        for(int i=0;i<length;i++)
        {
            if(x[i]!=0)
            {
                System.out.println("Not a permutation");
                System.exit(0);
            }
        }
        System.out.println("It's a permutation");
     }
} 
