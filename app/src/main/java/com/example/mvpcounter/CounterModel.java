package com.example.mvpcounter;

public class CounterModel {

    private int count = 0;
    private boolean F = false;
    private boolean T = false;

    public void increment() {
        count++;
        switch (count){
            case  5:
                F = true ;
                T = false ;
                break;
            case  10:
                T = true ;
                F = false ;
                break;
            default:
                F = false;
                T = false ;
                break;
        }
    }

    public void decrement() {
        count--;
        switch (count){
            case  5:
                F = true ;
                T = false ;
                break;
            case  10:
                T = true ;
                F = false ;
                break;
            default:
                F = false;
                T = false ;
                break;
        }
    }

    public int getCount() {
        return count;
    }

    public boolean isFive() {
        return F;
    }

    public boolean isTen() {
        return T;
    }
}

