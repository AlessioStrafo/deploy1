package co.develhope.deploy1;
//write a Spring Boot application with the necessary dependencies that:
//has a basic controller that returns a property devName that has the value of your name
//runs on port 7070
//the version is 0.0.3
//create the .jar and launch it using the command line
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
    @GetMapping("/devName")
    public String getDevName() {
        return "Alessio";
    }
}
