package site.autoever.hexagonal.user.adapter.in;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import site.autoever.hexagonal.user.adapter.in.dto.UserRequestDto;
import site.autoever.hexagonal.user.application.port.in.RegisterUserUseCase;

@RestController
@RequiredArgsConstructor
public class RegisterUserController {

    private final RegisterUserUseCase registerUserUseCase;

    @PostMapping("/register")
    public Long register(@RequestBody UserRequestDto userRequestDto) {
        return registerUserUseCase.registerUser()
    }

}
