package com.insurgencedev.flaremobcoinsaddon;

import com.insurgencedev.flaremobcoinsaddon.listeners.FlareMobCoinEventListener;
import org.insurgencedev.insurgenceboosters.api.addon.IBoostersAddon;
import org.insurgencedev.insurgenceboosters.api.addon.InsurgenceBoostersAddon;
import org.insurgencedev.insurgenceboosters.libs.fo.Common;

@IBoostersAddon(name = "FlareMobcoinsAddon", version = "1.0.2", author = "InsurgenceDev", description = "Flare Mobcoins Support")
public class FlareMobCoinsAddon extends InsurgenceBoostersAddon {

    @Override
    public void onAddonReloadAblesStart() {
        if (Common.doesPluginExist("TMMobCoins")) {
            registerEvent(new FlareMobCoinEventListener());
        }
    }
}
