package javaguru.lv.student_oleg_ivanov.lesson_7.lvl_7;

import javaguru.lv.teacher.annotations.CodeReview;

//task_15
@CodeReview(approved = true)
public class UserEntity {
    private int id;
    private String name;
    private String surName;
    private int personalId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getPersonalId() {
        return personalId;
    }

    public void setPersonalId(int personalId) {
        this.personalId = personalId;
    }
}
