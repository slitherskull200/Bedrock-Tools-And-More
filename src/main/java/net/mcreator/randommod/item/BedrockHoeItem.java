
package net.mcreator.randommod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.HoeItem;
import net.minecraft.block.Blocks;

import net.mcreator.randommod.itemgroup.BedrockItemsItemGroup;
import net.mcreator.randommod.RandommodModElements;

@RandommodModElements.ModElement.Tag
public class BedrockHoeItem extends RandommodModElements.ModElement {
	@ObjectHolder("randommod:bedrock_hoe")
	public static final Item block = null;
	public BedrockHoeItem(RandommodModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new HoeItem(new IItemTier() {
			public int getMaxUses() {
				return 10000;
			}

			public float getEfficiency() {
				return 10f;
			}

			public float getAttackDamage() {
				return 8f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BedrockHoeItem.block, (int) (1)), new ItemStack(Blocks.BEDROCK, (int) (1)));
			}
		}, 0, -3f, new Item.Properties().group(BedrockItemsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("bedrock_hoe"));
	}
}
