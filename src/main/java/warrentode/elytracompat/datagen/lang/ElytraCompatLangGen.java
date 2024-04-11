package warrentode.elytracompat.datagen.lang;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ElytraCompatLangGen extends LanguageProvider {

    public ElytraCompatLangGen(DataGenerator generator, String modid, String locale) {
        super(generator, modid, locale);
    }

    @Override
    protected void addTranslations() {
        add("curios.identifier.elytra", "Elytra");
    }
}