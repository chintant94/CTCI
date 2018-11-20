public class OneAway{

     public static void main(String []args){
        String s1="fBbale";
        s1=s1.toLowerCase();
        int len1=s1.length();
        String s2="fddbalE";
        s2=s2.toLowerCase();
        int len2=s2.length();
        int flag=0;
        int i=0,j=0;
        if((len1-len2)>1 || (len1-len2)<-1)
        {
            System.out.println("Not one edit away");
            System.exit(0);
        }
        
        while(i<len1 && j<len2)
        {
            if(s1.charAt(i)!=s2.charAt(j))
            {
                if(flag==0)
                {
                    flag=1;
                    if(len1==len2)
                    {
                        if(s1.charAt(i+1)==s2.charAt(j+1))
                        {
                            i++;
                            j++;
                            continue;
                        }
                    }
                    if(s1.charAt(i+1)==s2.charAt(j))
                    {
                        i++;
                        continue;
                    }
                    else if(s1.charAt(i)==s2.charAt(j+1))
                    {
                        j++;
                        continue;
                    }
                    else
                    {
                        System.out.println("Not one edit away");
                        System.exit(0);
                    }
                }
                else
                {
                    System.out.println("Not one edit away");
                    System.exit(0);
                }
            }
            i++;
            j++;
        }
        System.out.println("It's one edit away");
     }
}
