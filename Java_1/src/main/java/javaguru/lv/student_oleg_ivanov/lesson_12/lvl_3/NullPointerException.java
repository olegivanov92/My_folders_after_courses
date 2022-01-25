package javaguru.lv.student_oleg_ivanov.lesson_12.lvl_3;

//task 18, NullPointerException появляется, если программа обращается или получает доступ к объекту, а ссылка на него равна нулю (null)
public class NullPointerException {
    public static void main(String[] args) {
        String emptyString = null;
        emptyString.isEmpty();
    }
}
