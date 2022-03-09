package de.manator.myages.recipes;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import de.manator.myages.Main;

public class WoodenShovel {
	private Main main;
	private ShapedRecipe recipe;
	private ItemStack item;
	
	public WoodenShovel(Main main) {
		this.main = main;
		
		item = new ItemStack(Material.WOODEN_SHOVEL);
		
		recipe = new ShapedRecipe(new NamespacedKey(main, "wooden_shovel_shard"), item);
		ItemStack drops = new ItemStack(Material.STICK);
		ItemMeta meta = drops.getItemMeta();
		meta.setLore(Arrays.asList("Wood Shard"));
		meta.setDisplayName("Wood Shard");
		drops.setItemMeta(meta);
		recipe.shape(" I "," S "," S ");
		recipe.setIngredient('I', new RecipeChoice.ExactChoice(drops));
		recipe.setIngredient('S', Material.STICK);
	}
	
	public void register() {
		main.getRecipeManager().registerRecipe(recipe);
	}
}
