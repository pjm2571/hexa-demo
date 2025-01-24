package site.autoever.hexagonal.user.adapter.out;

import site.autoever.hexagonal.user.application.port.out.RegisterUserPort;

public class RegisterUserAdapter implements RegisterUserPort {
    @Override
    public Long saveUser() {
        return 0L;
    }
}
