package com.company;

public class Result {
    public int numberСomp, numberPerm;
    public Object[] resultMas;
    public Result(Object[] mas)
    {
        numberСomp = 0;
        numberPerm = 0;
        resultMas = mas.clone();
    }

}
