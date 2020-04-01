package bit.camp.com.VO.mybatis;

import org.apache.ibatis.type.Alias;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Builder;
import lombok.Data;

@Data
@Alias("room")
@Configuration
public class Room {
	
	@Bean("roomVO")
	public Room getRoom() {
		return new Room();
	}
	private int roomNumber, roomPrice, roomPerson;
	private String roomPicture,roomInformation;
	private boolean reservationState;
	private int roomTypeCount;

	public Room() {
		super();
	}
	public Room(int roomNumber,int roomPrice,int roomPerson,String roomPicture,String roomInformation,boolean reservationState,int roomTypeCount) {
		super();
		this.roomNumber=roomNumber;
		this.roomPrice=roomPrice;
		this.roomPerson=roomPerson;
		this.roomPicture=roomPicture;
		this.reservationState=reservationState;
		this.roomTypeCount=roomTypeCount;
		this.roomInformation=roomInformation;
	}
}
