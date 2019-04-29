package com.rsa.encodeanddecode;  


public class MainTest {  
  
    public static void main(String[] args) throws Exception {  
        String filepath="F:/RSAkey-produce/";  
  
//      RSAEncrypt.genKeyPair(filepath);  
          
          
       /* System.out.println("--------------��Կ����˽Կ���ܹ���-------------------");  
        String plainText="���ǲ���ԭ��_��Կ����˽Կ����";  
        //��Կ���ܹ���  
        byte[] cipherData=RSAEncrypt.encrypt(RSAEncrypt.loadPublicKeyByStr(RSAEncrypt.loadPublicKeyByFile(filepath)),plainText.getBytes());  
        String cipher=Base64.encode(cipherData);  
        //˽Կ���ܹ���  
        byte[] res=RSAEncrypt.decrypt(RSAEncrypt.loadPrivateKeyByStr(RSAEncrypt.loadPrivateKeyByFile(filepath)), Base64.decode(cipher));  
        String restr=new String(res);  
        System.out.println("ԭ�ģ�"+plainText);  
        System.out.println("���ģ�"+cipher);  
        System.out.println("���ܣ�"+restr);  */
         
        System.out.println("--------------˽Կ���ܹ�Կ���ܹ���-------------------");  
        String plainText="���ǲ���ԭ_˽Կ���ܹ�Կ����";  
        //˽Կ���ܹ���  
        byte[] cipherData=RSAEncrypt.encrypt(RSAEncrypt.loadPrivateKeyByStr(RSAEncrypt.loadPrivateKeyByFile(filepath)),plainText.getBytes());  
        String cipher=Base64.encode(cipherData);  
        //��Կ���ܹ���  
        byte[] res=RSAEncrypt.decrypt(RSAEncrypt.loadPublicKeyByStr(RSAEncrypt.loadPublicKeyByFile(filepath)), Base64.decode(cipher));  
        String restr=new String(res);  
        System.out.println("ԭ�ģ�"+plainText);  
        System.out.println("���ģ�"+cipher);  
        System.out.println("���ܣ�"+restr);  
        System.out.println();  
          
        
        Student s = new Student();
		s.setAge(11);
		s.setName("lihonghui");
		s.setId("no1233");
		String content=s.toString();
		
		
        System.out.println("---------------˽Կ����ǩ��------------------");  
//        String content="ihep_��������ǩ����ԭʼ����";  
        String signstr=RSASignature.sign(content,RSAEncrypt.loadPrivateKeyByFile(filepath));  
        System.out.println("ǩ��ԭ����"+content);  
        System.out.println("ǩ������"+signstr);  
          
        System.out.println("---------------��ԿУ��ǩ��------------------");  
        System.out.println("ǩ��ԭ����"+content);  
        System.out.println("ǩ������"+signstr);  
        System.out.println("��ǩ�����"+RSASignature.verify(content, signstr, RSAEncrypt.loadPublicKeyByFile(filepath)));  
        
        
        
    }  
}  
