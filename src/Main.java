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

        List list = new ArrayList();
        LinkedList result = new LinkedList();
//        Создали файл со сторокой ...
        try {
            FileWriter = new File("CreatFile.txt");
            while ((data = fileReader.read())!= -1){
               System.out.print((char) data);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            List arrayList = new ArrayList();

            BufferedReader bufferedReader = new BufferedReader(new FileReader("CreatFile.txt"));
            String dataString;
            dataString = bufferedReader.readLine().toLowerCase();

            System.out.print(dataString);
            System.out.println();
            int z = 0;
            for ( int i= 0; i == dataString.length(); i++){
                if (arrayList.get(i) != " " || arrayList.get(i) != "." || arrayList.get(i) != "," || arrayList.get(i) != " "  ) {
                    result.add(z,arrayList.get(i));

                } else {
//                    System.out.println(result.get(z));
                    z = z++;
                }
            }
            System.out.println(result);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}




