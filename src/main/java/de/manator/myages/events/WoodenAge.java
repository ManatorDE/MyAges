package de.manator.myages.events;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;

public class WoodenAge implements Listener {
	
	@EventHandler
	public void onBlockBreak(org.bukkit.event.block.BlockBreakEvent e) {
		
		ItemStack usedItem = e.getPlayer().getInventory().getItemInMainHand(); 
		Block block = e.getBlock();
		
		if(usedItem.getType() == Material.WOODEN_PICKAXE) {
			if(block.getType() == Material.STONE) {
				e.setDropItems(false);
				block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.FLINT, ((int) Math.random() * 2 + 1)));
			}
		} else if(usedItem.getType() == Material.WOODEN_AXE) {
			if(block.getType().toString().contains("LOG")) {
				e.setDropItems(false);
				block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.STICK, ((int) Math.random() * 3 + 1)));
			}
		} else if(usedItem.getType() == Material.WOODEN_SHOVEL) {
			if(block.getType() == Material.GRAVEL) {
				e.setDropItems(false);
				block.getWorld().dropItemNaturally(block.getLocation(), new ItemStack(Material.FLINT));
			}
		}
	}
	
}
