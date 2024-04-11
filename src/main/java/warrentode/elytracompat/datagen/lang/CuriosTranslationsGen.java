package warrentode.elytracompat.datagen.lang;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class CuriosTranslationsGen extends LanguageProvider {

    public CuriosTranslationsGen(DataGenerator generator, String modid, String locale) {
        super(generator, modid, locale);
    }

    @Override
    protected void addTranslations() {
        add("curios.slot", "Slot");
        add("curios.identifier.elytra", "Elytra");
        add("commands.curios.add.success", "Curios Slot Added");
    }
}