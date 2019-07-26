/**
 * Encode
 */
public class Encode {

    public static void main(String[] args) {
        String msg = "No more secrets.";
        String key = "quazerty";

        System.out.println("Original:\n" + msg);

        String encoded = "";
        for (int i = 0; i < msg.length(); i++) {
            encoded += (char) (msg.charAt(i) ^ key.charAt(i % key.length()));
        }
        System.out.println("Encoded:\n" + encoded);

        String decoded = "";
        for (int i = 0; i < msg.length(); i++) {
            decoded += (char) (encoded.charAt(i) ^ key.charAt(i % key.length()));
        }
        System.out.println("Decoded:\n" + decoded);
    }
}
