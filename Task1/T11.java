public class T11{
    public static void task1(){

        System.out.print("Enter your binary number:");
        try {
            String input = f.next();
            int res = Integer.parseInt(input, 2);
            System.out.println(input+" -> "+res);
        }
        catch (NumberFormatException e) {
            System.out.println("Sorry, but it's not a binary :(");
        }
    }
    public static void main(String[] args)
    {
        task1();
    }
}