public class _24StringBuffer 
{
    public static void main(String args[])
    {
        StringBuffer sb = new StringBuffer("mahesh");
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb.capacity()+" "+sb1.capacity());
        String name = "kumar";
        name = "naveen";
        System.out.println(name);
        sb1.append("checking");
        System.out.println(sb1);
        sb1.insert(4,"run");
        System.out.println(sb1);

    }
    
}
