import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
public class CipherPassword {
	
	private static String algorithm = "Blowfish";//"DES";
	private static Cipher cipher = null;
	private static byte[] kbytes = "jaas is the way".getBytes();
	private static SecretKeySpec key = null;

	
	public static String decrypt(String encryptionBytes) throws Exception {
		key = new SecretKeySpec(kbytes, "Blowfish");
		cipher = Cipher.getInstance(algorithm);
		cipher.init(Cipher.DECRYPT_MODE, key);
		BigInteger n = new BigInteger(encryptionBytes, 16);
	     byte[] encoding = n.toByteArray();    
		byte[] recoveredBytes = cipher.doFinal(encoding);
		String recovered = new String(recoveredBytes);
		return recovered;
	}
	
	/*public static void main(String[] args) throws Exception {
	  
	//	String input = "-1b5931500ed9a313f6de407b117eb975";


		String input = "33D80E95EBB70AF0";
		
		System.out.println("dec:"+decrypt(input));
	}*/
}
