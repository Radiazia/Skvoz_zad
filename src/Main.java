import java.io.File;

public class Main {
    public static void main(String[] args) {
        Encryptor en = Encryptor.getEncrypter(true);
        Decryptor de = Decryptor.getDecrypter(true);

        File src = new File("D:/Java_laba/Cross-CuttingTask/input.txt");
        File dst =new File("D:/Java_laba/Cross-CuttingTask/output.txt");

        //en.encrypt(src, dst);
        de.decrypt(dst, src);
    }
}