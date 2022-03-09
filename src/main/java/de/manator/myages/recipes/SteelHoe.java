package de.manator.myages.recipes;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.Damageable;

import de.manator.myages.Main;

public class SteelHoe {
	private Main main;
	private ShapedRecipe recipe;
	private ItemStack item;
	
	public SteelHoe(Main main) {
		this.main = main;
		
		item = new ItemStack(Material.IRON_HOE);
		Damageable meta = (Damageable) item.getItemMeta();
		meta.setDisplayName("Steel Hoe");
		meta.setLore(Arrays.asList("Steel Hoe"));
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		item.setItemMeta(meta);
		
		recipe = new ShapedRecipe(new NamespacedKey(main, "steel_hoe"), item);
		SteelIngot si = new SteelIngot(main);
		recipe.shape("II ","S "," S ");
		recipe.setIngredient('I', new RecipeChoice.ExactChoice(si.getItem()));
		recipe.setIngredient('S', Material.STICK);
	}
	
	public void register() {
		main.getRecipeManager().registerRecipe(recipe);
	}
}
