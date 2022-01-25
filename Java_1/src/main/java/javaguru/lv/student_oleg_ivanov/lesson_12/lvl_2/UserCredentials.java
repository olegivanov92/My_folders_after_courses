package javaguru.lv.student_oleg_ivanov.lesson_12.lvl_2;
//task 8

import java.util.List;

public class UserCredentials {

    private List<Role> roles;

    public boolean hasRole(Role role) {
        return roles.contains(role);
    }

    public UserCredentials(List<Role> roles) {
        this.roles = roles;
    }

    public List<Role> getRoles() {
        return roles;
    }
}
