package hello.springmvc.basic.response;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ResponseViewController {

    @GetMapping("/response-view-v1")
    public ModelAndView responseView1() {
        ModelAndView mav = new ModelAndView("response/hello")
                .addObject("data", "Hello");
        return mav;
    }

    @GetMapping("/response-view-v2")
    public String responseView2(Model model) {
        model.addAttribute("data", "Hello");
        return "response/hello";
    }
}
