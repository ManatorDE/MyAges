package de.manator.myages.recipes;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.Damageable;

import de.manator.myages.Main;

public class FlintShovel {
	
	private Main main;
	
	private ShapedRecipe recipe;
	private ItemStack item;
	
	public FlintShovel(Main main) {
		this.main = main;
		
		item = new ItemStack(Material.STONE_SHOVEL);
		Damageable meta = (Damageable) item.getItemMeta();
		meta.setDisplayName("Flint Shovel");
		meta.setLore(Arrays.asList("Flint Shovel"));
		meta.setDamage(Material.STONE_SHOVEL.getMaxDurability() / 2);
		item.setItemMeta(meta);
		
		recipe = new ShapedRecipe(new NamespacedKey(main, "flint_shovel"), item);
		recipe.shape(" F "," S "," S ");
		recipe.setIngredient('F', Material.FLINT);
		recipe.setIngredient('S', Material.STICK);
	}
	
	public void register() {
		main.getRecipeManager().registerRecipe(recipe);
	}
}
