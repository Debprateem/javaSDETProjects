package sdetFramework;

public class StaticFunctionOverload {
    public static void main(String arg[]) {
        doSomeThing(4);

    }

    public static int doSomeThing() {
        System.out.println("Im in int block");
        return -1;
    }

    public static void doSomeThing(int param1) {
        System.out.println("Im in void block with " + param1);
    }
    

}