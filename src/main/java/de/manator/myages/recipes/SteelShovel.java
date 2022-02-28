package de.manator.myages.recipes;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.Damageable;

import de.manator.myages.Main;

public class SteelShovel {
	
	private Main main;
	private ShapedRecipe recipe;
	private ItemStack item;
	
	public SteelShovel(Main main) {
		this.main = main;
		
		item = new ItemStack(Material.IRON_SHOVEL);
		Damageable meta = (Damageable) item.getItemMeta();
		meta.setDisplayName("Steel Shovel");
		meta.setLore(Arrays.asList("Steel Shovel"));
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		item.setItemMeta(meta);
		
		recipe = new ShapedRecipe(new NamespacedKey(main, "steel_shovel"), item);
		SteelIngot si = new SteelIngot(main);
		recipe.shape(" I "," S "," S ");
		recipe.setIngredient('I', si.getItem().getData());
		recipe.setIngredient('S', Material.STICK);
	}
	
	public void register() {
		main.getRecipeManager().registerRecipe(recipe);
	}
}
