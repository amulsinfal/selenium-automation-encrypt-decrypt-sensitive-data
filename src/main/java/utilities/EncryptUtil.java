package utilities;

import java.util.Base64;

public class EncryptUtil {

	/*	Run this below method separately once, to get the encrypted password
	 * 	e.g: encryptedPass = c2VjcmV0X3NhdWNl // encrypted password.
	 *  Save this encrypted password in the config.properties file.
	*/
//	public static String encrypt(String password) {
//      return Base64.getEncoder().encodeToString(password.getBytes());
//  }

	// returns the decrypted password.
	public static String decrypt(String encryptedPassword) {
		return new String(Base64.getDecoder().decode(encryptedPassword));
	} 
}
