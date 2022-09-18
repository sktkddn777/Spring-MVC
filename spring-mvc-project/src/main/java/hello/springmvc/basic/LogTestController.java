package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

    // private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        // 개발 서버는 debug, 운영 서버는 info
        log.trace("trace log = {}", name);
        log.debug("debug log = {}", name);
        log.info("info log = {}", name);
        log.warn("warn log = {}", name);
        log.error("error log = {}", name);

        // 참고로 {}, 가 아닌 + 로 로그를 출력해버리면 연산을 하게 되어 성능상 좋지 않다.
        // + 가 있으면 먼저 + 연산을 함 그리고 trace인지 info인지 확인함
        // 때문에 출력되지 않는 로그 레벨도 연산이 일어나게 됨
        return "ok";
    }
}
