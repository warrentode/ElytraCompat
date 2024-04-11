package warrentode.elytracompat.util;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import org.jetbrains.annotations.NotNull;

import static warrentode.elytracompat.ElytraCompat.MODID;

public class ModTags {
    public static class Items {
        public static final TagKey<Item> ELYTRA = modItemTag(MODID, "elytra");
        public static final TagKey<Item> ELYTRA_SLOT = modItemTag("curios", "elytra");
    }

    @SuppressWarnings("SameParameterValue")
    private static @NotNull TagKey<Item> modItemTag(String modid, String path) {
        return TagKey.create(Registry.ITEM_REGISTRY, new ResourceLocation(modid, path));
    }
}
