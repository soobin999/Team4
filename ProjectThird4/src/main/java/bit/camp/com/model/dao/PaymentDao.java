package bit.camp.com.model.dao;

import org.springframework.stereotype.Service;

import bit.camp.com.VO.mybatis.Customer;
import bit.camp.com.VO.mybatis.PaymentMethodTable;
import bit.camp.com.VO.mybatis.Reservation;
import bit.camp.com.VO.mybatis.RoomTypeTable;

@Service
public interface PaymentDao {
	void deleteReservation();
	void insertReservation(Reservation reser);
	void insertPaymentMethod(PaymentMethodTable payment);
	int selectRoomTypeCount(RoomTypeTable roomTypeTable);
	int selectCustomerCount(Customer customer);
	int selectReservationCount();
}
