package com.insurgencedev.flaremobcoinsaddon;

import com.insurgencedev.flaremobcoinsaddon.listeners.FlareMobCoinEventListener;
import org.bukkit.Bukkit;
import org.insurgencedev.insurgenceboosters.api.addon.IBoostersAddon;
import org.insurgencedev.insurgenceboosters.api.addon.InsurgenceBoostersAddon;

@IBoostersAddon(name = "FlareMobcoinsAddon", version = "1.0.1", author = "InsurgenceDev", description = "Flare Mobcoins Support")
public class FlareMobCoinsAddon extends InsurgenceBoostersAddon {

    @Override
    public void onAddonReloadablesStart() {
        if (Bukkit.getPluginManager().isPluginEnabled("TMMobCoins")) {
            registerEvent(new FlareMobCoinEventListener());
        }
    }
}
