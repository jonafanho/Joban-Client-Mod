package com.lx862.jcm.mod.block.entity;

import com.lx862.jcm.mod.registry.BlockEntities;
import org.mtr.mapping.holder.BlockPos;
import org.mtr.mapping.holder.BlockState;
import org.mtr.mod.block.BlockSignalBase;

public class SignalBlockInvertedEntityRedBelow extends BlockSignalBase.BlockEntityBase {
    public SignalBlockInvertedEntityRedBelow(BlockPos blockPos, BlockState blockState) {
        super(BlockEntities.SIGNAL_LIGHT_INVERTED_RED_BELOW.get(), false, blockPos, blockState);
    }
}
