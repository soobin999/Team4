package bit.camp.com.VO.mybatis;

import org.apache.ibatis.type.Alias;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@Alias("roomTypeTable")
public class RoomTypeTable {
	
	@Bean("roomTypeTableVO")
	public RoomTypeTable getRoomTypeTable() {
		return new RoomTypeTable();
	}
	
	private String roomType;
	
	public RoomTypeTable() {
		super();
	}
	public RoomTypeTable(String roomType) {
		super();
		this.roomType=roomType;
	}
}
