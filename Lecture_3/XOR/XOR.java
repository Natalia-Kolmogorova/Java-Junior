package XOR;

public class XOR {
    public static void main(String[] args) {

        // Рандомный ключ
        int key = (int) (Math.random() * 10);

        // Строка для шифрования / дешифровки
        String str = "Привет, человек";
        System.out.println("Исходная строка: " + str);

        // Шифрование / дешифровка
        String cryptedStr = crypt(str, key);
        System.out.println("Зашифрованная строка: " + cryptedStr);

        String decryptedStr = crypt(cryptedStr, key);
        System.out.println("Расшифрованная строка: " + decryptedStr);

    }

    // Метод для шифрования / дешифровки
    private static String crypt(String str, int key) {

        // Преобразуем строку с текстом в байты
        byte[] strBytes = str.getBytes();

        // Создаем массив для хранения зашифрованного текста длиной, равной strBytes
        byte[] cryptedBytes = new byte[strBytes.length];

        // Заполняем массив cryptedBytes зашифрованными байтами (XOR-им исходные байты)
        for (int i = 0; i < strBytes.length; i++) {
            cryptedBytes[i] = (byte) (strBytes[i] ^ key);
        }

        // Объект класса String; позволяет создать строку из зашифрованных байтов
        String cryptedStr = new String(cryptedBytes);
        return cryptedStr;
    }
}
