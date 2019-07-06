class Example2 {
    public static void main (String args[]) {
        int myVar1, myVar2;
        // int myVar1;
        // int myVar2;

        myVar1 = 1024;

        System.out.println("myVar1 contains " + myVar1);

        myVar2 = myVar1 / 2; // truncated division

        System.out.println("myVar2 contains myVar1 / 2: " + myVar2);
        // or, use `print` and then `println`
    }
}
