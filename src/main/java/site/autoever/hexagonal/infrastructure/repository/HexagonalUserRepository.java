package site.autoever.hexagonal.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import site.autoever.hexagonal.user.application.domain.HexagonalUser;

public interface HexagonalUserRepository extends JpaRepository<Long, HexagonalUser> {

}
