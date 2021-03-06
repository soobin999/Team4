package bit.camp.com.VO.mybatis;

import java.sql.Date;

import org.apache.ibatis.type.Alias;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Builder;
import lombok.Data;

@Data
@Alias("reservation")
@Configuration
public class Reservation {
	
	@Bean("reservationVO")
	public Reservation getReservation() {
		return new Reservation();
	}
	
	private Date reservationStartDate,reservationFinishDate;
	private int totalAmount, editRoute,editCode;
	private int customerCount,roomCount;

	public Reservation() {}
	public Reservation(Date reservationStartDate,Date reservationFinishDate,int totalAmount,int editRoute,int editCode,int customerCount,int roomCount) {
		super();
		this.reservationStartDate=reservationStartDate;
		this.reservationFinishDate=reservationFinishDate;
		this.totalAmount=totalAmount;
		this.customerCount=customerCount;
		this.roomCount=roomCount;
		this.editRoute=editRoute;
		this.editCode=editCode;
	}

}
