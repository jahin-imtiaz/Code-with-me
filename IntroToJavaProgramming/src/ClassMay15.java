import java.util.Scanner;

public class ClassMay15 {
    public static void main(String... args){
        int var1;
        int var2;
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Give the value of the first variable: ");
//        var1 = scanner.nextInt();
//        System.out.print("Give the value of the second variable: ");
//        var2 = scanner.nextInt();

//        System.out.print("Result: ");
//        int result = multiply(var1, var2);
//        System.out.println(result);

        //switch statements
//        switch(var1){
//            case 10:
//                // do something
//                System.out.println("Its ten.");
//                break;
//            case 20:
//                System.out.println("its twenty");
//                // do something
//                break;
//            default:
//                System.out.println("something else");
//                // do something
//                break;
//        }

//        if(var1 < var2){
//            //do something
//            if( var1 >= 0) {
//                System.out.println("its less than the second one and its positive");
//            }
//            else {
//                System.out.println("its less than the second one, but its negative");
//            }
//        }

        int[] arr = new int[10];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 5;
        System.out.println(arr[0]);

        String[] arr2 = new String[5];
        arr2[0] = "hello";
        System.out.println(arr2[0]);

        ClassTwo[] arr3 = new ClassTwo[5];

        ClassTwo first = new ClassTwo();
        ClassTwo second = new ClassTwo(17, 34, 15);
        ClassTwo third = new ClassTwo(13, 15);

        int idx = 0; // 0
        arr3[idx] = first;
        idx = idx + 1; // 0+ 1 = 1
        arr3[idx] = second;
        idx = idx + 1; // 1 + 1 = 2
        System.out.println(arr3[0].variable2);
        System.out.println(arr3[1].variable2);

        int i = 0;
        while (i < arr.length) { // arr.length = returns the size of the array in integer = 10
            System.out.println("from while loop: " + arr[i]);
            //i = i + 1;
            //i +=1; /// whatever is i, take the value and increment it by 1 and assign the result back to i
            i++;
        }

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

        for (int element : arr) { // for each loop to access elements without using the index for them.
            System.out.println(element);
        }

        int k = 0;
        do {
           // ...
            System.out.println( "From do while loop: " + k);
            k++;
        } while (k < arr.length); // do while loops

        ClassTwo objectOne = new ClassTwo(10, 15, 17); // creates an object and assigns the location of that object to this variable.
        ClassTwo objectTwo = new ClassTwo(0, 4, 6);
    }

    public static int multiply(int a, int b){
        int z = a * b;
        return z;
    }
}
