package export;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ExportController {

    @RequestMapping("/")
    public String index() {
        return "<h1>Export index!<h1>";
    }

    @RequestMapping("/health")
    public String health() {
        return "ok";
    }

}
