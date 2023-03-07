package task_140223HW;

// "Написать класс который содержит ArrayList и методы: " +

import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.util.*;

public class HW12_ArrayList_Iterator {


    static Random rd = new Random();
    static public String s = "abcdeffghij";

    public static void main(String[] args) {


        ArrayList<Integer> listInteger = new ArrayList<>();
        // заполняют лист рандомными цифрами
        System.out.println(getRandomInteger(listInteger, 10, 10));
        // перебирают Итератором и выводят на экран все четные
        divisibleByTwo(listInteger);
        //перебирают итератором и выводят на экран все нечетные
        notDivisibleByTwo(listInteger);
        //генерируют рандомную стрингу длиной 5
        String a = getRandomString(s);
        // - перебираю итератором эту стрингу с конца и выводит тот символ который нужен если он есть,
        //   если нет то выдает сообщение"
        findCharacter('a');
        findCharacterVariant2('a');
    }
// - заполняют лист рандомными цифрами
    public static ArrayList<Integer> getRandomInteger(ArrayList<Integer> list, int listSizeInteger, int diapason) {
        for (int i = 0; i < listSizeInteger; i++) {
            list.add(rd.nextInt(diapason));
        }
        return list;
    }
 //перебирают Итератором и выводят на экран все четные
    public static void divisibleByTwo(ArrayList<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int a = iterator.next();
            if (a % 2 == 0)
                System.out.printf("%2d", a);
        }
        System.out.println();
    }

    //перебирают итератором и выводят на экран все нечетные
    public static void notDivisibleByTwo(ArrayList<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int a = iterator.next();
            if (a % 2 != 0)
                System.out.printf("%2d", a);
        }
        System.out.println();
    }
    // генерируют рандомную стрингу длиной 5
    public static String getRandomString(String s) {
        char[] word = new char[5];
        for (int i = 0; i < 5; i++) {
            word[i] = s.charAt(rd.nextInt(s.length()));
        }
        s = String.valueOf(word);
        return s;
    }

    //  - перебираю итератором эту стрингу с конца и выводит тот символ который нужен если он есть,
    //    если нет то выдает сообщение"
    public static char findCharacter(char a) {
        String b = getRandomString(s);
        System.out.println(b);
        CharacterIterator it = new StringCharacterIterator(b);
        for (char ch = it.last(); ch != CharacterIterator.DONE; ch = it.previous()) {
            System.out.print(ch);
            if (it.current() == a) {
                System.out.println("  super ");
            } else {
                System.out.println("  not found");
            }
        }
        return a;
    }

    // - перебираю итератором эту стрингу с конца и выводит тот символ который нужен если он есть,
   //    если нет то выдает сообщение"
    public static void findCharacterVariant2(char a) {
        String b = getRandomString(s);
        System.out.println(b);
        int index = b.indexOf(a);
        CharacterIterator it = new StringCharacterIterator(b);
        for (char ch = it.last(); ch != CharacterIterator.DONE; ch = it.previous()) {
            if (index > 0) {
                System.out.println("  super " + a);
            } else if (index < 0)
                System.out.println("  not found");
            index = 0;
        }
    }
}