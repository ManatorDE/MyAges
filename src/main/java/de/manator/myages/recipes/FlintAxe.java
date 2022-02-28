package de.manator.myages.recipes;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.Damageable;

import de.manator.myages.Main;

public class FlintAxe {
	
	private Main main;
	
	private ShapedRecipe recipe;
	private ItemStack item;
	
	public FlintAxe(Main main) {
		this.main = main;
		
		item = new ItemStack(Material.STONE_AXE);
		Damageable meta = (Damageable) item.getItemMeta();
		meta.setLore(Arrays.asList("Flint Axe"));
		meta.setDisplayName("Flint Axe");
		meta.setDamage(Material.STONE_AXE.getMaxDurability() / 2);
		item.setItemMeta(meta);
		
		recipe = new ShapedRecipe(new NamespacedKey(main, "flint_axe"), item);
		recipe.shape("FF ","FS "," S ");
		recipe.setIngredient('F', Material.FLINT);
		recipe.setIngredient('S', Material.STICK);
	}
	
	public void register() {
		main.getRecipeManager().registerRecipe(recipe);
	}
	
	
}
