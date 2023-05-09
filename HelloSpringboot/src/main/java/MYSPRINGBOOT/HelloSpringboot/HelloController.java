package MYSPRINGBOOT.HelloSpringboot;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/sai")
	public String helloWorld() {
		return "Hello springboot";
	}
}
