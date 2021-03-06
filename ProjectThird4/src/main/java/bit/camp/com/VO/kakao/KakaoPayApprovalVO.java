package bit.camp.com.VO.kakao;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Configuration
public class KakaoPayApprovalVO {
	
	
	@Bean("kakaoApprovalVO")
	public KakaoPayApprovalVO getkakaoApprovalVO() {
		return new KakaoPayApprovalVO();
	}
	
	private String aid, tid, cid, sid;
    private String partner_order_id, partner_user_id, payment_method_type;
    private AmountVO amount;
    private CardVO card_info;
    private String item_name, item_code, payload;
    private Integer quantity, tax_free_amount, vat_amount;
   // private Date created_at, approved_at;
	
    
}
