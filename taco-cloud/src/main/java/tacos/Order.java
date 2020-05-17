package tacos;

import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

/**
 * @Author: zhanghan
 * @Date: 2020/5/17 16:30
 * @Description:
 */
@Data
public class Order {

	@NotBlank(message = "Name is requires")
	private String name;

	@NotBlank(message = "Street is required")
	private String street;

	@NotBlank(message = "City is required")
	private String city;

	@NotBlank(message = "State is required")
	private String state;

	@NotBlank(message = "Zip code is required")
	private String zip;

	@CreditCardNumber(message = "not a valid credit card number")
	private String ccNumber;

	@Pattern(regexp = "[0-9]*", message = "Must be formatted MM/YY")
	private String ccExpiration;

	@Digits(integer = 3, fraction = 0, message = "Invalid CVV")
	private String ccCVV;

}
