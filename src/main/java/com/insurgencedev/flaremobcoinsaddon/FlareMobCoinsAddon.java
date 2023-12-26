package com.insurgencedev.flaremobcoinsaddon;

import com.insurgencedev.flaremobcoinsaddon.listeners.FlareMobCoinEventListener;
import org.insurgencedev.insurgenceboosters.api.addon.IBoostersAddon;
import org.insurgencedev.insurgenceboosters.api.addon.InsurgenceBoostersAddon;

@IBoostersAddon(name = "FlareMobcoinsAddon", version = "1.0.0", author = "InsurgenceDev", description = "Flare Mobcoins Support")
public class FlareMobCoinsAddon extends InsurgenceBoostersAddon {

    @Override
    public void onAddonReloadablesStart() {
        registerEvent(new FlareMobCoinEventListener());
    }
}
