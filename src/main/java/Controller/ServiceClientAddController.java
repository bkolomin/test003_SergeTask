package Controller;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceClientAddController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/service/client/add")
    public String transactions(@RequestParam(value="name", defaultValue="none") String name,
                               @RequestParam(value="surname", defaultValue="none") String surname,
                               @RequestParam(value="passportNumber", defaultValue="none") String passportNumber) {
        return "test: " + name + ", surname: " + surname;
    }
}
