package util.Interfaces;

import util.Registry;
import net.minecraft.item.IItemTier;
import net.minecraft.item.TieredItem;
import net.minecraft.item.crafting.Ingredient;

public interface ITool extends IItem {
    IItemTier tier = new IItemTier() {
        @Override
        public int getMaxUses() {
            return 250;
        }

        @Override
        public float getEfficiency() {
            return 6.0f;
        }

        @Override
        public float getAttackDamage() {
            return 0.0f;
        }

        @Override
        public int getHarvestLevel() {
            return 2;
        }

        @Override
        public int getEnchantability() {
            return 25;
        }

        @Override
        public Ingredient getRepairMaterial() {
            return Ingredient.fromItems(Registry.dostkas.getItem());
        }
    };

    @Override
    TieredItem getItem();
}
