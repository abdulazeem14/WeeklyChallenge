public class Challenge5 {

    public static int sumInterval(int interval[][]){
        int sum=0;
        if(interval==null)
        {
            return sum;
        }
        for(int i=0;i<interval.length;i++)
        {
            int sub=0;
            for(int j=0;j<interval[i].length;j++)
            {
                sub=interval[i][j]-sub;
            }
            sum=sum+sub;

        }

    return sum;
    }
    public static void main(String args[])
    {
        int interval[][]={{-2, -1}, {-1, 0}, {0, 21}};

      //  assertEquals(23, sumIntervals(new int[][]{{-2, -1}, {-1, 0}, {0, 21}}));


        //assertEquals(54, sumIntervals(new int[][]));
        System.out.println(sumInterval(interval));

     //   assertEquals(78, sumIntervals(new int[][]{{-245, -218}, {-194, -179}, {-155, -119}}));


    }
}
