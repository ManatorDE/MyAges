package de.manator.myages.events;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class IronAge implements Listener {
	
	@EventHandler
	public void onBlockBreak(BlockBreakEvent e) {
		ItemStack usedItem = e.getPlayer().getInventory().getItemInMainHand(); 
		Block block = e.getBlock();
		
		if(usedItem.getType() == Material.IRON_PICKAXE) {
			if(block.getType() == Material.DIAMOND_ORE || block.getType() == Material.DEEPSLATE_DIAMOND_ORE || block.getType() == Material.REDSTONE_ORE) {
				if(!(usedItem.hasItemMeta() && usedItem.getItemMeta().getLore() != null && usedItem.getItemMeta().getLore().contains("Steel Pickaxe"))) {
					e.setDropItems(false);
				}
			}
		}
	}
	
}
