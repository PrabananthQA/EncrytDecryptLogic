package qa.encrypt;

public class AE256Example {  public static void main(String[] args) {
    String originalString = "ptester";

    String encryptedString = AES.encrypt(originalString);
    String decryptedString = AES.decrypt(encryptedString);

    System.out.println(originalString);
    System.out.println(encryptedString);
    System.out.println(decryptedString);
  }
}