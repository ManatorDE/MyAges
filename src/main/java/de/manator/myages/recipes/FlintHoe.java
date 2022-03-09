package de.manator.myages.recipes;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.Damageable;

import de.manator.myages.Main;

public class FlintHoe {
	
private Main main;
	
	private ShapedRecipe recipe;
	private ItemStack item;
	
	public FlintHoe(Main main) {
		this.main = main;
		
		item = new ItemStack(Material.STONE_HOE);
		Damageable meta = (Damageable) item.getItemMeta();
		meta.setLore(Arrays.asList("Flint Hoe"));
		meta.setDisplayName("Flint Hoe");
		meta.setDamage(Material.STONE_HOE.getMaxDurability() / 2);
		item.setItemMeta(meta);
		
		recipe = new ShapedRecipe(new NamespacedKey(main, "flint_hoe"), item);
		recipe.shape("FF "," S "," S ");
		recipe.setIngredient('F', Material.FLINT);
		recipe.setIngredient('S', Material.STICK);
	}
	
	public void register() {
		main.getRecipeManager().registerRecipe(recipe);
	}
	
}
