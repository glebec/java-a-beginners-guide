import java.lang.Exception;

/**
 * Stack
 */
public class Stack {

    public static void main (String[] args) throws Exception {
        var s = new Stack(3);
        s.push('a').push('b').push('c');
        System.out.println(s.pop()); // 'c'
        System.out.println(s.pop()); // 'b'
        s.push('d');
        System.out.println(s.pop()); // 'd'
        s.push('e');
        s.push('f');
        // s.push('X'); // Error
        s.pop();
        s.pop();
        s.pop();
        // s.pop(); // Error
    }

    private char[] chars;
    private int idx = 0;

    Stack (int size) {
        this.chars = new char[size];
    }

    Stack push (char c) throws Exception {
        if (this.idx == this.chars.length) {
            throw new Exception("Stack overflow.");
        }
        chars[this.idx++] = c;
        return this;
    }

    char pop () throws Exception {
        if (this.idx == 0) {
            throw new Exception("Stack underflow.");
        }
        return chars[--this.idx];
    }
}
