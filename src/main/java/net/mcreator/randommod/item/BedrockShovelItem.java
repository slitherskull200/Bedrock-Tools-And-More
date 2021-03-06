
package net.mcreator.randommod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.block.Blocks;

import net.mcreator.randommod.itemgroup.BedrockItemsItemGroup;
import net.mcreator.randommod.RandommodModElements;

@RandommodModElements.ModElement.Tag
public class BedrockShovelItem extends RandommodModElements.ModElement {
	@ObjectHolder("randommod:bedrock_shovel")
	public static final Item block = null;
	public BedrockShovelItem(RandommodModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 10000;
			}

			public float getEfficiency() {
				return 30f;
			}

			public float getAttackDamage() {
				return 10f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BedrockShovelItem.block, (int) (1)), new ItemStack(Blocks.BEDROCK, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(BedrockItemsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("bedrock_shovel"));
	}
}
