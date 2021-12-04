package com.company;

import java.awt.*;
import java.util.Scanner;
import java.util.HashSet;

public class Main {


    //метод который принимает 2 инта и знак стринг и выводит результат
    public static int calc(String op, int a, int b) {
        int res = 0;

        switch (op) {
            case ("+"):
                res = a + b;
                break;
            case ("-"):
                res = a - b;
                break;
            case ("/"):
                res = a / b;
                break;
            case ("*"):
                res = a * b;
                break;
        }
        return res;
    }

    //Метод конвертации римского числа в арабское
    //Если принимает арабское число то возвращает арабское
    //Возвращает int

    public static int RimToArabic(String a)
    {
        //Создали массив римских цифр где значение риского числа равно номеру элемента массива
        String[] rimNumbers = {
                "0",
                "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"       };

        //проверяем соотвествует ли число элементу массива, если да то возвращается его
        int num=0;

        for (int i = 0; i <= 100; i++)
        {
            if (a.equals(rimNumbers[i])){
                num=i;
                i=100;
            }
        }

        if (num==0){
            num = Integer.parseInt(a);
        }

        return(num);
    }

    //Метод конвертации арабского числа в римское
    //Диапозон конвертации 1..100
    public static String ArabicToRim(int i) {
        //Создали массив римских цифр где значение риского числа равно номеру элемента массива
        String[] rimNumbers = {
                "0",
                "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
                "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
                "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
                "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"

        };

        return (rimNumbers[i]);

    }

    //метод в случае если число арабское возвращает True
    //принимает string, возвращает boolean

    public static boolean arabicTrue(String a){

        //Множество допустимых арабских цифр
        HashSet<String> arabicSet = new HashSet<>();
        arabicSet.add("1");
        arabicSet.add("2");
        arabicSet.add("3");
        arabicSet.add("4");
        arabicSet.add("5");
        arabicSet.add("6");
        arabicSet.add("7");
        arabicSet.add("8");
        arabicSet.add("9");
        arabicSet.add("0");

        //проходим строку и проверяем отсутствуют ли в ней знаки с множества
        //если в строке присутсвуют иные символы которые не ходят в множество то возвращаем false
        //во всех прочих случаях true

        boolean res = true;

        for(int i=0;i<a.length();i++) {
            if (!(arabicSet.contains(("" + a.charAt(i))))) {
                res = false;
                break;
            }
        }
        return res;
    }


    //Программа определяет римское ли это число
    //принимает string, возвращает boolean

    public static boolean rimTrue(String a){

        //Множество римских цифр
        HashSet<String> rimSet = new HashSet<>();
        rimSet.add("I");
        rimSet.add("V");
        rimSet.add("X");
        rimSet.add("C");
        rimSet.add("L");
        rimSet.add("D");
        rimSet.add("M");


        //проходим строку и проверяем отсутствуют ли в ней знаки с множества
        //если в строке присутсвуют иные символы которые не ходят в множество то возвращаем false
        //во всех прочих случаях true

        boolean res = true;

        for(int i=0;i<a.length();i++) {
            if (!(rimSet.contains(("" + a.charAt(i))))) {
                res = false;
                break;
            }
        }
        return res;
    }



    public static void main(String[] args) {
        while (true){
            //цикл while позволит не перезапускать программу для повторного тестирования

            while (true) {
                System.out.println("Введите выражение для подсчета");

                //переменная считающая ошибки
                int error = 0;




                //ввод с клавиатуры
                Scanner consoleRAW = new Scanner(System.in);
                String checkInput = consoleRAW.nextLine();


                //Написать парсер который принимает строку и возвращает a op b
                //Он должен обрабатывать все возможные исключения
                String resStr = "";


                //удаляем все пробелы введенные пользователем с начала строки
                while (checkInput.charAt(0)==' '){
                    if (checkInput.charAt(0) == (' ')) {
                        checkInput = checkInput.substring(1);}
                }
                //удаляем все пробелы введенные пользователем с конца строки строки
                while (checkInput.charAt(checkInput.length()-1)==' '){
                    if (checkInput.charAt(checkInput.length()-1) == (' ')) {
                        checkInput =  checkInput.substring(0, (checkInput.length() - 1));
                    }
                }
                //удаляем все пробелы если они стоят вместе и оставляем только один
                for (int i = 0;i<(checkInput.length());i++) {

                    if ((checkInput.charAt(i) == (' ') && ((checkInput.charAt(i + 1) == (' '))))) {

                    } else {
                        resStr = resStr + checkInput.charAt(i);
                    }
                }
                checkInput = resStr;





                //обрабатываем сканер консоль получая стринг
                //молимся на то чтобы пользователь ввел A + B
                //код который проверяет не равен ли b.length() == 0

                Scanner console = new Scanner(checkInput);
                String a = console.next();
                String op = console.next();
                String b = console.next();




                //Похоже ли то что ввел пользователь на то что мы хотели от него?
                if (!(checkInput.equals((a+" "+op+" "+b)))) {
                    System.out.println("Введенное выражение нельзя разделить на <операнд> + <операция> + <операнд> и ничего не потерять");
                    error++;
                }
                if (error>0){
                    break;
                }


                //Пользователь ввел недостаточно информации
                if (b.length() == 0) {
                    System.out.println("Кажется вы забыли пробелы или ввели что-то не правильно");
                    error++;
                }
                if (error>0){
                    break;
                }







                //приводим строки к верхнему регистру (для удобства)
                //i->I    v->V
                a = a.toUpperCase();
                b = b.toUpperCase();






                //Калькулятор умеет работать только с целыми числами.
                //Проверка выражения на допустимые символы
                //В тч если в нем будет присутсвовать точка или запятая то выйдет усключение
                String cons = a + op + b;
                //создаю множество всех возможных знаков которые могут присутствовать в выражении и будут уместны
                HashSet<String> charSet = new HashSet<>();
                charSet.add("0");
                charSet.add("1");
                charSet.add("2");
                charSet.add("3");
                charSet.add("4");
                charSet.add("5");
                charSet.add("6");
                charSet.add("7");
                charSet.add("8");
                charSet.add("9");
                charSet.add(" ");
                charSet.add("I");
                charSet.add("V");
                charSet.add("X");
                charSet.add("C");
                charSet.add("L");
                charSet.add("D");
                charSet.add("M");
                charSet.add("+");
                charSet.add("-");
                charSet.add("*");
                charSet.add("/");

                //Проверяем входит ли символ в множество, если нет то выдаем исключение

                for (int i = 0; i < cons.length(); i++) {
                    if (!(charSet.contains(("" + cons.charAt(i))))) {
                        System.out.println("Выражение содержит неподдерживаемые символы");
                        error++;
                    }
                }
                if (error>0){
                    break;
                }



                //При вводе пользователем неподходящих чисел приложение выбрасывает исключение и завершает свою работу.
                //проверка введенных чисел на присутствие в диапазоне 1..10 или I..X
                if (!((RimToArabic(a)>=1)&&(RimToArabic(a)<=10))) {
                    System.out.println("Введенное число " + a + " не присутсвует в диапазоне 1..10 или I..X");
                    break;
                }
                if ((!((RimToArabic(b)>=1)&&(RimToArabic(b)<=10)))) {
                    System.out.println("Введенное число " + b + " не присутсвует в диапазоне 1..10 или I..X");
                    break;
                }


                //При вводе пользователем строки, не соответствующей одной из вышеописанных
                //арифметических операций, приложение выбрасывает исключение и завершает свою работу.


                //Создаем множество поддерживаемых операций
                HashSet<String> opSet = new HashSet<>();
                opSet.add("+");
                opSet.add("-");
                opSet.add("/");
                opSet.add("*");

                //Если операция не входит во множество операций от делаем break;
                if (!(opSet.contains(op))) {
                    System.out.println("Операция " + op + " не поддерживается калькулятором или математикой в целом");
                    break;
                }
                //Проверка на количество знаков операций в выражении

                int opi = 0;

                for (int i = 0; i < cons.length(); i++) {
                    if ((opSet.contains(("" + cons.charAt(i))))) {
                        opi++;
                    }
                }
                if (opi != 1) {
                    System.out.println("Количество операторов в больше 1");
                }


/*

текст чисто по приколу

            //Проверка на наличие операндов
            if ((a.equals("")) || b.equals("") || op.equals("")) {
                errors.add("Один из операндов отсуствует");
            }

*/






                //если оба чисел арабские
                //Начинаем калькулировать для арабских цифр
                if (arabicTrue(a) && arabicTrue(b)) {
                    System.out.print("Результат ");
                    System.out.println(calc(op,Integer.parseInt(a),Integer.parseInt(b)));
                }

                //если оба числа римские
                //Начинаем калькулировать для римских цифр
                else if (rimTrue(a) && rimTrue(b)){

                    if  ((calc(op, RimToArabic(a), RimToArabic(b)))>0){
                        System.out.print("Результат ");
                        System.out.println(ArabicToRim(calc(op, RimToArabic(a), RimToArabic(b))));
                    }else{
                        System.out.println("Римские числа многут быть только положительными и не равняться нулю");
                        break;
                    }
                }
                else {
                    //Калькулятор умеет работать только с арабскими или римскими цифрами одновременно,
                    //при вводе пользователем строки вроде 3 + II калькулятор должен выбросить исключение
                    //и прекратить свою работу.
                    System.out.println("Калькулятор не умеет работать с числами из разных систем счисления");
                    break;
                }

            }
        }
    }

}




