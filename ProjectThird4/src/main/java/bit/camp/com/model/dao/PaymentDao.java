package bit.camp.com.model.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import bit.camp.com.VO.mybatis.Customer;
import bit.camp.com.VO.mybatis.PaymentMethodTable;
import bit.camp.com.VO.mybatis.Reservation;
import bit.camp.com.VO.mybatis.Room;
import bit.camp.com.VO.mybatis.RoomTypeTable;

@Service
public interface PaymentDao {
	
	void deleteReservation();
	void insertReservation(Reservation reservation);
	void insertPaymentMethod(PaymentMethodTable payment);
	int selectReservationCount();
	int selectRoomCount(Reservation reservation);
	int selectCustomerCount(Reservation reservation);
	int selectRoomTypeCount(Reservation reservation);
	List<Integer> selectRoom(Reservation reservation);
}
