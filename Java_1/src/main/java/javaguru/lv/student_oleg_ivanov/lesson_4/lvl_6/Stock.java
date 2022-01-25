package javaguru.lv.student_oleg_ivanov.lesson_4.lvl_6;

import javaguru.lv.teacher.annotations.CodeReview;

//task_17
@CodeReview(approved = true)
public class Stock {
    String companyName;
    int currentValue;
    int minValue;
    int maxValue;

    public Stock(String companyName, int currentValue) {
        this.companyName = companyName;
        this.currentValue = currentValue;
        this.minValue = currentValue;
        this.maxValue = currentValue;

    }

    public void updatePrice(int newValue) {
        currentValue = newValue;
        if (maxValue < newValue) {
            maxValue = newValue;
        } else if (minValue > newValue) {
            minValue = newValue;
        }

    }

    public int getCurrentValue() {
        return currentValue;
    }


    public int getMinValue() {
        return minValue;
    }


    public int getMaxValue() {
        return maxValue;
    }


    public void getPriceInformation() {
        System.out.println(companyName + " Current value = " + getCurrentValue());
        System.out.println(companyName + " Min value = " + getMinValue());
        System.out.println(companyName + " Max value = " + getMaxValue());


    }
}
