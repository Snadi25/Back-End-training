package viikkoharjoitus2.kotitehtavat.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Mycontroller {

    @GetMapping("/hello")
    public String sayHello(@RequestParam String name, @RequestParam int age, Model model) {
        model.addAttribute("nimi", name);
        model.addAttribute("ika", age);
        return "hello";
    }

}
