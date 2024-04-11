package warrentode.elytracompat.util;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurio;

import javax.annotation.Nonnull;

@SuppressWarnings("unused")
public class ElytraCurioSlot implements ICurio {

    private final ItemStack stack;

    public ElytraCurioSlot(ItemStack stack) {
        this.stack = stack;
    }

    @Override
    public ItemStack getStack() {
        return this.stack;
    }

    @Override
    public void curioTick(@NotNull SlotContext slotContext) {
        LivingEntity livingEntity = slotContext.entity();
        int ticks = livingEntity.getFallFlyingTicks();

        if (ticks > 0 && livingEntity.isFallFlying()) {
            stack.elytraFlightTick(livingEntity, ticks);
        }
    }

    @Nonnull
    @Override
    public SoundInfo getEquipSound(SlotContext context) {
        return new SoundInfo(SoundEvents.ARMOR_EQUIP_ELYTRA, 1.0F, 1.0F);
    }

    @Override
    public boolean canEquipFromUse(SlotContext context) {
        return true;
    }

    @Nonnull
    @Override
    public DropRule getDropRule(SlotContext context, DamageSource source, int lootingLevel, boolean recentlyHit) {
        return DropRule.DEFAULT;
    }
}
