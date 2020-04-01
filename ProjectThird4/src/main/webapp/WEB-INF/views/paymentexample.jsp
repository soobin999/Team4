<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css"
	type="text/css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/font-awesome.min.css"
	type="text/css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/elegant-icons.css"
	type="text/css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/flaticon.css"
	type="text/css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/owl.carousel.min.css"
	type="text/css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/nice-select.css"
	type="text/css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/jquery-ui.min.css"
	type="text/css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/magnific-popup.css"
	type="text/css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/slicknav.min.css"
	type="text/css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css"
	type="text/css">
</head>
<body>
	
	<div class="col-xl-4 col-lg-5 offset-xl-2 offset-lg-1">
		<div class="booking-form">
			<h3>Booking Your Hotel</h3>
			<form action="/paychoice">
				<div class="check-date">
					<label for="date-in">Check In:</label> <input type="text"
						class="date-input" id="date-in" name="reservationStartDate">
					<i class="icon_calendar"></i>
				</div>

				<div class="check-date">
					<label for="date-out">Check Out:</label> <input type="text"
						class="date-input" id="date-out" name="reservationFinishDate">
					<i class="icon_calendar"></i>
				</div>
				<div class="select-option">
					<label for="guest">Guests:</label> <select id="guest">
						<option value="">1 Adults</option>
						<option value="">2 Adults</option>
						<option value="">3 Adults</option>
						<option value="">4 Adults</option>
					</select>
				</div>
				<div class="select-option">
					<label for="room">Room:</label> <select id="room">
						<option value="">1 Room</option>
						<option value="">2 Room</option>
					</select>
				</div>
				<button type="submit">Check Availability</button>
			</form>
		</div>
	</div>
	<script
		src="${pageContext.request.contextPath}/resources/js/jquery-3.3.1.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/jquery.magnific-popup.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/jquery.nice-select.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/jquery-ui.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/jquery.slicknav.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/owl.carousel.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/js/main.js"></script>
</body>
</html>