import java.util.ArrayList;

public class Test

{   

   public static void main(String a[])

   {

       ArrayList<String> obj = new ArrayList<String>();

       obj.add("A");

       obj.add("B");

       obj.add("C");

       obj.add(1, "D");

       System.out.println(obj);

   }

}