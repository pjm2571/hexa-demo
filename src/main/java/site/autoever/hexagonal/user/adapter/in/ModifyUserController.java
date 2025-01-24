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

    @PutMapping("/modify/{id}")
    public Boolean modify(@PathVariable("id") HexagonalUser user, @RequestBody UserRequestDto userRequestDto) {


        return true;
    }
}
