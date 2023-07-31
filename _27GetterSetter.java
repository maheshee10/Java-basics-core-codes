class GS{
  private int n;
  private String s;
  public int getN() {
    return n;
  }
  public void setN(int n) {
    this.n = n;
  }
  public String getS() {
    return s;
  }
public void setS(String s) {
    this.s = s;
}
  
}
public class _27GetterSetter
{
    public static void main(String args[])
    {
      GS obj1 = new GS();
      GS obj2 = new GS();
      obj1.setN(25);
      obj1.setS("Mahesh");
      obj2.setN(50);
      obj2.setS("Kumar");
     int  n1 = obj1.getN();
     int  n2 = obj2.getN();
     String s1 = obj1.getS();
     String s2 = obj2.getS();
      GS obj[] = new GS[2];
      obj[0] = obj1;
      obj[1] = obj2;
      for(GS m: obj)
      {
        System.out.print(m.getN() + ":"+ m.getS());
        System.out.println();
      }
      

    }
}
