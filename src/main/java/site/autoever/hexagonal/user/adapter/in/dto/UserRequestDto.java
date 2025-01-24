package site.autoever.hexagonal.user.adapter.in.dto;

import lombok.Data;
import site.autoever.hexagonal.user.application.domain.HexagonalUser;

@Data
public class UserRequestDto {
    private String username;
    private String password;
    private String email;
    private String role;

    public HexagonalUser toEntity() {
        return HexagonalUser.builder()
                .username(this.username)
                .password(this.password)
                .email(this.email)
                .role(this.role)
                .build();
    }

    public HexagonalUser from(HexagonalUser user) {
        return user;
    }
}
