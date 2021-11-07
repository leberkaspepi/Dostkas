package util.Tools;

import util.Interfaces.ITool;
import net.minecraft.item.*;

public class DostkasShovel implements ITool {
    @Override
    public String getRegistryName() {
        return "dostkas_shovel";
    }

    @Override
    public TieredItem getItem() {
        return new ShovelItem(tier, 3.5f, -3.0f, new Item.Properties().group(ItemGroup.TOOLS));
    }
}
