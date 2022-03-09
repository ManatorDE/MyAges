package de.manator.myages.recipes;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.Damageable;

import de.manator.myages.Main;

public class FlintSword {
	
private Main main;
	
	private ShapedRecipe recipe;
	private ItemStack item;
	
	public FlintSword(Main main) {
		this.main = main;
		
		item = new ItemStack(Material.STONE_SWORD);
		Damageable meta = (Damageable) item.getItemMeta();
		meta.setLore(Arrays.asList("Flint Sword"));
		meta.setDisplayName("Flint Sword");
		meta.setDamage(Material.STONE_SWORD.getMaxDurability() / 2);
		item.setItemMeta(meta);
		
		recipe = new ShapedRecipe(new NamespacedKey(main, "flint_sword"), item);
		recipe.shape(" F "," F "," S ");
		recipe.setIngredient('F', Material.FLINT);
		recipe.setIngredient('S', Material.STICK);
	}
	
	public void register() {
		main.getRecipeManager().registerRecipe(recipe);
	}
	
}
