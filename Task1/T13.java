public class T13{
    public static  Scanner f = new Scanner(System.in);
    public static int nod(int a, int b) {
        if (a == b)
            return a;
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if ((~a & 1) != 0) {
            if ((b & 1) != 0)
                return nod(a >> 1, b);
            else
                return nod(a >> 1, b >> 1) << 1;
        }
        if ((~b & 1) != 0)
            return nod(a, b >> 1);
        if (a > b)
            return nod((a - b) >> 1, b);
        return nod((b - a) >> 1, a);
    }

    public static void main(String[] args)
    {
       int res= nod(f.nextInt(),f.nextInt());
        System.out.println(res);
    }



}