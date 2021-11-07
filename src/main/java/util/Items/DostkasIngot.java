package util.Items;

import util.Interfaces.IItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class DostkasIngot implements IItem {
    @Override
    public String getRegistryName() {
        return "dostkas_ingot";
    }

    @Override
    public Item getItem() {
        return new Item(new Item.Properties().group(ItemGroup.MISC));
    }
}
