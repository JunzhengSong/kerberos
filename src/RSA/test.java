package RSA;

public class test {
    private final static String[] Kc = {"3096589494327972966542767555645488415857410521298179560751893624567975523927775168085739664949238616280271893353946263715523651672294362843822766996968340714023382235747900221065977","3889"}; //client公钥
    private final static String[] selfK ={"3096589494327972966542767555645488415857410521298179560751893624567975523927775168085739664949238616280271893353946263715523651672294362843822766996968340714023382235747900221065977" , "1152163794881094595676879571359995304125912323044089952277703799112846640042039256420690483427161040887459792478554485040196767218736825329254102072887596847184101841933983341452289"}; //client私钥

    public static void main(String[] args) {
        String s="1是为1";
        RSA rsa = new RSA();
        String s2 = rsa.encrypt(s,Kc);
        System.out.println("加密后的"+s2);
        String s3=rsa.decrypt(s2,selfK);
        System.out.println("解密后的"+s3);


    }
}
