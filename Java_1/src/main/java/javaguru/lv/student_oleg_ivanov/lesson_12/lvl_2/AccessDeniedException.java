package javaguru.lv.student_oleg_ivanov.lesson_12.lvl_2;

//task 11
/*task 17

Почему класс AccessDeniedException в нашем случае
лучше наследовать от Exception, а не от RuntimeException?

Потому что те ошибки которые мы можем предвидеть нужно обрабатывать.
        А RuntimeException – это непроверенные исключения. Они возникают во время выполнения приложения.
        Поэтому данное исключение не нужно обрабатывать, а нужно исправлять ошибку в коде.
*/
public class AccessDeniedException extends Exception {
    private String id;

    public AccessDeniedException(String id) {
        this.id = id;
    }
}
