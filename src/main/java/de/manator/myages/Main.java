package de.manator.myages;

import java.io.File;

import org.bukkit.Bukkit;
import org.bukkit.inventory.Recipe;
import org.bukkit.plugin.java.JavaPlugin;

import de.manator.myages.events.FlintAge;
import de.manator.myages.events.IronAge;
import de.manator.myages.events.StartAge;
import de.manator.myages.events.WoodenAge;
import de.manator.myages.recipes.RecipeManager;

public class Main extends JavaPlugin {
	
	private RecipeManager rm;
	
	@Override
	public void onEnable() {
		long time = System.currentTimeMillis();
		getLogger().info("Loading MyAges...");
		
		getLogger().info("Loading files...");
		loadFiles();
		getLogger().info("Files loaded!");
		
		getLogger().info("Registering events...");
		registerEvents();
		getLogger().info("Events registered!");
		
		getLogger().info("Registering commands...");
		registerCommands();
		getLogger().info("Commands registered!");
		
		getLogger().info("Registering events...");
		rm = new RecipeManager(this);
		rm.loadItems();
		registerRecipes();
		getLogger().info("Recipes registered!");
		
		getLogger().info("Done! (in " + (System.currentTimeMillis() - time)/1000 + "s)");
	}
	
	private void loadFiles() {
		File dataFolder = getDataFolder();
		
		if(!dataFolder.exists()) {
			dataFolder.mkdirs();
		}
		
	}
	
	private void registerRecipes() {
		for(Recipe recipe : rm.getRecipes()) {
			Bukkit.addRecipe(recipe);
		}
	}

	private void registerCommands() {

	}
	
	private void registerEvents() {
		Bukkit.getPluginManager().registerEvents(new StartAge(), this);
		Bukkit.getPluginManager().registerEvents(new WoodenAge(), this);
		Bukkit.getPluginManager().registerEvents(new FlintAge(), this);
		Bukkit.getPluginManager().registerEvents(new IronAge(), this);
	}

	public RecipeManager getRecipeManager() {
		return rm;
	}
}