package site.autoever.hexagonal.infrastructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import site.autoever.hexagonal.user.application.domain.HexagonalUser;

@Repository
public interface HexagonalUserRepository extends JpaRepository<HexagonalUser, Long> {

}
