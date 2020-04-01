package bit.camp.com.VO.kakao;

import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.Data;


@Data
@Configuration
public class KakaoPayReadyVO {
	
	@Bean(name="kakaoURLVO")
	public KakaoPayReadyVO getKakaoURLVO() {
		return new KakaoPayReadyVO();
	}
	
	private String tid;
	private String next_redirect_pc_url;
	//private Date created_at;

	
}
