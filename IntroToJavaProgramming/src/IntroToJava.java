import java.util.Scanner;

public class IntroToJava {
    public static void main(String... args){

        String word = "Hello World";
        String myVariable;

        double mydouble = 10.0;
        mydouble = 15.6;


        long longvariable = 10l;
        char mycharacter = 'a';
        boolean myBoolan = false;

        int x = 10;
        int y = 14;
        String z = addition(x, y);

        //System.out.println(MyclassTwo.subtract(x, y));

        ClassTwo myclassTwoObj1 = new ClassTwo();
        ClassTwo myclassTwoObj2 = new ClassTwo();

        myclassTwoObj1.variable1 = 15;
        myclassTwoObj2.variable1 = 20;

        myclassTwoObj1.subtract(10, 5);

        Scanner scanner = new Scanner(System.in);
        int var1, var2;
        System.out.println("Give me value for the first variable: ");
        var1 = scanner.nextInt();
        System.out.println("Give me value for the second variable: ");
        var2 = scanner.nextInt();

        // for comparing two values < , >, >= , <=, ==, !=
        // && : and
        // || : or
        // condtions
        if (var1 > var2 || printSomething()) {
            System.out.println("variable one is greater than variable 2.");
        }
        else if (var1 < var2){
            System.out.println("variable one is less than variable 2.");
        }
        else if(var1 == var2){
            System.out.println("variable one is equal to variable 2.");
        }
        else {
            // do this
        }


    }

    public static boolean printSomething(){
        System.out.println("My method was executed");
        return true;
    }

    public static String addition(int var1, int var2){
        // do something
        int var3 = var1+var2;
        return "sfasdf";
    }

    public void doNothing(){
        //
    }
}
