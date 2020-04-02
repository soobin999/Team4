package bit.camp.com.model.service;

import java.util.List;

import bit.camp.com.VO.mybatis.Reservation;

public interface ManagerService {
	List<Reservation> getAll();
	Reservation selectReservation();
}
