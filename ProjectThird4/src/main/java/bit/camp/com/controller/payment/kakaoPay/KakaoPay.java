package bit.camp.com.controller.payment.kakaoPay;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lombok.extern.log4j.Log4j;

@Log4j
@Controller
public class KakaoPay {
	
	@RequestMapping(value = "/kakao", method = {RequestMethod.GET,RequestMethod.POST})
	public String kakaoPay(Model model) {
		log.info("kakaoPay");
		return "payment/kakaoPay";
	} 
	

}
