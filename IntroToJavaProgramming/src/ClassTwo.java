public class ClassTwo {
    int variable1 = 1;
    int variable2 = 10;
    int size = 10;

    // constructor
    public ClassTwo(){

    }

    // constructor
    public ClassTwo(int var1, int var2, int var3){
        variable1 = var1;
        variable2 = var2;
        size = var3;
    }

    public ClassTwo(int var1, int var2){
        variable1 = var1;
        variable2 = var2;
    }


    public int subtract(int a, int b){
        int z = a - b;
        return z;
    }
    public int size(){
        return size;
    }
}
