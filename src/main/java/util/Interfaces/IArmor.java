package util.Interfaces;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

public interface IArmor extends IItem {
    IArmorMaterial material = new IArmorMaterial() {
        @Override
        public int getDurability(EquipmentSlotType slotIn) {
            switch (slotIn) {
                case HEAD:
                    return 165;

                case CHEST:
                    return 240;

                case LEGS:
                    return 225;

                case FEET:
                    return 195;

                default:
                    return 0;
            }
        }

        @Override
        public int getDamageReductionAmount(EquipmentSlotType slotIn) {
            switch (slotIn) {
                case HEAD:
                case FEET:
                    return 2;

                case CHEST:
                    return 6;

                case LEGS:
                    return 5;

                default:
                    return 0;
            }
        }

        @Override
        public int getEnchantability() {
            return 25;
        }

        @Override
        public SoundEvent getSoundEvent() {
            return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromItems(Items.IRON_INGOT);
        }

        @Override
        public String getName() {
            return "dostkas";
        }

        @Override
        public float getToughness() {
            return 0;
        }

        @Override
        public float getKnockbackResistance() {
            return 0;
        }
    };

    @Override
    ArmorItem getItem();

    Item.Properties properties = new Item.Properties().group(ItemGroup.COMBAT);
}
