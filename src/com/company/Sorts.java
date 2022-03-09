package com.company;

public class Sorts {
    public static Result InclusionSort(Object[] mas)
    {
        Result result = new Result(mas);
        for(int i=1;i< result.resultMas.length;i++){
            for(int j=i; j>0;j--){
                result.numberСomp++;
                if(mas[0] instanceof Character && (char)result.resultMas[j-1]<(char)result.resultMas[j])break;else
                if(mas[0] instanceof Integer && (int)result.resultMas[j-1]<(int)result.resultMas[j])break;
                result.numberPerm++;
                Object tmp=result.resultMas[j-1];
                result.resultMas[j-1]=result.resultMas[j];
                result.resultMas[j]=tmp;
            }
        }
        return result;
    }
    public static Result SelectionSort(Object[] mas)
    {
        Result result = new Result(mas);
        for (int i = 0; i < result.resultMas.length; i++) {
            int pos = i;
            Object min = result.resultMas[i];
            for (int j = i + 1; j < result.resultMas.length; j++) {
                result.numberСomp++;
                if (result.resultMas[0] instanceof Character &&(char)result.resultMas[j] < (char)min || result.resultMas[0] instanceof Integer &&(int)result.resultMas[j] < (int)min) {
                    pos = j;
                    min = result.resultMas[j];
                }
            }
            result.numberPerm++;
            result.resultMas[pos] = result.resultMas[i];
            result.resultMas[i] = min;
        }
        return result;
    }
    public static Result ShakerSort(Object[] mas)
    {
        Result result = new Result(mas);
        int leftMark = 1, rightMark = result.resultMas.length - 1;
        while (leftMark <= rightMark) {
            for (int i = rightMark; i >= leftMark; i--){
                result.numberСomp++;
                if (result.resultMas[0] instanceof Character && (char)result.resultMas[i - 1] > (char)result.resultMas[i] || result.resultMas[0] instanceof Integer && (int)result.resultMas[i - 1] > (int)result.resultMas[i])
                {
                    result.numberPerm++;
                    Object tmp=result.resultMas[i-1];
                    result.resultMas[i-1]=result.resultMas[i];
                    result.resultMas[i]=tmp;
                }
            }
            leftMark++;
            for (int i = leftMark; i <= rightMark; i++){
                result.numberСomp++;
                if (result.resultMas[0] instanceof Character && (char)result.resultMas[i - 1] > (char)result.resultMas[i] || result.resultMas[0] instanceof Integer && (int)result.resultMas[i - 1] > (int)result.resultMas[i])
                {
                    result.numberPerm++;
                    Object tmp=result.resultMas[i-1];
                    result.resultMas[i-1]=result.resultMas[i];
                    result.resultMas[i]=tmp;
                }
            }
            rightMark--;
        }
        return result;
    }
    public static Result QuickSort(Object[] mas)
    {
        Result result = new Result(mas);
        if(mas.length!=0)
        {
            quickSort(result, 0,result.resultMas.length-1);
        }
        return result;
    }
    public static void quickSort(Result result, int low, int high) {

        if (low >= high) return;
        int middle = low + (high - low) / 2;
        Object opora = result.resultMas[middle];
        int i = low, j = high;
        while (i <= j) {
            result.numberСomp++;
            while (result.resultMas[0] instanceof Character && (char)result.resultMas[i] < (char)opora||result.resultMas[0] instanceof Integer && (int)result.resultMas[i] < (int)opora) {
                i++;
            }
            result.numberСomp++;
            while (result.resultMas[0] instanceof Character && (char)result.resultMas[j] > (char)opora||result.resultMas[0] instanceof Integer && (int)result.resultMas[j] > (int)opora) {
                j--;
            }
            if (i <= j) {
                result.numberPerm++;
                Object temp = result.resultMas[i];
                result.resultMas[i] = result.resultMas[j];
                result.resultMas[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j) quickSort(result, low, j);
        if (high > i) quickSort(result, i, high);
    }
    public static Result HeapSort(Object[] mas) {
        Result result = new Result(mas);
        int size = result.resultMas.length-1;
        for (int i = result.resultMas.length / 2; i >= 0; i--) {
            heapify(result.resultMas, i, size, result);
        }
        for(int i= size; i>=0; i--) {
            result.numberPerm++;
            Object temp = result.resultMas[0];
            result.resultMas[0] = result.resultMas[size];
            result.resultMas[size] = temp;
            size--;
            heapify(result.resultMas, 0, size, result);
        }
        return result;
    }
    public static void heapify (Object[] myArray, int i, int heapSize,Result result) {
        int a = 2*i, b = 2*i+1, largestElement = i;
        result.numberСomp++;
        if (a<= heapSize &&(myArray[0] instanceof Character && (char)myArray[a] > (char)myArray[i] || myArray[0] instanceof Integer && (int)myArray[a] > (int)myArray[i])) {
            largestElement = a;
        }
        result.numberСomp++;
        if (b <= heapSize && (myArray[0] instanceof Character && (char)myArray[b] > (char)myArray[largestElement] || myArray[0] instanceof Integer && (int)myArray[b] > (int)myArray[largestElement])) {
            largestElement = b;
        }
        if (largestElement != i) {
            result.numberPerm++;
            Object temp = myArray[i];
            myArray[i] = myArray[largestElement];
            myArray[largestElement] = temp;
            heapify(myArray, largestElement, heapSize, result);
        }
    }
}
