public class ExampleChar 
{
    public static void main(String args[])
    {
        char c[] = new char[6];
        for(int i =0; i<c.length;i++)
        {
            c[i] = 'm';
            c[i]++;
            System.out.print(c[i]);
        }
        for(char x: c)
        {
            System.out.print(x);
        }
    }
}
