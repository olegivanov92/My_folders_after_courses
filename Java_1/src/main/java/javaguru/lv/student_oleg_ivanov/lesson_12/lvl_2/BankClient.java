package javaguru.lv.student_oleg_ivanov.lesson_12.lvl_2;

//task 9
public class BankClient {
    private String uid;
    private String fullName;

    public BankClient(String uid, String fullName) {
        this.uid = uid;
        this.fullName = fullName;
    }

    public String getUid() {
        return this.uid;
    }

    public String getFullName() {
        return this.fullName;
    }
}
