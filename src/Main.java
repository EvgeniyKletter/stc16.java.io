/**
 * Задание 1. Написать программу, читающую текстовый файл.
 * Программа должна составлять отсортированный по алфавиту список слов,
 * найденных в файле и сохранять его в файл-результат.
 * Найденные слова не должны повторяться, регистр не должен учитываться.
 * Одно слово в разных падежах – это разные слова. * *
 *
 * Задание 2. Создать генератор текстовых файлов, работающий по следующим правилам:
 * Предложение состоит из 1<=n1<=15 слов. В предложении после произвольных слов могут находиться запятые.
 * Слово состоит из 1<=n2<=15 латинских букв
 * Слова разделены одним пробелом
 * Предложение начинается с заглавной буквы
 * Предложение заканчивается (.|!|?)+" "
 * Текст состоит из абзацев. в одном абзаце 1<=n3<=20 предложений. В конце абзаца стоит разрыв строки и перенос каретки.
 * Есть массив слов 1<=n4<=1000. Есть вероятность probability вхождения одного из слов этого массива в следующее предложение (1/probability).
 * Необходимо написать метод getFiles(String path, int n, int size, String[] words, int probability),
 * который создаст n файлов размером size в каталоге path. words - массив слов, probability - вероятность.
 */

import java.io.*;
import java.util.*;



public class Main {
    public static void main(String[] args) {
// Задание 1.
        TreeSet treeSet = new TreeSet();
        String[] dataString = new String[]{};
        File file = new File("CreatFile.txt");
//Создали Source файл со сторокой

        try {
            if (file.createNewFile()) {
                try {
                    FileWriter fw = new FileWriter("CreatFile.txt");
                    fw.write("I created the CreatFile txt file using, the FileOutputStream method.");
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//Полученные данные обрабатываем по необходимым условиям...
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("CreatFile.txt"));
            dataString = bufferedReader.readLine().toLowerCase().split(" ");
            for (int i = 0; i < (dataString.length -1) ; i++) {
                treeSet.add(dataString[i]);
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

//Создаём Result файл и загружаем результат
        try {
            file.createNewFile();
            FileWriter fw = new FileWriter("Result.txt");
            fw.write(treeSet.toString());
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}




