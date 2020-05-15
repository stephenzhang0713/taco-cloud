package tacos.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import tacos.Ingredient;
import tacos.TacoCloudApplication;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: zhanghan
 * @Date: 2020/5/15 21:31
 * @Description:
 */
@Slf4j
@RequestMapping("/design")
@Controller
public class DesignTacoController {

	@GetMapping
	public String showDesignForm(Model model) {
		List<Ingredient> ingredients = Arrays.asList(
				new Ingredient("TLTO", "Flour Tortilla", Ingredient.Type.WRAP),
				new Ingredient("COTO", "Corn Tortilla", Ingredient.Type.WRAP),
				new Ingredient("GRBF", "Ground Beef", Ingredient.Type.PROTEIN),
				new Ingredient("CARN", "Carnitas", Ingredient.Type.PROTEIN),
				new Ingredient("LETC", "Lettuce", Ingredient.Type.VEGGIES),
				new Ingredient("CHED", "Cheddar", Ingredient.Type.CHEESE),
				new Ingredient("JACK", "Monterrey Jack", Ingredient.Type.CHEESE),
				new Ingredient("SLSA", "Salsa", Ingredient.Type.SAUCE)
		);
		Ingredient.Type[] types = Ingredient.Type.values();
		for (Ingredient.Type type : types) {
			model.addAttribute(type.toString().toLowerCase(),
					filterByType(ingredients, type));
		}
		model.addAttribute("design", new TacoCloudApplication());

		return "design";
	}

	private List<Ingredient> filterByType(List<Ingredient> ingredients, Ingredient.Type type) {
		return ingredients.stream()
				.filter(x->x.getType().equals(type))
				.collect(Collectors.toList());
	}

}
