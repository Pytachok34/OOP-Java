package Laba1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        ClientCipher client = null;
        System.out.println("Введите что хотите сделать: \n 0 - выход \n 1 - код Цезаря \n 2 - код Морзе \n");
        int iterator = console.nextInt();
        console.nextLine(); // Consume the newline character
        
        while (iterator != 0) {
            switch (iterator) {
                case 1:
                    System.out.println("Введите что хотите расшифровать:");
                    String tmp = console.nextLine();
                    CesarCipher cc = new CesarCipher();
                    client = new ClientCipher(cc);
                    client.ShowCipher(tmp);
                    break;
                case 2:
                    System.out.println("Введите что хотите расшифровать:");
                    tmp = console.nextLine();
                    MorseСipher mc = new MorseСipher();
                    client = new ClientCipher(mc);
                    client.ShowCipher(tmp);
                    break;
                default:
                    break;
            }

            if (client!=null) {
                System.out.println("Хотите изменить тип шифрования: Y - да, N - нет");
                String c = console.nextLine();
                if (c.equalsIgnoreCase("Y")) {
                    System.out.println("На какой тип шифрования хотите изменить: \n 1 - код Цезаря \n 2 - код Морзе \n 3 - код Энигмы \n");
                    int tmp_iterator = console.nextInt();
                    console.nextLine(); // Consume the newline character
                    switch (tmp_iterator) {
                        case 1:
                            CesarCipher cc = new CesarCipher();
                            client.setCipher(cc);
                            System.out.println("Введите что хотите расшифровать:");
                            String tmp = console.nextLine();
                            client.ShowCipher(tmp);
                            break;
                        case 2:
                            MorseСipher mc = new MorseСipher();
                            client.setCipher(mc);
                            System.out.println("Введите что хотите расшифровать:");
                            tmp = console.nextLine();
                            client.ShowCipher(tmp);
                            break;
                        default:
                            break;
                    }
                }
            }

            System.out.println("Введите что хотите сделать: \n 0 - выход \n 1 - код Цезаря \n 2 - код Морзе\n");
            iterator = console.nextInt();
            console.nextLine(); // Consume the newline character
        }
    }
}