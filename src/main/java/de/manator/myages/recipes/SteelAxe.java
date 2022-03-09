package de.manator.myages.recipes;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.RecipeChoice;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.Damageable;

import de.manator.myages.Main;

public class SteelAxe {
	
	private Main main;
	private ShapedRecipe recipe;
	private ItemStack item;
	
	public SteelAxe(Main main) {
		this.main = main;
		
		item = new ItemStack(Material.IRON_AXE);
		Damageable meta = (Damageable) item.getItemMeta();
		meta.setDisplayName("Steel Axe");
		meta.setLore(Arrays.asList("Steel Axe"));
		meta.addEnchant(Enchantment.DURABILITY, 1, true);
		item.setItemMeta(meta);
		
		recipe = new ShapedRecipe(new NamespacedKey(main, "steel_axe"), item);
		SteelIngot si = new SteelIngot(main);
		recipe.shape("II ","IS "," S ");
		recipe.setIngredient('I', new RecipeChoice.ExactChoice(si.getItem()));
		recipe.setIngredient('S', Material.STICK);
	}
	
	public void register() {
		main.getRecipeManager().registerRecipe(recipe);
	}
}
