public class Challenge4 {

    public static String likes(String[] arr){

        String result="";
        if(arr.length==0)
        {
            result="no one";
        }
       for(int i=0;i<arr.length;i++)
       {
           if(arr.length==1)
           {
               result=arr[i];
           }
           else if(arr.length==2)
           {
               if(result.equals("")) {
                   result = arr[i];
               }
               else{
                   result=result.concat(" and "+arr[i]);
               }
           }
           else if(arr.length==3)
           {
               result = switch (i) {
                   case 0 -> arr[i];
                   case 1 -> result.concat(", " + arr[i]);
                   case 2 -> result.concat(" and " + arr[i]);
                   default -> result;
               };
           }
           else {

                   switch (i) {
                       case 0 -> result = arr[i];
                       case 1 -> result = result.concat(", " + arr[i]);
                       case 2 -> {
                           int total = arr.length - i;
                           result = result.concat(" and " + total + " others");
                       }
                       default -> {
                           break;
                       }
                   }


           }
       }

    return result.concat(" likes this");
    }
    public static void main(String[] args)
    {
        String[] str ={"Alex", "Jacob", "Mark"};
          System.out.println(likes(str));

    }
}
