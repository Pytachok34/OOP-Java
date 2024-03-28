import static org.junit.jupiter.api.Assertions.*;

import Laba1.CesarCipher;
import Laba1.ClientCipher;
import Laba1.MorseСipher;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestSource {
    @Test
    public void cesarTest()
    {
        CesarCipher cc = new CesarCipher();
        assertEquals("Vwurnd",cc.encrypt("Stroka"));

    }
    @Test
    public void MorseTest()
    {
        MorseСipher mc = new MorseСipher();
        assertEquals(".... . .-.. .-.. --- ",mc.encrypt("Hello"));
    }
    @Test
    public void SetCipherTest() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        // Вызываем метод, который печатает строку в консоль
        CesarCipher cc = new CesarCipher();
        ClientCipher client = new ClientCipher(cc);
        MorseСipher mc = new MorseСipher();
        client.setCipher(mc);
        client.ShowCipher("Good bye");
        // Проверяем, что метод напечатал правильную строку
        assertEquals("--. --- --- -.. / -... -.-- . ", outContent.toString());

        // Возвращаем стандартный поток вывода
        System.setOut(System.out);
    }
}
