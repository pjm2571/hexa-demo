package site.autoever.hexagonal.user.adapter.in.dto;

import lombok.Data;

@Data
public class UserRequestDto {
    private String username;
    private String password;
    private String email;
    private String role;
}
