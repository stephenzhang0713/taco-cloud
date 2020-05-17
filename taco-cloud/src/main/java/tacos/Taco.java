package tacos;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * @Author: zhanghan
 * @Date: 2020/5/17 16:10
 * @Description:
 */

@Data
public class Taco {

	@NotNull
	@Size(min = 5, message = "Name must be at least 5 characters long")
	private String name;

	@Size(min=1, message="You must choose at least 1 ingredient")
	private List<String> ingredients;
}
