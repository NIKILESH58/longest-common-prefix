import java.util.*;
public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER NUMBER OF INPUTS");
        int n =in.nextInt();
        String[] strs = new String[n];
        System.out.println("ENTER THE WORDS FOR LONGEST COMMON PREFIX");
        for(int i=0;i<strs.length;i++)
        {
            strs[i]=in.next();
        }
        String prefix = "",stri="",str="";
        char ch,ch2;
        for(int i=0;i<strs.length;i++)
        {
           for(int j=0;j<strs.length;j++)
           {
              if(strs[i].length() <= strs[j].length())
               {
                stri=strs[i];
                strs[i]=strs[j];
                strs[j]=stri;
               }
           }
        }
        String minword=strs[0];
        int minwordlength=minword.length();
            for(int j=1;j<strs.length;j++)
            {
                 str=strs[j];
                 for(int k=0;k< minword.length();k++)
                 {
                   ch=minword.charAt(k);
                   ch2=strs[j].charAt(k);
                   if(ch==ch2)
                   {
                     prefix=prefix+ch;
                   }
                 }
                 minword=prefix;
                 prefix="";
            }
            if(minword=="")
                             System.out.println("NO COMMON PREFIX"); 
                 else
                 System.out.println("COMMON PREFIX---->"+minword); 
    }
}
