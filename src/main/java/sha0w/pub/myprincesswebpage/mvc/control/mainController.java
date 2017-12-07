package sha0w.pub.myprincesswebpage.mvc.control;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableAutoConfiguration
public class mainController {
    @RequestMapping(value = "/test")
    @ResponseBody
    public String rootDispatcher(Model model) {
        model.addAttribute("s",1);
        return "index";
    }
}
