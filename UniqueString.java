public class UniqueString{

     public static void main(String []args){
        String s="asdfghjloqwertyuia";
        int length=s.length();
        int x[]=new int[256];
        for(int i=0;i<length;i++)
        {
            if(x[s.charAt(i)]==1)
            {
                System.out.println("Repeated");
                System.exit(0);
            }
            else
            {
                x[s.charAt(i)]=1;
            }
        }
        System.out.println("Unique");
     }
} 
