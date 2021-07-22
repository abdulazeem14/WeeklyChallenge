import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Challenge3 {
    public static String pigIt(String s)
    {
        ArrayList<String> str=new ArrayList<>();
        int index=0;
        String r="";
        boolean flag=true;

//        for(int i=0;i<s.length();i++)
//        {
//            if(s.charAt(i)==' ')
//            {
//                str.add(r);
//                r="";
//                continue;
//            }
//            else
//            {
//                r=r.concat(String.valueOf(s.charAt(i)));
//            }
//
//        }
       String[] arr=s.split(" ");
       ArrayList<Character> plist=new ArrayList<>(Arrays.asList('!','.',',',':','?',';'));

       for(int i=0;i<arr.length;i++)
       {
           arr[i]=arr[i].concat(String.valueOf(arr[i].charAt(0)));
           arr[i]=arr[i].substring(1);
           if(plist.contains(arr[i].charAt(0)))
           {
               arr[i]=arr[i].concat(" ");
           }
           else {
               arr[i] = arr[i].concat("ay ");
           }
       }
       s="";
       for(int i=0;i<arr.length;i++)
       {
           s=s.concat(arr[i]);
       }
        return s;
    }
    public static void main(String args[])
    {
        ArrayList<String> str=new ArrayList<>();
        boolean flag=false;
        String r="";
        int index=0;
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=scn.nextLine();
       System.out.println(pigIt(s));
    }
}


















 //for(int i=0;i<s.length();i++)
//        {
//            if(s.charAt(i)!=' ') {
//                System.out.print(s.charAt(i));
//            }
//            if(s.charAt(i)==' ')
//            {
//                System.out.println();
//            }
//        }
//        for(int i=0;i<s.length();i++)
//        {
//            if(s.charAt(i)==' ')
//            {
//               flag=true;
//               index++;
//                continue;
//            }
//                if(i==0||flag==true)
//                {
//                    str.add(index,String.valueOf(s.charAt(i)));
//                    flag=false;
//                }
//                else {
//                    str.add(index, str.get(index).concat(String.valueOf(s.charAt(i))));
//                }
//        }