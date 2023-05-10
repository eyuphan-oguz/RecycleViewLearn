package com.eyuphanoguz.recycleviewlearn;

import java.util.ArrayList;

public class Fruits {

    private String fruitName;
    private int fruitCal;
    private int fruitImage;


    public Fruits(){}

    public Fruits(String fruitName, int fruitCal, int fruitImage) {
        this.fruitName = fruitName;
        this.fruitCal = fruitCal;
        this.fruitImage = fruitImage;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getFruitCal() {
        return fruitCal;
    }

    public void setFruitCal(int fruitCal) {
        this.fruitCal = fruitCal;
    }

    public int getFruitImage() {
        return fruitImage;
    }

    public void setFruitImage(int fruitImage) {
        this.fruitImage = fruitImage;
    }


    static public ArrayList<Fruits> getData(){
        ArrayList<Fruits> fruitsArrayList = new ArrayList<Fruits>();
        String[] fruits = {"Muz","Kiraz","Çilek","Elma"};
        int[] calories = {15,5,25,30};
        int[] images = {R.drawable.muz,R.drawable.kiraz,R.drawable.cilek,R.drawable.elma};

        for(int i=0 ; i<fruits.length ; i++){
            Fruits fruits1 = new Fruits();
            fruits1.setFruitName(fruits[i]);
            fruits1.setFruitCal(calories[i]);
            fruits1.setFruitImage(images[i]);

            fruitsArrayList.add(fruits1);
        }
        return fruitsArrayList;

    }

}
