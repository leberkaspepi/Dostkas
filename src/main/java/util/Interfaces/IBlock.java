package util.Interfaces;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;

public abstract class IBlock implements IItem {
    protected Block block;
    protected BlockItem item;

    @Override
    public Item getItem() {
        return item;
    }

    public Block getBlock() {
        return block;
    }
}
