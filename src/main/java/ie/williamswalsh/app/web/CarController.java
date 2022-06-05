package ie.williamswalsh.app.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CarController {

    @Value("${my.config.item}")
    private String secretValuePropertyFromConfigServer;

    @GetMapping(value="/")
    public String getCar() {

        return "Secret: " + secretValuePropertyFromConfigServer;
    }
}
