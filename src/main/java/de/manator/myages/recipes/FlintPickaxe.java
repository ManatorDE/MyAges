package de.manator.myages.recipes;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.Damageable;

import de.manator.myages.Main;

public class FlintPickaxe {
	
	private ShapedRecipe recipe;
	private ItemStack item;
	private Main main;
	public FlintPickaxe(Main main) {
		this.main = main;
		item = new ItemStack(Material.STONE_PICKAXE);
		Damageable meta = (Damageable) item.getItemMeta();
		meta.setDisplayName("Flint Pickaxe");
		meta.setLore(Arrays.asList("Flint Pickaxe"));
		meta.setDamage(Material.STONE_PICKAXE.getMaxDurability() / 2);
		item.setItemMeta(meta);
		
		recipe = new ShapedRecipe(new NamespacedKey(main, "flint_picckaxe"), item);
		recipe.shape("FFF"," S "," S ");
		recipe.setIngredient('F', Material.FLINT);
		recipe.setIngredient('S', Material.STICK);
	}
	
	public void register() {
		main.getRecipeManager().registerRecipe(recipe);
	}
}
