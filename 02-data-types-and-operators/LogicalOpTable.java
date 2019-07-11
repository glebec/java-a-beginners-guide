/**
 * LogicalOpTable
 */
public class LogicalOpTable {

    public static void main(String[] args) {
        boolean bools[][] = {
            {true, true},
            {true, false},
            {false, true},
            {false, false}
        };
        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT P");
        for (boolean[] pq : bools) {
            boolean p = pq[0];
            boolean q = pq[1];
            System.out.print(pad(boolToNumStr(p)));
            System.out.print(pad(boolToNumStr(q)));
            System.out.print(pad(boolToNumStr(p && q)));
            System.out.print(pad(boolToNumStr(p || q)));
            System.out.print(pad(boolToNumStr(p ^ q)));
            System.out.println(boolToNumStr(!p));
        }
    }

    private static String pad(String s) {
        return s + "\t";
    }

    private static String boolToNumStr (boolean b) {
        return b == true ? "1" : "0";
    }
}
