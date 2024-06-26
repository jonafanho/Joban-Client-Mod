package com.lx862.jcm.mod.data.pids.preset.components;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.lx862.jcm.mod.data.JCMClientStats;
import com.lx862.jcm.mod.data.KVPair;
import com.lx862.jcm.mod.data.pids.preset.PIDSContext;
import com.lx862.jcm.mod.data.pids.preset.components.base.PIDSComponent;
import org.mtr.mapping.holder.Direction;
import org.mtr.mapping.mapper.GraphicsHolder;
import org.mtr.mapping.mapper.GuiDrawing;

import java.util.ArrayList;
import java.util.List;

public class CycleComponent extends PIDSComponent {
    private List<PIDSComponent> components;
    private double cycleTime;
    private int currentComponents = 0;
    public CycleComponent(double x, double y, double width, double height, KVPair additionalParam) {
        super(x, y, width, height);
        this.cycleTime = additionalParam.getDouble("cycleTime", 1);
        this.components = new ArrayList<>();
        JsonArray array = additionalParam.get("components", new JsonArray());
        for(int i = 0; i < array.size(); i++) {
            components.add(PIDSComponent.parse(array.get(i).getAsJsonObject()));
        }
    }

    @Override
    public void render(GraphicsHolder graphicsHolder, GuiDrawing guiDrawing, Direction facing, PIDSContext context) {
        if(cycleTime == -1) {
            for(PIDSComponent component : components) {
                if(component.canRender(context)) {
                    component.render(graphicsHolder, guiDrawing, facing, context);
                    break;
                }
            }
        } else {
            currentComponents = (int) ((int)((JCMClientStats.getGameTick() / 20.0) % (cycleTime * components.size())) / cycleTime);

            if(!components.isEmpty()) {
                components.get(currentComponents).render(graphicsHolder, guiDrawing, facing, context);
            }
        }
    }

    public static PIDSComponent parseComponent(double x, double y, double width, double height, JsonObject jsonObject) {
        return new CycleComponent(x, y, width, height, new KVPair(jsonObject));
    }
}