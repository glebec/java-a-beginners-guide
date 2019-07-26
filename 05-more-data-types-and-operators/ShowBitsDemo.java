/**
 * ShowBitsDemo
 */
public class ShowBitsDemo {

    public static void main(String[] args) {
        var bits8 = new ShowBits(8);
        var bits32 = new ShowBits(32);
        var bits64 = new ShowBits(64);
        System.out.println("123 in binary: " + bits8.show(123));
        System.out.println("87987 in binary: " + bits32.show(87987));
        System.out.println("low byte of 87987: " + bits8.show(87987));
        System.out.println("237658768 in binary: " + bits64.show(237658768));
    }
}
