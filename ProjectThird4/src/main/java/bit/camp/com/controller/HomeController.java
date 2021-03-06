package com.bit.hottel.controller;

/*import java.util.Date;*/
import java.sql.Date;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bit.hottel.dao.RoomDAO;
import com.bit.hottel.model.RoomDTO;
import com.bit.hottel.service.RoomService;


/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	@Autowired
	private RoomService roomService;
	
	@RequestMapping("/")
	public String home(Model model) {
		List<RoomDTO> room = roomService.getAllRooms();
		model.addAttribute("room", room);
		return "index";
	}
	
	@RequestMapping(value = "/search")
	public String searchRoom(@RequestParam Date reservationStartDate, @RequestParam Date reservationFinishDate, @RequestParam int roomPerson, Model model) {
		List<RoomDTO> roomSearch = roomService.getAvailable(reservationStartDate, reservationFinishDate, roomPerson);
		model.addAttribute("search", roomSearch);
		return "rooms/rooms2";
	}

}