package de.manator.myages.recipes;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import de.manator.myages.Main;

public class SteelIngot {
	
	private Main main;
	
	private FurnaceRecipe recipe;
	private ItemStack item;
	
	public SteelIngot(Main main) {
		this.main = main;
		
		item = new ItemStack(Material.IRON_INGOT);
		ItemMeta meta = item.getItemMeta();
		meta.setLore(Arrays.asList("Steel Ingot"));
		meta.setDisplayName("Steel Ingot");
		item.setItemMeta(meta);
		
		recipe = new FurnaceRecipe(new NamespacedKey(main, "steel_ingot"), item, Material.IRON_INGOT, 5, 200);
	}
	
	public void register() {
		main.getRecipeManager().registerRecipe(recipe);
	}

	public ItemStack getItem() {
		return item;
	}
}
