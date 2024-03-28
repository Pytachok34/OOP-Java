package Laba1;

import java.util.HashMap;

public class MorseСipher implements Cipher {
    private static final HashMap<Character, String> morseCodeMap = new HashMap<>();
    static {
        // Заполнение таблицы соответствия символов и их кодировки в азбуке Морзе
        morseCodeMap.put('A', ".-");
        morseCodeMap.put('B', "-...");
        morseCodeMap.put('C', "-.-.");
        morseCodeMap.put('D', "-..");
        morseCodeMap.put('E', ".");
        morseCodeMap.put('F', "..-.");
        morseCodeMap.put('G', "--.");
        morseCodeMap.put('H', "....");
        morseCodeMap.put('I', "..");
        morseCodeMap.put('J', ".---");
        morseCodeMap.put('K', "-.-");
        morseCodeMap.put('L', ".-..");
        morseCodeMap.put('M', "--");
        morseCodeMap.put('N', "-.");
        morseCodeMap.put('O', "---");
        morseCodeMap.put('P', ".--.");
        morseCodeMap.put('Q', "--.-");
        morseCodeMap.put('R', ".-.");
        morseCodeMap.put('S', "...");
        morseCodeMap.put('T', "-");
        morseCodeMap.put('U', "..-");
        morseCodeMap.put('V', "...-");
        morseCodeMap.put('W', ".--");
        morseCodeMap.put('X', "-..-");
        morseCodeMap.put('Y', "-.--");
        morseCodeMap.put('Z', "--..");
    }
    public String encrypt(String text) {
        StringBuilder encryptedText = new StringBuilder();
        text = text.toUpperCase();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (morseCodeMap.containsKey(c)) {
                encryptedText.append(morseCodeMap.get(c)).append(" ");
            } else if (c == ' ') {
                encryptedText.append("/ ");
            }
        }

        return encryptedText.toString();
    }
}
