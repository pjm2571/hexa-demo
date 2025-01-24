package site.autoever.hexagonal.user.application.port.in;

import site.autoever.hexagonal.user.application.domain.HexagonalUser;

public interface RegisterUserUseCase {
    Long registerUser(HexagonalUser hexagonalUser);
}
