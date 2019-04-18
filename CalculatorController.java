package Controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@RequestMapping("/calc")
@Controller
public class CalculatorController {

	@RequestMapping("/show")
	public ModelAndView show() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Home");
		return mv;
	}
	@SpringBootApplication
	public class SpringBootTomcatApplication extends SpringBootServletInitializer {
	}
}
