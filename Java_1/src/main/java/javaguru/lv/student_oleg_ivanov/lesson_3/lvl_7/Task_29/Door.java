package javaguru.lv.student_oleg_ivanov.lesson_3.lvl_7.Task_29;

import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class Door {
    private String color;
    private int sizeLength;
    private int sizeWidth;
    private boolean openClosed;

    public Door(String color, int sizeLength, int sizeWidth) {
        this.color = color;
        this.sizeLength = sizeLength;
        this.sizeWidth = sizeWidth;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSizeLength() {
        return sizeLength;
    }

    public void setSizeLength(int sizeLength) {
        this.sizeLength = sizeLength;
    }

    public int getSizeWidth() {
        return sizeWidth;
    }

    public void setSizeWidth(int sizeWidth) {
        this.sizeWidth = sizeWidth;
    }

    public boolean isOpenClosed() {
        return openClosed;
    }

    public void setOpenClosed(boolean openClosed) {
        this.openClosed = openClosed;
    }


    void openDoor() {
        openClosed = true;
    }

    void closeDoor() {
        openClosed = false;
    }
}
