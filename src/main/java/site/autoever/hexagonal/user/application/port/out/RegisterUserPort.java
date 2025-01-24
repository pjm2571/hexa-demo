package site.autoever.hexagonal.user.application.port.out;

import site.autoever.hexagonal.user.application.domain.HexagonalUser;

public interface RegisterUserPort {
    Long saveUser(HexagonalUser user);
}
