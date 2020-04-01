package bit.camp.com.controller.payment.inicis;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

import bit.camp.com.VO.mybatis.Customer;
import bit.camp.com.VO.mybatis.PaymentMethodTable;
import bit.camp.com.VO.mybatis.Reservation;
import bit.camp.com.VO.mybatis.RoomTypeTable;
import bit.camp.com.VO.page.Buyer;
import bit.camp.com.model.dao.PaymentDao;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class Payment {

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

	@Autowired(required = false)
	private PaymentDao paymentService;
	
	@RequestMapping(value = "payment", method = RequestMethod.POST)
	public String payment(Model model, Buyer paymentmethod, Reservation reservation, PaymentMethodTable pay)
			throws ParseException {
		log.info("payment");
		model.addAttribute("pay", pay);
		model.addAttribute("reser", reservation);
		model.addAttribute("payment", paymentmethod);
		return "payment/payment";
	}

	@RequestMapping(value = "paychoice", method = { RequestMethod.POST, RequestMethod.GET })
	public String paychoice(Model model, Buyer paymentmethod, Reservation reservation) {
		model.addAttribute("reser", reservation);
		model.addAttribute("payment", paymentmethod);
		return "payment/paychoice";
	}

	@PostMapping(value = "/paymentComplete" , produces = "application/text; charset=utf8")
	@ResponseBody
	public String payComplete(Reservation reservation,Customer customer,PaymentMethodTable payment,RoomTypeTable roomTypeTable) {
		log.info("payComplete");
		log.info(customer);
		paymentService.selectCustomerCount(customer);
		log.info(paymentService.selectCustomerCount(customer));
		reservation.setCustomerCount(paymentService.selectCustomerCount(customer));
		log.info("reser"+reservation);
		log.info("-----------");
		log.info("reser"+reservation);
		log.info("-----------");
		paymentService.insertReservation(reservation);
		log.info("-----------");
		payment.setReservationCount(paymentService.selectReservationCount());
		log.info("-----------");
		System.out.println(payment);
		paymentService.insertPaymentMethod(payment);
		return new Gson().toJson("성공");
		  
	}
	@PostMapping(value = "/paymentCompleteTest",produces = "application/text; charset=utf8")
	@ResponseBody
	public String vvv (Model model, Customer customer,PaymentMethodTable payment,
			Reservation reservation, RoomTypeTable roomTypeTable
			) {
		
		ArrayList<Object> list = new ArrayList<Object>();
		list.add(reservation);
		list.add(roomTypeTable);
		list.add(customer);
		list.add(payment);
		log.info("log : "+list);
		return new Gson().toJson(list);
	}
	
	
	@RequestMapping(value = "/example", method = RequestMethod.GET)
	public String payementexample(Model model) {
		log.info("payementexample");
		return "paymentexample";
	}

}
