package util.Armor;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import util.Interfaces.IArmor;

public class DostkasHelmet implements IArmor {
    @Override
    public String getRegistryName() {
        return "dostkas_helmet";
    }

    @Override
    public ArmorItem getItem() {
        return new ArmorItem(material, EquipmentSlotType.HEAD, properties);
    }
}
