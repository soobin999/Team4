package com.bit.hottel.dao;

/*import java.util.Date;*/
import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.bit.hottel.model.RoomDTO;

public interface RoomDAO {

	List<RoomDTO> getAllRooms();

	List<RoomDTO> getAvailableStandart();

	List<RoomDTO> getAvailableDouble();

	List<RoomDTO> getAvailablePremium();

	List<RoomDTO> getAvailableFamily();

	List<RoomDTO> getAvailableSuite();

}
