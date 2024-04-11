package warrentode.elytracompat;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.SlotTypeMessage;

@Mod(ElytraCompat.MODID)
public class ElytraCompat {
    public static final String MODID = "elytracompat";

    public ElytraCompat() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::onIMEnqueueEvent);
    }

    private void onIMEnqueueEvent(InterModEnqueueEvent ignoredEvent) {
        InterModComms.sendTo(CuriosApi.MODID, SlotTypeMessage.REGISTER_TYPE,
                () -> new SlotTypeMessage.Builder("elytra").priority(81)
                        .icon(new ResourceLocation("curios:slot/empty_elytra_slot")).build());
    }
}