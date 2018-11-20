public class Urlify{

     public static void main(String []args){
        String s1="asdfghjloqwertyu i a    ";
        int true_length=20;
        int index=23;
        char str[]=s1.toCharArray();
        System.out.println(str);
        for(int i=true_length-1;i>=0;i--)
        {
            if(s1.charAt(i)==' ')
            {
                str[index]='0';
                str[index-1]='2';
                str[index-2]='%';
                index=index-3;
            }
            else
            {
                str[index]=s1.charAt(i);
                index--;
            }
        }
        System.out.println(str);
     }
}
