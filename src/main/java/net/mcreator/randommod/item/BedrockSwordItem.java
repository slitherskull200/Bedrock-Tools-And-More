
package net.mcreator.randommod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.block.Blocks;

import net.mcreator.randommod.RandommodModElements;

@RandommodModElements.ModElement.Tag
public class BedrockSwordItem extends RandommodModElements.ModElement {
	@ObjectHolder("randommod:bedrock_sword")
	public static final Item block = null;
	public BedrockSwordItem(RandommodModElements instance) {
		super(instance, 22);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 10000;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 118f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 300;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(BedrockSwordItem.block, (int) (1)), new ItemStack(Blocks.BEDROCK, (int) (1)));
			}
		}, 3, -1f, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()) {
		}.setRegistryName("bedrock_sword"));
	}
}
