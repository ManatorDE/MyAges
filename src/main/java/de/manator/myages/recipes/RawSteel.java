package de.manator.myages.recipes;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import de.manator.myages.Main;

public class RawSteel {
	
	private Main main;
	private ShapedRecipe recipe;
	private ItemStack item;
	
	public RawSteel(Main main) {
		this.main = main;
		
		item = new ItemStack(Material.RAW_IRON);
		ItemMeta meta = item.getItemMeta();
		meta.setLore(Arrays.asList("Raw Steel"));
		meta.setDisplayName("Raw Steel");
		item.setItemMeta(meta);
		
		recipe = new ShapedRecipe(new NamespacedKey(main, "raw_steel"), item);
		
		recipe.shape("IC","  ");
		recipe.setIngredient('I', Material.RAW_IRON);
		recipe.setIngredient('C', Material.COAL);
	}
	
	public void register() {
		main.getRecipeManager().registerRecipe(recipe);
	}
	
}
