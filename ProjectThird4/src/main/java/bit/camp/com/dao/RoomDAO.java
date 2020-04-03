package bit.camp.com.dao;

/*import java.util.Date;*/
import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import bit.camp.com.model.RoomDTO;

public interface RoomDAO {

	List<RoomDTO> getAllRooms();

	List<RoomDTO> getAvailableStandart();

	List<RoomDTO> getAvailableDouble();

	List<RoomDTO> getAvailablePremium();

	List<RoomDTO> getAvailableFamily();

	List<RoomDTO> getAvailableSuite();

}
