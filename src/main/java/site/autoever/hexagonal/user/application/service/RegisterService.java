package site.autoever.hexagonal.user.application.service;

import lombok.RequiredArgsConstructor;
import site.autoever.hexagonal.user.application.port.in.RegisterUserUseCase;
import site.autoever.hexagonal.user.application.port.out.RegisterUserPort;

@RequiredArgsConstructor
public class RegisterService implements RegisterUserUseCase {

    private final RegisterUserPort registerUserPort;

    @Override
    public void registerUser() {

    }
}
