import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * <B>Section 1</B>
 * <P>
 * Short example to kick-off the book. 
 *
 * @author <a href="mailto:jasonweiss@yahoo.com">Jason R. Weiss</a>
 * @version 1.0
 *
 */
public class DES_ECB
{
    public static void main(String[] args)
    {
        try
        {
            KeyGenerator kg = KeyGenerator.getInstance("DES");
            SecretKey key = kg.generateKey();

            SecretKeySpec keySpec = new
                    SecretKeySpec(key.getEncoded(), "DES");

            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.ENCRYPT_MODE, keySpec);

            String plainText = "This is a secret";

            byte[] cipherText = cipher.doFinal(plainText.getBytes());

            System.out.println("Resulting Cipher Text:\n");
            for(int i=0;i<cipherText.length;i++)
            {
                System.out.print(cipherText[i] + " ");
            }
            System.out.println("");





        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}