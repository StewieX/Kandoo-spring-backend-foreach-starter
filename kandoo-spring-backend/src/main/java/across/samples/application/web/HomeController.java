package across.samples.application.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController
{
	@GetMapping("/")
	public String homepage() {
		return "th/my/homepage";
	}
}
