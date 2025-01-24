package site.autoever.hexagonal.user.adapter.out;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import site.autoever.hexagonal.infrastructure.repository.HexagonalUserRepository;
import site.autoever.hexagonal.user.application.domain.HexagonalUser;
import site.autoever.hexagonal.user.application.port.out.RegisterUserPort;

@Component
@RequiredArgsConstructor
public class RegisterUserAdapter implements RegisterUserPort {

    private final HexagonalUserRepository repository;

    @Override
    public Long saveUser(HexagonalUser user) {
        return repository.save(user).getId();
    }

}
