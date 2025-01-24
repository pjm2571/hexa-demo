package site.autoever.hexagonal.user.application.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import site.autoever.hexagonal.user.application.domain.HexagonalUser;
import site.autoever.hexagonal.user.application.port.in.RegisterUserUseCase;
import site.autoever.hexagonal.user.application.port.out.RegisterUserPort;

@RequiredArgsConstructor
@Service
class RegisterService implements RegisterUserUseCase {

    private final RegisterUserPort registerUserPort;

    @Override
    public Long registerUser(HexagonalUser hexagonalUser) {
        return 0L;
    }
}
