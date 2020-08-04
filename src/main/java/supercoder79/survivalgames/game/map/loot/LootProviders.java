package supercoder79.survivalgames.game.map.loot;

import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.collection.WeightedList;

public class LootProviders {
	public static final LootProvider GENERIC = new LootProvider(new WeightedList<ItemStack>()
			.add(new ItemStack(Items.STONE_SWORD, 1), 4)
			.add(new ItemStack(Items.STONE_AXE, 1), 3)
			.add(new ItemStack(Items.SHIELD, 1), 3)
			.add(new ItemStack(Items.COBBLESTONE, 16), 6)
			.add(new ItemStack(Items.LEATHER_HELMET, 1), 2)
			.add(new ItemStack(Items.LEATHER_CHESTPLATE, 1), 2)
			.add(new ItemStack(Items.LEATHER_LEGGINGS, 1), 2)
			.add(new ItemStack(Items.LEATHER_BOOTS, 1), 2)
			.add(new ItemStack(Items.EXPERIENCE_BOTTLE, 4), 1)
			.add(new ItemStack(Items.LAPIS_LAZULI, 1), 1),
			3, 7);

	public static final LootProvider HOUSE = new LootProvider(new WeightedList<ItemStack>()
			.add(new ItemStack(Items.IRON_SWORD, 1), 16)
			.add(new ItemStack(Items.SHIELD, 1), 8)
			.add(new ItemStack(Items.GOLDEN_APPLE, 1), 1)
			.add(new ItemStack(Items.IRON_HELMET, 1), 6)
			.add(new ItemStack(Items.IRON_CHESTPLATE, 1), 6)
			.add(new ItemStack(Items.IRON_LEGGINGS, 1), 6)
			.add(new ItemStack(Items.IRON_BOOTS, 1), 6),
			5, 7);

	public static final LootProvider ENCHANTING_TABLE = new LootProvider(new WeightedList<ItemStack>()
			.add(new ItemStack(Items.IRON_SWORD, 1), 1)
			.add(new ItemStack(Items.SHIELD, 1), 1)
			.add(new ItemStack(Items.EXPERIENCE_BOTTLE, 4), 4)
			.add(new ItemStack(Items.LAPIS_LAZULI, 2), 4),
			2, 5);
}
