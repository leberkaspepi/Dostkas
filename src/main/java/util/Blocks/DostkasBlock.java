package util.Blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlimeBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import util.Interfaces.IBlock;

public class DostkasBlock extends IBlock {
    @Override
    public String getRegistryName() {
        return "dostkas_block";
    }

    public DostkasBlock() {
        this.block = new SlimeBlock(AbstractBlock.Properties.from(Blocks.SLIME_BLOCK));
        this.item = new BlockItem(getBlock(), new Item.Properties().group(ItemGroup.DECORATIONS));
    }
}
