package com.company;

import java.util.ArrayList;

public class Main {
    //Написать метод, который создаст список, положит в него 10 элементов,
    // затем удалит первые два и последний, а затем выведет результат на экран.

    public static void main(String[] args) {
        List newList = new List();

        newList.makeList();
        newList.printInfo();
        
        newList.removeElements();
        newList.printInfo();
    }
}
