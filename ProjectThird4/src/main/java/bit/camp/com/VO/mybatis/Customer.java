package bit.camp.com.VO.mybatis;

import org.apache.ibatis.type.Alias;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
@Alias("customer")
@Configuration
public class Customer {
	public Customer() {
		
	}
	@Bean("customerVO")
	public Customer getCustomer() {
		return new Customer();
	}
	private String customerID,customerPW,customerName,customerPhoneNumber,SSNumber;
	
	public Customer(String customerID,String customerPW,String customerName,String customerPhoneNumber,String SSNumber) {
		super();
		this.customerID=customerID;
		this.customerPW=customerPW;
		this.customerName=customerName;
		this.customerPhoneNumber=customerPhoneNumber;
		this.SSNumber=SSNumber;
	}
}
