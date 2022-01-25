package javaguru.lv.student_oleg_ivanov.lesson_12.lvl_2;

import java.util.Optional;

public interface BankApi {
    //task 10
    //task 11
    Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException;
}
