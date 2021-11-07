package dostkas;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import util.Registry;

@Mod(DostkasMod.modId)
public class DostkasMod {
    public static final String modId = "dostkas";

    public DostkasMod() {
        Registry.init();

        MinecraftForge.EVENT_BUS.register(this);
    }
}
