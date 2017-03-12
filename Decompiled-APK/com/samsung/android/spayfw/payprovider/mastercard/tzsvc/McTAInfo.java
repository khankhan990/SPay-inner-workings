package com.samsung.android.spayfw.payprovider.mastercard.tzsvc;

import com.samsung.android.spaytzsvc.api.TAInfo;

public class McTAInfo extends TAInfo {
    public static final String CONFIG_LSI_PATH = "ffffffff000000000000000000000021.mp3";
    public static final String CONFIG_LSI_UUID = "ffffffff000000000000000000000021";
    public static final String CONFIG_QC_PATH = "mc_pay.mp3";
    public static final String CONFIG_QC_PROCESS = "mc_pay";
    public static final String CONFIG_QC_ROOT = "/firmware/image";
    public static final int SPAY_TA_TYPE_TEE_MASTER = 2;
    public static final boolean bUsesPinRandom = true;
    public static final McTACommands mCommands;

    static {
        mCommands = new McTACommands();
    }

    public McTAInfo() {
        super((int) SPAY_TA_TYPE_TEE_MASTER, TAInfo.SPAY_TA_TECH_TEE, McTAController.class, mCommands, CONFIG_LSI_UUID, CONFIG_LSI_PATH, CONFIG_QC_ROOT, CONFIG_QC_PROCESS, CONFIG_QC_PATH, (boolean) bUsesPinRandom);
    }
}