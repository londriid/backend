package id.londri.londri.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Setter
@Getter
public class User {
	@Id
	private String id;
	private String fullName;
	private String nickName;
	private Date bornDate;
	private String email;
	private String password;
	private String phoneNumber;
	private String address;
}
