package com.lx862.jcm.mod.registry;

import com.lx862.jcm.mod.block.*;
import com.lx862.jcm.mod.util.JCMLogger;
import net.minecraft.block.AbstractBlock;
import org.mtr.mapping.holder.BlockSettings;
import org.mtr.mapping.registry.BlockRegistryObject;

public final class Blocks {
    public static final BlockRegistryObject BUTTERFLY_LIGHT = Registry.registerBlockItem("butterfly_light", new ButterflyLightBlock(BlockSettings.create().strength(4.0f).nonOpaque().luminance(state -> 8)), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject BUFFER_STOP = Registry.registerBlockItem("buffer_stop", new BufferStopBlock(BlockSettings.create().strength(4.0f).nonOpaque().luminance(state -> 8)), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject CIRCLE_WALL_1 = Registry.registerBlockItem("circle_wall_1", new CircleWallBlock(BlockSettings.create().strength(4.0f).nonOpaque()), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject CIRCLE_WALL_2 = Registry.registerBlockItem("circle_wall_2", new CircleWallBlock(BlockSettings.create().strength(4.0f).nonOpaque()), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject CIRCLE_WALL_3 = Registry.registerBlockItem("circle_wall_3", new CircleWallBlock(BlockSettings.create().strength(4.0f).nonOpaque()), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject CIRCLE_WALL_4 = Registry.registerBlockItem("circle_wall_4", new CircleWallBlock(BlockSettings.create().strength(4.0f).nonOpaque()), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject CIRCLE_WALL_5 = Registry.registerBlockItem("circle_wall_5", new CircleWallBlock(BlockSettings.create().strength(4.0f).nonOpaque()), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject CIRCLE_WALL_6 = Registry.registerBlockItem("circle_wall_6", new CircleWallBlock(BlockSettings.create().strength(4.0f).nonOpaque()), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject CIRCLE_WALL_7 = Registry.registerBlockItem("circle_wall_7", new CircleWallBlock(BlockSettings.create().strength(4.0f).nonOpaque()), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject CEILING_SLANTED = Registry.registerBlockItem("ceiling_slanted", new CeilingSlantedBlock(BlockSettings.create().strength(4.0f).nonOpaque()), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject DEPARTURE_POLE = Registry.registerBlockItem("departure_pole", new DeparturePoleBlock(BlockSettings.create().strength(4.0f).nonOpaque()), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject DEPARTURE_TIMER = Registry.registerBlockItem("departure_timer", new DepartureTimerBlock(BlockSettings.create().strength(4.0f).nonOpaque().luminance(state -> 4)), ItemGroups.JCM_MAIN);

    public static final BlockRegistryObject EXIT_SIGN_ODD = Registry.registerBlockItem("exit_sign_odd", new ExitSignOdd(BlockSettings.create().strength(4.0f).nonOpaque().luminance(state -> 15)), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject EXIT_SIGN_EVEN = Registry.registerBlockItem("exit_sign_even", new ExitSignEven(BlockSettings.create().strength(4.0f).nonOpaque().luminance(state -> 15)), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject FIRE_ALARM = Registry.registerBlockItem("fire_alarm", new FireAlarmWall(BlockSettings.create().strength(4.0f).nonOpaque()), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject LIGHT_LANTERN = Registry.registerBlockItem("light_lantern", new LightLanternBlock(BlockSettings.create().strength(4.0f).nonOpaque().luminance(state -> 15)), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject MTR_STAIRS = Registry.registerBlockItem("mtr_stairs", new MTRStairsBlock(AbstractBlock.Settings.create().strength(4.0f)), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject OPERATOR_BUTTON = Registry.registerBlockItem("operator_button", new OperatorButtonBlock(BlockSettings.create().strength(4.0f).nonOpaque().luminance(state -> 5), 40), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject SPOT_LAMP = Registry.registerBlockItem("spot_lamp", new SpotLampBlock(BlockSettings.create().strength(4.0f).nonOpaque().luminance(state -> 15)), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject SUBSIDY_MACHINE = Registry.registerBlockItem("subsidy_machine", new SubsidyMachineBlock(BlockSettings.create().strength(4.0f).nonOpaque()), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject WRL_STATION_CEILING = Registry.registerBlockItem("wrl_station_ceiling", new WRLStationCeilingBlock(BlockSettings.create().strength(4.0f).nonOpaque()), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject WRL_STATION_CEILING_POLE = Registry.registerBlockItem("wrl_station_ceiling_pole", new WRLStationCeilingPole(BlockSettings.create().strength(4.0f).nonOpaque()), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject HELPLINE_1 = Registry.registerBlockItem("helpline_1", new WallAttachedHelpLineBlock(BlockSettings.create().strength(4.0f).nonOpaque()), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject HELPLINE_2 = Registry.registerBlockItem("helpline_2", new WallAttachedHelpLineBlock(BlockSettings.create().strength(4.0f).nonOpaque()), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject HELPLINE_STANDING = Registry.registerBlockItem("helpline_standing", new HelpLineStandingBlock(BlockSettings.create().strength(4.0f).nonOpaque().luminance(state -> 15)), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject HELPLINE_STANDING_EAL = Registry.registerBlockItem("helpline_standing_eal", new HelpLineStandingEALBlock(BlockSettings.create().strength(4.0f).nonOpaque().luminance(state -> 15)), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject MTR_ENQUIRY_MACHINE = Registry.registerBlockItem("mtr_enquiry_machine", new MTREnquiryMachine(BlockSettings.create().strength(4.0f).nonOpaque()), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject MTR_ENQUIRY_MACHINE_WALL = Registry.registerBlockItem("mtr_enquiry_machine_wall", new MTREnquiryMachineWall(BlockSettings.create().strength(4.0f).nonOpaque().luminance(state -> 4)), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject RV_ENQUIRY_MACHINE = Registry.registerBlockItem("rv_enquiry_machine", new RVEnquiryMachine(BlockSettings.create().strength(4.0f).nonOpaque()), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject KCR_EMG_STOP_SIGN = Registry.registerBlockItem("kcr_emg_stop_sign", new KCREmergencyStopSign(BlockSettings.create().strength(4.0f).nonOpaque()), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject KCR_ENQUIRY_MACHINE = Registry.registerBlockItem("kcr_enquiry_machine", new KCREnquiryMachineWall(BlockSettings.create().strength(4.0f).nonOpaque().luminance(state -> 4)), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject TCL_EMG_STOP_BUTTON = Registry.registerBlockItem("tcl_emg_stop_button", new TCLEmergencyButtonBlock(BlockSettings.create().strength(4.0f).nonOpaque()), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject TML_EMG_STOP_BUTTON = Registry.registerBlockItem("tml_emg_stop_button", new TMLEmergencyButtonBlock(BlockSettings.create().strength(4.0f).nonOpaque().luminance(state -> 15)), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject SIL_EMG_STOP_BUTTON = Registry.registerBlockItem("sil_emg_stop_button", new SILEmergencyButtonBlock(BlockSettings.create().strength(4.0f).nonOpaque().luminance(state -> 10)), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject TRAIN_MODEL_E44 = Registry.registerBlockItem("train_model_e44", new MTRTrainModelBlock(BlockSettings.create().strength(4.0f).nonOpaque()), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject MTR_TRESPASS_SIGN = Registry.registerBlockItem("mtr_trespass_sign", new MTRTrespassSignageBlock(BlockSettings.create().strength(4.0f).nonOpaque()), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject KCR_TRESPASS_SIGN = Registry.registerBlockItem("kcr_trespass_sign", new KCRTrespassSignageBlock(BlockSettings.create().strength(4.0f).nonOpaque()), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject LRT_TRESPASS_SIGN = Registry.registerBlockItem("lrt_trespass_sign", new LRTTrespassSignageBlock(BlockSettings.create().strength(4.0f).nonOpaque()), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject LRT_INTER_CAR_BARRIER_LEFT = Registry.registerBlockItem("lrt_inter_car_barrier_left", new LRTInterCarBarrierBlock(BlockSettings.create().strength(4.0f).nonOpaque()), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject LRT_INTER_CAR_BARRIER_MIDDLE = Registry.registerBlockItem("lrt_inter_car_barrier_middle", new LRTInterCarBarrierBlock(BlockSettings.create().strength(4.0f).nonOpaque()), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject LRT_INTER_CAR_BARRIER_RIGHT = Registry.registerBlockItem("lrt_inter_car_barrier_right", new LRTInterCarBarrierBlock(BlockSettings.create().strength(4.0f).nonOpaque()), ItemGroups.JCM_MAIN);
    public static final BlockRegistryObject WATER_MACHINE = Registry.registerBlockItem("water_machine", new WaterMachineBlock(BlockSettings.create().strength(4.0f).nonOpaque()), ItemGroups.JCM_MAIN);

    public static void register() {
        // We just load the class and it will be registered, nothing else
        JCMLogger.info("Registering blocks...");
    }
}