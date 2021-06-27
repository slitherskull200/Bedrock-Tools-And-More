
package net.mcreator.randommod.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.randommod.block.CompressedCobblestoneBlock;
import net.mcreator.randommod.RandommodModElements;

@RandommodModElements.ModElement.Tag
public class BedrockItemsItemGroup extends RandommodModElements.ModElement {
	public BedrockItemsItemGroup(RandommodModElements instance) {
		super(instance, 19);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabbedrock_items") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(CompressedCobblestoneBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
