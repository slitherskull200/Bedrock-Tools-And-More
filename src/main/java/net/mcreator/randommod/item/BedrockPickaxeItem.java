
package net.mcreator.randommod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.block.Blocks;

import net.mcreator.randommod.itemgroup.BedrockItemsItemGroup;
import net.mcreator.randommod.RandommodModElements;

@RandommodModElements.ModElement.Tag
public class BedrockPickaxeItem extends RandommodModElements.ModElement {
	@ObjectHolder("randommod:bedrock_pickaxe")
	public static final Item block = null;
	public BedrockPickaxeItem(RandommodModElements instance) {
		super(instance, 4);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 10000;
			}

			public float getEfficiency() {
				return 20f;
			}

			public float getAttackDamage() {
				return 13f;
			}

			public int getHarvestLevel() {
				return 100;
			}

			public int getEnchantability() {
				return 25;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.BEDROCK, (int) (1)), new ItemStack(BedrockPickaxeItem.block, (int) (1)));
			}
		}, 1, -2.4f, new Item.Properties().group(BedrockItemsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("bedrock_pickaxe"));
	}
}
