package de.manator.myages.recipes;

import java.util.ArrayList;

import org.bukkit.inventory.Recipe;

import de.manator.myages.Main;

public class RecipeManager {

	private ArrayList<Recipe> recipes;
	Main main;

	public RecipeManager(Main main) {
		this.main = main;
		recipes = new ArrayList<>();
	}

	public boolean registerRecipe(Recipe r) {
		if (r != null && !recipes.contains(r)) {
			recipes.add(r);
			return true;
		}
		return false;
	}
	
	public ArrayList<Recipe> getRecipes() {
		return recipes;
	}
	
	public void loadItems() {
		new FlintPickaxe(main).register();
		new FlintAxe(main).register();
		new FlintShovel(main).register();
		new SteelIngot(main).register();
		new SteelAxe(main).register();
		new SteelPickaxe(main).register();
		new SteelShovel(main).register();
		new WoodenAxe(main).register();
		new WoodenPickaxe(main).register();
		new WoodenShovel(main).register();
		new CraftingTable(main).register();
		new RawSteel(main).register();
	}
}
