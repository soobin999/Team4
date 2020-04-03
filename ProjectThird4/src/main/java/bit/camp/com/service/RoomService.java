package com.bit.hottel.service;

import java.sql.Date;
import java.util.ArrayList;
/*import java.util.Date;*/
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.hottel.dao.ReservationDAO;
import com.bit.hottel.dao.RoomDAO;
import com.bit.hottel.model.RoomDTO;

@Service
public class RoomService {

	@Autowired
	private RoomDAO roomDao;

	@Autowired
	private ReservationDAO ReservationDao;

	public List<RoomDTO> getAllRooms() {
		return roomDao.getAllRooms();
	}

	public List<RoomDTO> getAvailable(@Param("reservationStartDate") Date reservationStartDate,
			@Param("reservationFinishDate") Date reservationFinishDate, @Param("roomPerson") int roomPerson) {

		List<RoomDTO> AvailableRooms = new ArrayList<RoomDTO>();

		int countReservationsS = ReservationDao.getReservationsStandart(reservationStartDate, reservationFinishDate);
		System.out.println(countReservationsS);

		int countReservationsD = ReservationDao.getReservationsDouble(reservationStartDate, reservationFinishDate);
		System.out.println(countReservationsD);

		int countReservationsP = ReservationDao.getReservationsPremium(reservationStartDate, reservationFinishDate);
		System.out.println(countReservationsP);

		int countReservationsF = ReservationDao.getReservationsFamily(reservationStartDate, reservationFinishDate);
		System.out.println(countReservationsF);

		int countReservationsSt = ReservationDao.getReservationsSuite(reservationStartDate, reservationFinishDate);
		System.out.println(countReservationsSt);

		if (countReservationsS < 10 && roomPerson <= 2) {
			
			AvailableRooms.addAll(roomDao.getAvailableStandart());
		}
		if (countReservationsD < 10 && roomPerson <= 3) {
			System.out.println("rorororo"+  roomDao.getAvailableDouble());
			AvailableRooms.addAll(roomDao.getAvailableDouble());
		}
		if (countReservationsP < 10 && roomPerson <= 4) {
			
			AvailableRooms.addAll(roomDao.getAvailablePremium());
		}
		if (countReservationsF < 3 && roomPerson <= 6) {
			
			AvailableRooms.addAll(roomDao.getAvailableFamily());
		}
		if (countReservationsSt < 2 && roomPerson <= 10) {
			
			AvailableRooms.addAll(roomDao.getAvailableSuite());
		}

		return AvailableRooms;

	}

}