// Initial Test To Verify javax.crypto is working. 
//

public class CryptoTest {
    public static void main(String[] args) throws Exception {
        Cipher cipher = Cipher.getInstance("AES/OFB/NoPadding");
        System.out.println("Crypto works!");
    }
}
