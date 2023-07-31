public class _21Jagged3D 
{
    public static void main(String args[])
    {
        //jagged array
        int nums[][] = new int[3][]; //nums is an array of 3 internal arrays with unknow sizes created 
        nums[0] = new int[5]; //internal array sizes initialised individually
        nums[1] = new int[3];
        nums[2] = new int[2];
        
        for(int i=0; i<nums.length; i++) //nums.legth means nums array length that is 3
        {
            for(int j=0; j<nums[i].length; j++)
            {
                nums[i][j] = (int)(Math.random() * 10);
                 //randomly assigning values to 2d jagged array with lengths condition
                 //nums[i].length takes for each i(i.e row) its legth which was specified individually
                 //example nums[1].length refersto second array length
                System.out.print(nums[i][j]+" ");
            }
            System.out.println();


        }
        for(int n[]:nums)
        {
            for(int m:n)
            {
                System.out.print(m+" ");
            }
            System.out.println();
        }
        //3D JaggedArray
        int num3[][][] = new int[3][][]; //3d jagged array where outer array is an array having two internal arrays
        //declaring sizes of each internal arrays of outer array
        num3[0] = new int[2][];//first internal array having 2 internal arrays again
        num3[1] = new int[3][];//second internal array having 3 internal arrays again
        num3[2] = new int[2][];//2internal array having 5 internal arrays again 
        //declaring sizes of internal arrays of first internal arra
        num3[0][0] = new int[2]; //first internal array of the first internal array of num3 array will have two elements
        num3[0][1] = new int[3];//second internal array of first internal array of num3 array will have 3 elements
        //declaring sizes of internal arrays of second internal arra
        num3[1][0] = new int[5]; //first internal array of second internal array of num3 array will have 5 elements
        num3[1][1] = new int[4]; //second internal array of second internal array(here index is not same as array count)of num3 array will have 4 elemts
        num3[1][2] = new int[2];//last internal array of second internal array of num3 at index 1 of array num3 will have 2 elements
        //declaring size of internal arrays of third internal array
        num3[2][0] = new int[8]; //first internal array of third internal array of num3 will have 8 elements
        num3[2][1] = new int[6];//second internal array of third internal array of num3 array will have 6 elements
        //sizes declaration done now to assign values
        for(int i = 0;i<num3.length;i++)
        {
            for(int j = 0; j<num3[i].length;j++)
            {
                for(int k=0; k< num3[j].length; k++)
                {
                   num3[i][j][k] = (int)(Math.random()*10);
                   System.out.print(num3[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println();


        /*for(int n[][]:num3)
        {
            for(int m[]:n)
            {
                for(int e:m)
                {
                    System.out.print(e+" ");
                }
            }
            System.out.println();
        }*/
    }

    
}
