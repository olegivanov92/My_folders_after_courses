package javaguru.lv.student_oleg_ivanov.lesson_3.lvl_5.Task_22;

import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Dog {
    public String color;


    public Dog(String color){
        this.color = color;
    }
    public void voice(){
        System.out.println("Gav! Gav!");
        System.out.println("My color is " +getColor());

    }

   public  void changeColor(String newColor) {
        this.color=newColor;
        System.out.println("Gav! Gav!");
        System.out.println("Now my color is " + newColor);
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

