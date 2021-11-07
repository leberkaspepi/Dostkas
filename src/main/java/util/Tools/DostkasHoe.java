package util.Tools;

import util.Interfaces.ITool;
import net.minecraft.item.*;

public class DostkasHoe implements ITool {
    @Override
    public String getRegistryName() {
        return "dostkas_hoe";
    }

    @Override
    public TieredItem getItem() {
        return new HoeItem(tier, 0, -1.0f, new Item.Properties().group(ItemGroup.TOOLS));
    }
}
