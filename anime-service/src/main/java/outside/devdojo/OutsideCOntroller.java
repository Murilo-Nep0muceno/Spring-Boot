package outside.devdojo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OutsideCOntroller {
    @GetMapping(value = "test")
    public String outside(){
    return "OutsideController";
    }
}
