package XOR;

import java.util.Scanner;

public class XOR_new {
    public static void main(String[] args) {

        // Рандомный ключ
        System.out.println("Введите ключ (строка): ");
        Scanner scanner = new Scanner (System.in);
        String key = scanner.nextLine();

        // Строка для шифрования / дешифровки
        System.out.println("Введите строку для шифрования: ");
        String str = scanner.nextLine();;

        // Шифрование / дешифровка
        String cryptedStr = crypt(str, key);
        System.out.println("Зашифрованная строка: " + cryptedStr);

        String decryptedStr = crypt(cryptedStr, key);
        System.out.println("Расшифрованная строка: " + decryptedStr);

    }

    // Метод для шифрования / дешифровки
    private static String crypt(String str, String key) {

        // Преобразуем в байты ключ и строку с текстом
        byte[] keyBytes = key.getBytes();
        byte[] strBytes = str.getBytes();

        // Создаем массив для хранения зашифрованного текста длиной, равной strBytes
        byte[] cryptedBytes = new byte[strBytes.length];

        // Заполняем массив cryptedBytes зашифрованными байтами (XOR-им исходные байты)
        int p = 0;
        for (int i = 0; i < strBytes.length; i++) {
            cryptedBytes[i] = (byte) (strBytes[i] ^ keyBytes[p]);

            if (p == keyBytes.length - 1) {
                p = 0;
            } else {
                p++;
            }

        }

        // Объект класса String; позволяет создать строку из зашифрованных байтов
        String cryptedStr = new String(cryptedBytes);
        return cryptedStr;
    }
}
