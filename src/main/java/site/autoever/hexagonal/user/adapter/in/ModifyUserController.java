package site.autoever.hexagonal.user.adapter.in;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import site.autoever.hexagonal.user.adapter.in.dto.UserRequestDto;
import site.autoever.hexagonal.user.application.domain.HexagonalUser;

@RestController
@RequiredArgsConstructor
public class ModifyUserController {



    // domain converter
    // 스프링 프레임워크에서 제공하는 persistance 기능이기 떄문에, 적용이 가능하다
    // JPA를 쓰고 있기 때문에...!!!

    @PutMapping("/modify/{id}")
    public Boolean modify(@PathVariable("id") HexagonalUser user, @RequestBody UserRequestDto userRequestDto) {


        return true;
    }
}
