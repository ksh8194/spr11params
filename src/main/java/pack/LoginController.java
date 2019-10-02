package pack;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping(value="kic/login",params="type=admin")
	public ModelAndView aaa() {
		ModelAndView view = new ModelAndView();
		view.setViewName("home");
		view.addObject("msg","관리자");
		
		return view;
	}

	@RequestMapping(value="kic/login",params="type=user")
	public ModelAndView bbb() {
		ModelAndView view = new ModelAndView();
		view.setViewName("home");
		view.addObject("msg","일반 회원");
		
		return view;
		
}
	@RequestMapping(value="kic/login",params="!type")
	public ModelAndView ccc() {
		ModelAndView view = new ModelAndView();
		view.setViewName("home");
		view.addObject("msg","가을");
		
		return view;
}
	@RequestMapping(value="ent/{co}/singer/{singer}")
	public ModelAndView ddd(@RequestParam("title") String title,@PathVariable String co,@PathVariable String singer) {
		ModelAndView view = new ModelAndView();
		
		view.setViewName("home");
		String ss = "소속사:" + co + ", 가수:" + singer + ", 노래 제목 :"+title;
		view.addObject("msg",ss);
		
		return view;
}
	
}
