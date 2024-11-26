
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    private Service service;
    @GetMapping("/factorials/{n}")
    public List<Long> getFactorials(@PathVariable int n){
        return service.calculateFactorials(n);
    }
}
