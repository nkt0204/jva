package demoMVC.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import demoMVC.Dao.HomeDao;

@Controller
public class HomeController {
	
	@Autowired
	HomeDao homeDao;
	
	@RequestMapping(value ={"/","/trang-chu"},method=RequestMethod.GET)
	public ModelAndView Index() {	
		ModelAndView mav= new ModelAndView("index");
		 //mav.addObject("product", homeDao.getDataProduct()); 	 
		return mav;
	}
}
