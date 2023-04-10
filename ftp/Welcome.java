public class Welcome

{    

    static int x = 9;

    public Welcome() {

       printVariables();      //Line-1

    }

    static void printVariables() {

       System.out.print(x);   //Line-2

    }

    public static void main(String []args)

    {

       new Welcome();      //Line-3

    }

}