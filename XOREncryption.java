import java.util.Scanner;

class XOREncryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ------- INPUT -------
        System.out.print("Enter a message: ");
        String plain = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        /*  
            IMPORTANT:
            - Even if password contains only digits, we still treat it as CHARACTERS.
            - XOR always works on ASCII values of characters.
            - '0' = 48 ... '9' = 57
        */

        // Convert strings to char arrays for easy indexing
        char[] plainText = plain.toCharArray();
        char[] key = password.toCharArray();

        StringBuilder cipher = new StringBuilder();
        String cipherText;

        // ======================================================
        //                    ENCRYPTION
        // ======================================================
        /* 
            CASE 1: Key length >= Plaintext length
            → XOR only until plaintext ends.

            CASE 2: Key length < Plaintext length
            → Repeat (loop) the password until plaintext ends.
        */

        if (password.length() >= plain.length()) {

            // Case 1: Direct XOR using same index
            for (int i = 0; i < plain.length(); i++) {
                // XOR uses ASCII integer values internally
                char c = (char) (plainText[i] ^ key[i]);
                cipher.append(c);
            }

        } else {

            // Case 2: Key is shorter → loop the key
            int j = 0;  // pointer for key

            for (int i = 0; i < plain.length(); i++) {
                char c = (char) (plainText[i] ^ key[j]);
                cipher.append(c);

                j++;
                if (j == key.length) {
                    j = 0;  // reset to start of password
                }
            }
        }

        cipherText = cipher.toString();
        System.out.println("\nEncrypted Cipher Text: " + cipherText);

        // ======================================================
        //                    DECRYPTION
        // ======================================================
        /*
            XOR decryption works EXACTLY the same as encryption.

            Because:
            A XOR B XOR B = A   (XOR reverses itself)
        */

        StringBuilder originalText = new StringBuilder();
        char[] cipherArray = cipherText.toCharArray();
        String original;

        if (password.length() >= cipherText.length()) {

            // Case 1: Key is long enough → direct index XOR
            for (int i = 0; i < cipherText.length(); i++) {
                char c = (char) (cipherArray[i] ^ key[i]);
                originalText.append(c);
            }

        } else {

            // Case 2: Key shorter → loop the key again
            int j = 0;

            for (int i = 0; i < cipherText.length(); i++) {
                char c = (char) (cipherArray[i] ^ key[j]);
                originalText.append(c);

                j++;
                if (j == key.length) {
                    j = 0;
                }
            }
        }

        original = originalText.toString();
        System.out.println("Decrypted Plain Text: " + original);
    }
}
