public class T14
{ public  static  void changeBit(int x, int n)
    {
    x ^= 1 << n;
    }
    public static  Scanner f = new Scanner(System.in);
    public static void main(String[] args)
    {
        changeBit(f.nextInt(),f.nextInt());
    }
}