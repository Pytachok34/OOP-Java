package Laba1;

public class ClientCipher {
    Cipher cipher;
    public ClientCipher(Cipher cc)
    {
        cipher=cc;
    }
    public void ShowCipher(String str)
    {
        System.out.print(cipher.encrypt(str));
    }
    public void setCipher(Cipher cc)
    {
        cipher = cc;
    }
}
