package bit.camp.com.controller.payment.kakaoPay;

import java.net.URI;
import java.net.URISyntaxException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.Setter;

@Controller
public class SampleController {
	private final static Logger logger = LoggerFactory.getLogger(SampleController.class);

	@Setter
	@Autowired
	private KakaoPayService kakaopay;

	@RequestMapping("/kakaoPay")
	public void kakaoPayGet() {
		logger.info("KakaoPayGet");
	}

	@RequestMapping(value = "/kakaoPay", method = RequestMethod.POST)
	public String kakaoPay() {
		logger.info("KakaoPayPost");
		
		return "redirect:" + kakaopay.kakaoPayReady();
	}

	@RequestMapping("/kakaoPaySuccess")
	public void kakaoPaySuccess(@RequestParam("pg_token") String pg_token, Model model) {
		logger.info("kakaoPaySuccess get............................................");
		logger.info("kakaoPaySuccess pg_token : " + pg_token);
		model.addAttribute("info", kakaopay.kakaoPayInfo(pg_token));
	}
}
