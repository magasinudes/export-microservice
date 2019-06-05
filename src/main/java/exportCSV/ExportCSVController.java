package exportCSV;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ExportCSVController {

    @RequestMapping("/")
    public String index() {
        return "<h1>Export CSV index!<h1>";
    }

    @RequestMapping("/health")
    public String health() {
        return "ok";
    }

}
