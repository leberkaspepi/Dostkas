package util.Items;

import util.Interfaces.IItem;
import net.minecraft.item.Foods;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Dostkas implements IItem {
    @Override
    public String getRegistryName() {
        return "dostkas";
    }

    @Override
    public Item getItem() {
        return new Item(new Item.Properties().group(ItemGroup.FOOD).food(Foods.MELON_SLICE));
    }
}
