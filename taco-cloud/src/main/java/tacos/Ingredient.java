package tacos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @Author: zhanghan
 * @Date: 2020/5/15 21:26
 * @Description:
 */

@Data
@RequiredArgsConstructor
public class Ingredient {

	private final String id;
	private final String name;
	private final Type type;


	public static enum Type {
		WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
	}

}
