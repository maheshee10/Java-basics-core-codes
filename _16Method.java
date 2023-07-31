/** Class Computer with multiple methods
 * all methods are public
 * 
 */
class Computer
{
    //void method hence returns nothing
    public void playmusic()
    {
        System.out.println("Playing Music");
    }
    /*this methos return a String value
     * 
     */
    public String getMeaPen()
    {
        return "pen";
    }
    public String printStockprice(int sp)
    {
        /**takes int value as parameter
         * return type is string so returns only string
         * the moment return is written it acts like end statement for the method
         * once the return condition is satisfied method terminates
         */
        if(sp>100)
        {
            if(sp<150)
            {
                System.out.println("Buy the Stock"+" "+sp);
            }

        }
        else if(sp<180)
        {
            System.out.println("hold the stock price"+" "+sp);
        }
        else
        {
          System.out.println("don't buy");
        }
        return "StockPrice";
    }
}

public class _16Method 
{
    public static void main(String args[])
    {
        Computer obj = new Computer();
        obj.playmusic();
        String s = obj.getMeaPen();
        String s1 = obj.printStockprice(134);
        System.out.println("Hello JavaTelusuko");
        System.out.println(s);
        System.out.println(s1);
    }
  
}