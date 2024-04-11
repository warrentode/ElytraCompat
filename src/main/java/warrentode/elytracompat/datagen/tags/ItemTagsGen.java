package warrentode.elytracompat.datagen.tags;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.data.ExistingFileHelper;
import warrentode.elytracompat.util.ModTags;

import javax.annotation.Nullable;
import java.util.Objects;

public class ItemTagsGen extends ItemTagsProvider {
    public ItemTagsGen(DataGenerator pGenerator, BlockTagsProvider pBlockTagsProvider, String modId,
                       @Nullable ExistingFileHelper existingFileHelper) {
        super(pGenerator, pBlockTagsProvider, modId, existingFileHelper);
    }

    @Override
    protected void addTags() {
        this.registerModTags();
        this.registerCuriosTags();
    }

    private void registerModTags() {
        tag(ModTags.Items.ELYTRA)
                .addOptional(Objects.requireNonNull(ResourceLocation
                        .tryParse("bat_elytra:bat_elytra")))
                .addOptional(Objects.requireNonNull(ResourceLocation
                        .tryParse("lilwings:grayling_blooming_elytra")))
                .addOptional(Objects.requireNonNull(ResourceLocation
                        .tryParse("lilwings:grayling_flowering_elytra")))
                .addOptional(Objects.requireNonNull(ResourceLocation
                        .tryParse("lilwings:gold_applefly_elytra")))
                .addOptional(Objects.requireNonNull(ResourceLocation
                        .tryParse("lilwings:grayling_elytra")))
                .addOptional(Objects.requireNonNull(ResourceLocation
                        .tryParse("lilwings:gold_applefly_elytra")))
                .addOptional(Objects.requireNonNull(ResourceLocation
                        .tryParse("lilwings:red_applefly_elytra")))
                .addOptional(Objects.requireNonNull(ResourceLocation
                        .tryParse("lilwings:aponi_elytra")))
                .addOptional(Objects.requireNonNull(ResourceLocation
                        .tryParse("lilwings:butter_gold_elytra")))
                .addOptional(Objects.requireNonNull(ResourceLocation
                        .tryParse("lilwings:cloudy_puff_elytra")))
                .addOptional(Objects.requireNonNull(ResourceLocation
                        .tryParse("lilwings:crystal_puff_elytra")))
                .addOptional(Objects.requireNonNull(ResourceLocation
                        .tryParse("lilwings:painted_panther_elytra")))
                .addOptional(Objects.requireNonNull(ResourceLocation
                        .tryParse("lilwings:shroom_skipper_elytra")))
                .addOptional(Objects.requireNonNull(ResourceLocation
                        .tryParse("lilwings:swallow_tail_elytra")))
                .addOptional(Objects.requireNonNull(ResourceLocation
                        .tryParse("lilwings:swamp_hopper_elytra")))
                .addOptional(Objects.requireNonNull(ResourceLocation
                        .tryParse("lilwings:white_fox_elytra")))
                .addOptional(Objects.requireNonNull(ResourceLocation
                        .tryParse("netherelytra:netherite_elytra")))
                .addOptional(Objects.requireNonNull(ResourceLocation
                        .tryParse("enderitemod:enderite_elytra_seperated")))
                .addOptional(Objects.requireNonNull(ResourceLocation
                        .tryParse("deeperdarker:soul_elytra")))
                .addOptional(Objects.requireNonNull(ResourceLocation
                        .tryParse("mana-and-artifice:spectral_elytra")))
                .addOptional(Objects.requireNonNull(ResourceLocation
                        .tryParse("alexsmobs:tarantula_hawk_elytra")))
                .addOptional(Objects.requireNonNull(ResourceLocation
                        .tryParse("mekanism:hdpe_elytra")))
                .addOptional(Objects.requireNonNull(ResourceLocation
                        .tryParse("silentgear:elytra")))
                .addOptional(Objects.requireNonNull(ResourceLocation
                        .tryParse("tconstruct:slime_chestplate")))
                .addOptional(Objects.requireNonNull(ResourceLocation
                        .tryParse("customizableelytra:customizable_elytra")))
                .add(Items.ELYTRA);
    }

    private void registerCuriosTags() {
        tag(ModTags.Items.ELYTRA_SLOT).addTag(ModTags.Items.ELYTRA);
    }
}
