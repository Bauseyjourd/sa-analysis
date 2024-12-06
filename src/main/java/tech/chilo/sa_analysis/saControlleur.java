package tech.chilo.sa_analysis;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType ;
import java.util.List;

@RestController
@RequestMapping(path="sa", produces = MediaType.APPLICATION_JSON_VALUE)
public class saControlleur {
    @GetMapping
    public List<Object> search() {
        return List.of(new Sa(1,"Gonzalez le fort",1),
                new Sa(2,"Gonzalez le fort GITHUB",0)

        );
    }
}
