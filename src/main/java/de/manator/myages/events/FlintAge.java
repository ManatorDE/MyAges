package de.manator.myages.events;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

public class FlintAge implements Listener {
	
	@EventHandler
	public void onBlockBreak(org.bukkit.event.block.BlockBreakEvent e) {
		
		ItemStack usedItem = e.getPlayer().getInventory().getItemInMainHand(); 
		Block block = e.getBlock();
		
		if(usedItem.hasItemMeta() && usedItem.getItemMeta().getLore() != null && usedItem.getItemMeta().getLore().contains("Flint Pickaxe")) {
			if(block.getType() == Material.IRON_ORE || block.getType().toString().contains("DEEPSLATE")) {
				e.setDropItems(false);
			}
		}
	}
	
}
