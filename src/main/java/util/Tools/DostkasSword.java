package util.Tools;

import util.Interfaces.ITool;
import net.minecraft.item.*;

public class DostkasSword implements ITool {
    @Override
    public String getRegistryName() {
        return "dostkas_sword";
    }

    @Override
    public TieredItem getItem() {
        return new SwordItem(tier, 5, -2.4f, new Item.Properties().group(ItemGroup.COMBAT));
    }
}
