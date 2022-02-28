package de.manator.myages.recipes;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import de.manator.myages.Main;

public class CraftingTable {
	private Main main;
	private ShapedRecipe recipe;
	private ItemStack item;
	
	public CraftingTable(Main main) {
		this.main = main;
		
		item = new ItemStack(Material.CRAFTING_TABLE);
		
		recipe = new ShapedRecipe(new NamespacedKey(main, "workbench"), item);
		ItemStack drops = new ItemStack(Material.STICK);
		ItemMeta meta = drops.getItemMeta();
		meta.setLore(Arrays.asList("Wood Shard"));
		meta.setDisplayName("Wood Shard");
		drops.setItemMeta(meta);
		recipe.shape("II","II");
		recipe.setIngredient('I', drops.getData());
	}
	
	public void register() {
		main.getRecipeManager().registerRecipe(recipe);
	}
}
