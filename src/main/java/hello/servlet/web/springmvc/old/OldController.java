package hello.servlet.web.springmvc.old;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 핸들러 매핑에서 이 컨트롤러를 찾을 수 있어야 함 (스프링 빈의 이름으로 핸들러를 찾을 수 있는 핸들러 매핑 필요)
// -> RequestMappingHandlerMapping (0순위)
// -> BeanNameUrlHandlerMapping (1순위)
// 찾은 핸들러를 실행할 수 있는 핸들러 어댑터가 필요

@Component("/springmvc/old-controller") // spring bean 이름 설정
public class OldController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        System.out.println("OldController");
        return new ModelAndView("new-form");
    }
}
