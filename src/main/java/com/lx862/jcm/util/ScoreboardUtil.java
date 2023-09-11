package com.lx862.jcm.util;

import org.mtr.mapping.holder.*;
import org.mtr.mapping.mapper.TextHelper;

public class ScoreboardUtil {
    public static ScoreboardObjective getOrCreateObjective(World world, String name, ScoreboardCriterion criterion, Text displayName, ScoreboardCriterionRenderType renderType) {
        if(!world.getScoreboard().containsObjective(name)) {
            world.getScoreboard().addObjective(name, criterion, displayName, renderType);
        }
        return world.getScoreboard().getObjective(name);
    }

    public static boolean incrementNonOverflow(ScoreboardPlayerScore score, int amount) {
        if((long)score.getScore() + amount > Integer.MAX_VALUE) {
            return false;
        } else {
            score.incrementScore(amount);
            return true;
        }
    }
}