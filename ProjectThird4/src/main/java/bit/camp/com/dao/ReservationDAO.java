package com.bit.hottel.dao;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bit.hottel.model.ReservationDTO;

public interface ReservationDAO {

	int getReservationsStandart(@Param("reservationStartDate") Date reservationStartDate, @Param("reservationFinishDate") Date reservationFinishDate);

	int getReservationsDouble(@Param("reservationStartDate") Date reservationStartDate, @Param("reservationFinishDate") Date reservationFinishDate);

	int getReservationsPremium(@Param("reservationStartDate") Date reservationStartDate, @Param("reservationFinishDate") Date reservationFinishDate);

	int getReservationsFamily(@Param("reservationStartDate") Date reservationStartDate, @Param("reservationFinishDate") Date reservationFinishDate);

	int getReservationsSuite(@Param("reservationStartDate") Date reservationStartDate, @Param("reservationFinishDate") Date reservationFinishDate);
}
