package javaguru.lv.student_oleg_ivanov.lesson_3.lvl_7.Task_29;

import javaguru.lv.teacher.annotations.CodeReview;

@CodeReview(approved = true)
public class DoorDemo {
    public static void main(String[] args) {
        Door myDoor = new Door("Brown", 200, 90);
        System.out.println(myDoor.getColor());
        System.out.println(myDoor.getSizeLength());
        System.out.println(myDoor.getSizeWidth());
        myDoor.setOpenClosed(true);
        myDoor.openDoor();
        System.out.println("Door is open: " +myDoor.isOpenClosed());
        myDoor.closeDoor();
        System.out.println("Door is closed: "+myDoor.isOpenClosed());




    }
}
