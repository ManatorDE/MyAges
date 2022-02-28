package de.manator.myages.events;

import java.util.Arrays;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class StartAge implements Listener {
	
	@EventHandler
	public void onBlockBreak(org.bukkit.event.block.BlockBreakEvent e) {
		
		ItemStack usedItem = e.getPlayer().getInventory().getItemInMainHand(); 
		Block block = e.getBlock();
		
		if(usedItem == null || usedItem.getType() == null || !usedItem.getType().toString().contains("AXE")) {
			if(block.getType().toString().contains("LOG")) {
				e.setDropItems(false);
				ItemStack drops = new ItemStack(Material.STICK);
				ItemMeta meta = drops.getItemMeta();
				meta.setLore(Arrays.asList("Wood Shard"));
				meta.setDisplayName("Wood Shard");
				drops.setItemMeta(meta);
				block.getWorld().dropItemNaturally(block.getLocation(), drops);
			}
		}
	}
	
}
