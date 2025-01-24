package site.autoever.hexagonal.user.application.service;

import lombok.RequiredArgsConstructor;
import site.autoever.hexagonal.user.application.domain.HexagonalUser;
import site.autoever.hexagonal.user.application.port.in.RegisterUserUseCase;
import site.autoever.hexagonal.user.application.port.out.RegisterUserPort;

@RequiredArgsConstructor
class RegisterService implements RegisterUserUseCase {

    private final RegisterUserPort registerUserPort;

    @Override
    public Long registerUser(HexagonalUser hexagonalUser) {
        return 0L;
    }
}
