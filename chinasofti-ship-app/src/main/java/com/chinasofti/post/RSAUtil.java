package com.chinasofti.post;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import java.security.KeyFactory;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;


public class RSAUtil {
    public   static String privateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAJyoA6wrpEKXX7DdR0lIL9SkSsAzoBZB16hNNS5IbZ4978X+tf6+yBzXWctd1/VOKsZ/y3SlR7FmezWUHbGtF3cI6r7v5EFzXcy3+zAX4JxrL/Ig2IDkl2XPAGwC1rbxVZJGXcPJLWTecfEoga9vlNujqXUCFZRn6tGaN3hqxFuXAgMBAAECgYAYiNfKZytaooqCEKXRfFTBYNm0MGGqGrXDzhO+I+nHFrwuri2isA53NeMCTrg72vooDGu44QnRZtN1GLVt1kYOR7k11gos0ZiV6IFxhSuyr3TVDWjKGHOcbqfrZsnSZCfgnnvwDLSBmk1oaCnYSIm7Z/ONbU5VsQMs6bUdelwTwQJBANAMD4B5ZrrmJKgNTgKFEHNtmiI2Gd8XHI2e/IYIWiHvO7DTXgmYaE1e1WmzyJihK9QYJg8+Gxk9UnpWZkK6ksUCQQDAw5wZay6hL9ZTljznu+ypjfQsLnyKP1D7CWPyZmBzwgEGj9JHJnzlTU3jdku+W/GdT7pGjSxN26Pqja/M0CqrAkEAjVT0HvnZ8POxSTyolwugLlnxkHYiQyxnKEouEDuSR2VGrowYYPpZON5IqmMIza8HoDC7gjVVoWLIKfWRyJkIZQJAQlXObSzmUg/dSMyFzxVrnvm70kx5DTY2zvzvSSaUAKH9ql1p9pQ3HM3ahPFbpXmMjx81sju4yF5SbVAu9GOamwJAWoz8dDudr87HjqNHn+/ohQ8vvrCfR5zBL+Fqj+G+DMaFiusTa1EsyxJPWb9qKifKybwWJvSVK+4Bn36mthPCiw==";
    public  static String publickey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCcqAOsK6RCl1+w3UdJSC/UpErAM6AWQdeoTTUuSG2ePe/F/rX+vsgc11nLXdf1TirGf8t0pUexZns1lB2xrRd3COq+7+RBc13Mt/swF+Ccay/yINiA5JdlzwBsAta28VWSRl3DyS1k3nHxKIGvb5Tbo6l1AhWUZ+rRmjd4asRblwIDAQAB";

    private static String algorithm = "RSA";
	/**
	 * 数据加密
	 * @param reqData
	 * @param publicKey
	 * @return
	 * @throws Exception
	 */
	public static String encrypt(String reqData, String publicKey) throws Exception{
		
		byte[] buffer = (new BASE64Decoder()).decodeBuffer(publicKey); //Base64.decode(publicKey);
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		X509EncodedKeySpec keySpec = new X509EncodedKeySpec(buffer);
		RSAPublicKey pck = (RSAPublicKey) keyFactory.generatePublic(keySpec);
		
		Cipher cipher = Cipher.getInstance(algorithm);
		cipher.init(Cipher.ENCRYPT_MODE, pck);
		byte[] output = cipher.doFinal(reqData.getBytes());
		return (new BASE64Encoder()).encode(output);

	}
	
	/**
	 * 数据解密
	 * @param signStr
	 * @param privateKey
	 * @return
	 * @throws Exception
	 */
	public static String decrypt(String signStr, String privateKey) throws Exception {
		BASE64Decoder base64Decoder = new BASE64Decoder();
		RSAPrivateKey prk = null;
		byte[] buffer = base64Decoder.decodeBuffer(privateKey);
		PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(buffer);
		KeyFactory keyFactory = KeyFactory.getInstance("RSA");
		prk = (RSAPrivateKey) keyFactory.generatePrivate(keySpec);
		
		Cipher cipher = Cipher.getInstance(algorithm);
		cipher.init(Cipher.DECRYPT_MODE, prk);
		byte[] content = cipher.doFinal(base64Decoder.decodeBuffer(signStr));
		
		return new String(content, "UTF-8");
	}

    public static String getPrivateKey() {
        return privateKey;
    }

    public static void setPrivateKey(String privateKey) {
        RSAUtil.privateKey = privateKey;
    }

    public static String getPublickey() {
        return publickey;
    }

    public static void setPublickey(String publickey) {
        RSAUtil.publickey = publickey;
    }

    public static void main(String[] args) {
		String privateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAJyoA6wrpEKXX7DdR0lIL9SkSsAzoBZB16hNNS5IbZ4978X+tf6+yBzXWctd1/VOKsZ/y3SlR7FmezWUHbGtF3cI6r7v5EFzXcy3+zAX4JxrL/Ig2IDkl2XPAGwC1rbxVZJGXcPJLWTecfEoga9vlNujqXUCFZRn6tGaN3hqxFuXAgMBAAECgYAYiNfKZytaooqCEKXRfFTBYNm0MGGqGrXDzhO+I+nHFrwuri2isA53NeMCTrg72vooDGu44QnRZtN1GLVt1kYOR7k11gos0ZiV6IFxhSuyr3TVDWjKGHOcbqfrZsnSZCfgnnvwDLSBmk1oaCnYSIm7Z/ONbU5VsQMs6bUdelwTwQJBANAMD4B5ZrrmJKgNTgKFEHNtmiI2Gd8XHI2e/IYIWiHvO7DTXgmYaE1e1WmzyJihK9QYJg8+Gxk9UnpWZkK6ksUCQQDAw5wZay6hL9ZTljznu+ypjfQsLnyKP1D7CWPyZmBzwgEGj9JHJnzlTU3jdku+W/GdT7pGjSxN26Pqja/M0CqrAkEAjVT0HvnZ8POxSTyolwugLlnxkHYiQyxnKEouEDuSR2VGrowYYPpZON5IqmMIza8HoDC7gjVVoWLIKfWRyJkIZQJAQlXObSzmUg/dSMyFzxVrnvm70kx5DTY2zvzvSSaUAKH9ql1p9pQ3HM3ahPFbpXmMjx81sju4yF5SbVAu9GOamwJAWoz8dDudr87HjqNHn+/ohQ8vvrCfR5zBL+Fqj+G+DMaFiusTa1EsyxJPWb9qKifKybwWJvSVK+4Bn36mthPCiw==";
		String publickey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCcqAOsK6RCl1+w3UdJSC/UpErAM6AWQdeoTTUuSG2ePe/F/rX+vsgc11nLXdf1TirGf8t0pUexZns1lB2xrRd3COq+7+RBc13Mt/swF+Ccay/yINiA5JdlzwBsAta28VWSRl3DyS1k3nHxKIGvb5Tbo6l1AhWUZ+rRmjd4asRblwIDAQAB";
		try {
			String signed = encrypt("http://:808%%%0:fdsafds.com", publickey);
			String data = decrypt("g0q43+1mzKvQs1+YbJE+qIBCU/nMuI1UQ+m92fN3zdne3+f6BEtYYWL1LobFW9I32dS6cSjNRmhIvI8Lt1rCD80XJH7cWi/OiGWJyoE0s8EhAkMz4oW843umT+tXfvQ8PXF3KlyAOtFIl98MLsj3r5RK7DMANSLS8g64Ap6tYq8=", privateKey);
			System.out.println(data);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
