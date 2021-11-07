package util.Tools;

import util.Interfaces.ITool;
import net.minecraft.item.*;

public class DostkasAxe implements ITool {
    @Override
    public String getRegistryName() {
        return "dostkas_axe";
    }

    @Override
    public TieredItem getItem() {
        return new AxeItem(tier, 8, -3.1f, new Item.Properties().group(ItemGroup.TOOLS));
    }
}
