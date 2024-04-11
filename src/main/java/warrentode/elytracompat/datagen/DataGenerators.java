package warrentode.elytracompat.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.NotNull;
import warrentode.elytracompat.datagen.lang.ElytraCompatLangGen;
import warrentode.elytracompat.datagen.tags.BlockTagsGen;
import warrentode.elytracompat.datagen.tags.ItemTagsGen;

import static warrentode.elytracompat.ElytraCompat.MODID;

@Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(@NotNull GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();

        BlockTagsGen blockTagsGen = new BlockTagsGen(generator, MODID, helper);
        generator.addProvider(event.includeServer(), blockTagsGen);

        ItemTagsGen itemTagsGen = new ItemTagsGen(generator, blockTagsGen, MODID, helper);
        generator.addProvider(event.includeServer(), itemTagsGen);

        generator.addProvider(event.includeClient(), new ElytraCompatLangGen(generator, MODID, "en_us"));
    }
}
