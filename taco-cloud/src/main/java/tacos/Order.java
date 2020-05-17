package tacos;

import lombok.Data;

/**
 * @Author: zhanghan
 * @Date: 2020/5/17 16:30
 * @Description:
 */
@Data
public class Order {

	private String name;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String ccNumber;
	private String ccExpiration;
	private String ccCVV;

}
