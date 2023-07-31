public class _20MultiDimArray 
{
    public static void main(String args[])
    {
        //MultiDim array with outer array having four inner array of elements
        int nums[][] = new int[3][4]; //here inner array has four elements and outer array has 3 such arrays
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                nums[i][j]= (int) (Math.random() * 100); //taking random values and assiginig them to each row and each column Math random gives double values therefore multiply with 10 and convert to int 
            }
        }
        for(int i = 0; i<3; i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        for(int n[]:nums) //enhanced loop taking n array and assigning nums arrays to it implies n will have 3 elemnts(arrays)
        {
          for(int m:n) //each m will have n data 
          {
            System.out.print(m+" ");
          }
          System.out.println();
        }
        System.out.println();
    }
    
}
