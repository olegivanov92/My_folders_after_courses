package javaguru.lv.student_oleg_ivanov.lesson_12.lvl_2;
//task 12,15,16

import java.util.List;
import java.util.Optional;

public class BankApiImpl implements BankApi {
    private List<BankClient> clients;

    public BankApiImpl(List<BankClient> clients) {
        this.clients = clients;
    }

    @Override
    public Optional<BankClient> findByUid(UserCredentials credentials, String uid) throws AccessDeniedException {
        if (credentials.hasRole(Role.CAN_SEARCH_CLIENTS)) {
            throw new AccessDeniedException(uid);
        }
        for (BankClient client : clients) {
            if (client.getUid().equals(uid)) {
                return Optional.of(client);
            }
        }
        return Optional.empty();
    }

}

