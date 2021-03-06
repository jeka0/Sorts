package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Введите размер массива:");
        int count = Console.ReadInt32();
        Object[] mas = new Object[count];
        FillMas(mas,Console.ChooseType());
        Console.ShowMas(mas, "Сгенерированный массив:");
        Console.PrintResult(Sorts.InclusionSort(mas),"Результат сортировки включением:");
        Console.PrintResult(Sorts.SelectionSort(mas),"Результат сортировки выбором:");
        Console.PrintResult(Sorts.ShakerSort(mas),"Результат шейкерной сортировки:");
        Console.PrintResult(Sorts.QuickSort(mas),"Результат быстрой сортировки Хоара :");
        Console.PrintResult(Sorts.HeapSort(mas),"Результат пирамидальной сортировки:");
    }
    public static void FillMas(Object[] mas, int type)
    {
        Random random = new Random();
        for(int i = 0;i< mas.length;i++)
        {
            if(type == 1)mas[i] = (char)(random.nextInt('z' - 'a') + 'a');else mas[i] = (int)(random.nextInt(890 + 123) - 123);
        }
    }

}
