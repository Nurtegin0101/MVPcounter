package com.example.mvpcounter;

public class PresenterContracts {

    public interface CounterView {
        void updateCount(int count);
        void toast();
        void setColor();
    }

    public interface CounterPresenter {
        void increment();

        void decrement();
        void checkIsFive();
        void checkIsTen();

        void attachView(CounterView counterView);
    }
}

