package util;

import dostkas.DostkasMod;
import util.Armor.DostkasBoots;
import util.Armor.DostkasChestplate;
import util.Armor.DostkasHelmet;
import util.Armor.DostkasLeggings;
import util.Blocks.DostkasBlock;
import util.Blocks.DostkasConcrete;
import util.Interfaces.IArmor;
import util.Interfaces.IBlock;
import util.Interfaces.ITool;
import util.Items.Dostkas;
import util.Items.DostkasIngot;
import util.Interfaces.IItem;
import util.Tools.*;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class Registry {
    public static IItem dostkas;
    public static IItem dostkasIngot;

    public static IBlock dostkasBlock;
    public static IBlock dostkasConcrete;

    public static ITool dostkasPickaxe;
    public static ITool dostkasAxe;
    public static ITool dostkasShovel;
    public static ITool dostkasHoe;
    public static ITool dostkasSword;

    public static IArmor dostkasHelmet;
    public static IArmor dostkasChestplate;
    public static IArmor dostkasLeggings;
    public static IArmor dostkasBoots;

    public static void init() {
        dostkas = new Dostkas();
        dostkasIngot = new DostkasIngot();

        dostkasBlock = new DostkasBlock();
        dostkasConcrete = new DostkasConcrete();

        dostkasPickaxe = new DostkasPickaxe();
        dostkasAxe = new DostkasAxe();
        dostkasShovel = new DostkasShovel();
        dostkasHoe = new DostkasHoe();
        dostkasSword = new DostkasSword();

        dostkasHelmet = new DostkasHelmet();
        dostkasChestplate = new DostkasChestplate();
        dostkasLeggings = new DostkasLeggings();
        dostkasBoots = new DostkasBoots();

        registerBlocks(dostkasBlock, dostkasConcrete);
        registerItems(dostkas, dostkasIngot);
        registerTools(dostkasPickaxe, dostkasAxe, dostkasShovel, dostkasHoe, dostkasSword);
        registerArmor(dostkasHelmet, dostkasChestplate, dostkasLeggings, dostkasBoots);
    }

    private static void registerTools(ITool... tools) {
        registerItems(tools);
    }

    private static void registerArmor(IArmor... pieces) {
        registerItems(pieces);
    }

    private static void registerItems(IItem... items) {
        DeferredRegister<Item> itemRegister = DeferredRegister.create(ForgeRegistries.ITEMS, DostkasMod.modId);

        for (IItem i : items)
            itemRegister.register(i.getRegistryName(), i::getItem);

        itemRegister.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    private static void registerBlocks(IBlock... blocks) {
        DeferredRegister<Block> blockRegister = DeferredRegister.create(ForgeRegistries.BLOCKS, DostkasMod.modId);
        DeferredRegister<Item> itemRegister = DeferredRegister.create(ForgeRegistries.ITEMS, DostkasMod.modId);

        for (IBlock b : blocks) {
            blockRegister.register(b.getRegistryName(), b::getBlock);
            itemRegister.register(b.getRegistryName(), b::getItem);
        }

        blockRegister.register(FMLJavaModLoadingContext.get().getModEventBus());
        itemRegister.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
