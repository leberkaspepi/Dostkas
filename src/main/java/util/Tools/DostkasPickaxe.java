package util.Tools;

import util.Interfaces.ITool;
import net.minecraft.item.*;

public class DostkasPickaxe implements ITool {
    @Override
    public String getRegistryName() {
        return "dostkas_pickaxe";
    }

    @Override
    public TieredItem getItem() {
        return new PickaxeItem(tier, 3, -2.8f, new Item.Properties().group(ItemGroup.TOOLS));
    }
}
