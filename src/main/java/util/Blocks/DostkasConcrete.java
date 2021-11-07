package util.Blocks;

import util.Interfaces.IBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class DostkasConcrete extends IBlock {
    @Override
    public String getRegistryName() {
        return "dostkas_concrete";
    }

    public DostkasConcrete() {
        this.block = new Block(AbstractBlock.Properties.from(Blocks.ORANGE_CONCRETE));
        this.item = new BlockItem(getBlock(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS));
    }
}
