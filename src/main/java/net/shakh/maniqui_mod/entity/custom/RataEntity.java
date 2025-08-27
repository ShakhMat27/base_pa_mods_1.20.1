package net.shakh.maniqui_mod.entity.custom;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.*;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.Level;
import net.shakh.maniqui_mod.entity.ModEntities;
import org.jetbrains.annotations.Nullable;

public class RataEntity extends Animal {
    public RataEntity(EntityType<? extends Animal> pEntityType, Level pLevel) {
        super(pEntityType, pLevel);
    }

    @Override
    protected void registerGoals() {
        this.goalSelector.addGoal(0,new FloatGoal(this));

        this.goalSelector.addGoal(1,new TemptGoal(this, 1.2D, Ingredient.of(Items.PUMPKIN_PIE),false));

        this.goalSelector.addGoal(2,new FollowParentGoal(this,1.15D));

        this.goalSelector.addGoal(3,new WaterAvoidingRandomStrollGoal(this, 1.1D));
        this.goalSelector.addGoal(4,new LookAtPlayerGoal(this, Player.class, 3f));
        this.goalSelector.addGoal(5,new RandomLookAroundGoal(this));
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Animal.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 5D)
                .add(Attributes.FOLLOW_RANGE, 24D)
                .add(Attributes.MOVEMENT_SPEED, 0.5D)
                .add(Attributes.ARMOR_TOUGHNESS, 0.1f)
                .add(Attributes.ATTACK_KNOCKBACK, 0.5f)
                .add(Attributes.ATTACK_DAMAGE, 2f);
    }

    @Override
    public @Nullable AgeableMob getBreedOffspring(ServerLevel pLevel, AgeableMob pOtherParent) {
        return ModEntities.Rata.get().create(pLevel);
    }
}
