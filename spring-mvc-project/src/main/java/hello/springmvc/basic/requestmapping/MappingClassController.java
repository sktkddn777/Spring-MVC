package hello.springmvc.basic.requestmapping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController("/mapping/users") // RestController 는 ResponseBody 랑 Controller 를 합친것
@Slf4j
public class MappingClassController {

    @PostMapping()
    public String addUser() {
        return "post user";
    }


    @ResponseStatus(HttpStatus.OK) // 상태 코드 어노테이션으로 넣어둘 수 있음, 동적으로 처리하고 싶으면 ResponseEntity 사용하기
    @GetMapping()
    public String user() {
        return "get users";
    }

    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userId) {
        return "get userId = " + userId;
    }

    @PatchMapping("/{userId}")
    public String patchUser(@PathVariable String userId) {
        return "patch userId = " + userId;
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId) {
        return "delete userId = " + userId;
    }
}
