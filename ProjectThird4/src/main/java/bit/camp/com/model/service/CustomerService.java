package bit.camp.com.model.service;

import java.util.List;

import bit.camp.com.VO.mybatis.Customer;

public interface CustomerService {
	

	List<Customer> selectAllCustomer();//회원목록조회
	void signUp();//회원가입
	String searchId();//아이디찾기
	String searchPw();//비번찾기
	void deleteCustomer();//탈퇴
	
	
	/////////////////////////////////////////////////////////////////////////////////////////////////
	
	//회원정보
	public void CustomerModifyUpdate(Customer customerVo) throws Exception;
	//회원정보 수정
	public void CustomerModify(Customer customerVo) throws Exception;

	

	
	
	
}
