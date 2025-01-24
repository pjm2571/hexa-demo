package site.autoever.hexagonal.user.application.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import site.autoever.hexagonal.user.application.domain.HexagonalUser;
import site.autoever.hexagonal.user.application.port.out.RegisterUserPort;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

class RegisterUserServiceTest {

    @Mock
    RegisterUserPort registerUserPort;

    @Test
    @DisplayName("헥사고날 User Entity가 정상적으로 등록된다.")
    void registerUser() {
        // given
        HexagonalUser user = HexagonalUser.builder()
                .role("ROLE_USER")
                .username("pjm")
                .password("1234")
                .email("pjm@naver.com")
                .build();

        // when
        RegisterUserService registerUserService = new RegisterUserService(registerUserPort);

        given(registerUserPort.saveUser(user)).willReturn(1L);

        // then
        assertEquals(1L, registerUserService.registerUser(user));
    }
}