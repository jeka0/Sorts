package com.company;
import java.util.Scanner;
public class Console {
    static Scanner in = new Scanner(System.in);
    public static void ShowMas(Object[] mas, String str)
    {
        System.out.println(str);
        for(int i = 0;i< mas.length;i++)
        {
            System.out.print(" "+mas[i].toString());
        }
        System.out.println("");
    }
    public static void WriteMessage(String str)
    {
        System.out.println(str);
    }
    public static void PrintResult(Result result, String str)
    {
        Console.ShowMas(result.resultMas, str);
        Console.WriteMessage("Количество сравнений: " + result.numberСomp + "\n" +"Количество перестановок: " + result.numberPerm+"\n");
    }
    public static int ChooseType()
    {
        System.out.print("Выберите тип элементов массива:\n1. Char\n2. Int\n/#>");
        int num;
        boolean flag;
        do {
            flag = false;
            num = ReadInt32();
            if(num > 2){flag = true;System.out.println("При вводе значения, произошла ошибка!!!\nПовторите ввод:");}
        }while(flag);
        return num;
    }
    public static int ReadInt32()
    {
        int num = 0;
        boolean flag;
        do {
            flag = false;
            try {
                num = Integer.parseInt(in.next());
                if(num<=0)throw new Exception();
            } catch (Exception e) {
                System.out.println("При вводе значения, произошла ошибка!!!\nПовторите ввод:");
                flag = true;
            }
        }while(flag);
        return num;
    }
}
