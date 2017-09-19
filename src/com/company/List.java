package com.company;

import java.util.ArrayList;
import java.util.Random;

public class List {
    ArrayList <Integer> myList = new ArrayList<Integer>();

    public List(ArrayList<Integer> a) {
        this.myList = myList;
    }

    public List() {
    }

    @Override
    public String toString() {
        return "List{" +  "myList=" + myList +  '}';
    }

    public void makeList(){
        for (int i =0; i <10; i++){
            Random ran = new Random();
            myList.add(ran.nextInt(50));

        }
    }

    public void removeElements(){
        myList.remove(0);
        myList.remove(0);
        myList.remove(myList.size()-1);
    }

    public void printInfo(){
        System.out.println(myList);
    }


}

