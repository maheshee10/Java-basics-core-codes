public class _6Casting 
{
    public static void main(String kargs[])
    {
        byte b = 120;
        int a = 12;
        b = (byte)a;
        float f = 5.6f; //casting - explicit conversion
        int x = (int)f; //casting - explicit conversion
        byte c = 19;
        int i = 245;
        i = c; // implicit conversion - widening
        System.out.println(b);
        System.out.println(a);
        System.out.println(f);
        System.out.println(x);
        System.out.println(i);
        System.out.println(c);
        int integer = 257;
        byte bt = 127;
        bt = (byte)integer; 
        // here 257 is out of range of byte so to add bigger number to byte 
        //byte perfrms modulas (remainder) operation on integer 
        // 257%256 and remainder is added to bt here
        // another example :
        int num = 1890;
        byte small = (byte)num;
        System.out.println(small);

    } 
}
