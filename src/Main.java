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

//        Создали файл со сторокой ...
//        File file = new File("CreatFile.txt");
//                try {
//            if (file.createNewFile()) {
//                try {
//                    FileWriter fw = new FileWriter("CreatFile.txt");
//                    fw.write("New text for file");
//                    fw.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        TreeSet treeSet = new TreeSet();
        String[] dataString = new String[]{};
        try {


            BufferedReader bufferedReader = new BufferedReader(new FileReader("CreatFile.txt"));

            dataString = bufferedReader.readLine().toLowerCase().replaceAll(" ", ",").split(",");

            for (int i = 0; i < (dataString.length -1) ; i++) {
                treeSet.add(dataString[i]);
            }
            bufferedReader.close();
            System.out.println(treeSet);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        File newFile = new File("Result.txt");
        try {
            newFile.createNewFile();
            FileWriter fw = new FileWriter("Result.txt");
            treeSet.first();
            for (int i = 0; i < (dataString.length -1) ; i++) {
                fw.write(dataString[i] + " ");

            }

            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}




