public class ClassMay21 {
    int varInt;
    String varStr;
    char varChar;
    boolean varBool;
    int[] varArr = new int[10];

    public ClassMay21 (int a, String b, char c, boolean d) {
        varInt = a;
        varStr = b;
        varChar = c;
        varBool = d;
    }

    public void printLongVariable(){
        InnerClassOfMay21 innerObj = new InnerClassOfMay21(100l, (short)15);
        System.out.println(innerObj.varLong);
    }


    public class InnerClassOfMay21{
        long varLong;
        short varShort;
        public InnerClassOfMay21(long a, short b){
            varLong = a;
            varShort = b;
        }
    }
}
