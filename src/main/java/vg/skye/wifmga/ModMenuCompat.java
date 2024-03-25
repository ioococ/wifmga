package vg.skye.wifmga;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;
import me.shedaniel.autoconfig.AutoConfig;

public class ModMenuCompat implements ModMenuApi {
    @Override
    public ConfigScreenFactory<?> getModConfigScreenFactory() {
        Config dummy = Config.INSTANCE;
        return parent -> AutoConfig.getConfigScreen(Config.class, parent).get();
    }
}