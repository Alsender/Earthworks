package alsender.earthworks.main.crafting;

import alsender.earthworks.main.Config;
import com.google.gson.JsonObject;
import net.minecraftforge.common.crafting.IConditionFactory;
import net.minecraftforge.common.crafting.JsonContext;
import net.minecraftforge.fml.common.Loader;

import java.util.function.BooleanSupplier;

/**
 * Created by alsender on 6/30/17.
 */
public class ConditionsFactories {

    public static class QuarkCompat implements IConditionFactory {
        @Override
        public BooleanSupplier parse(JsonContext context, JsonObject json) {
            return () -> Config.quark;
        }
    }

    public static class BWMCompat implements IConditionFactory {
        @Override
        public BooleanSupplier parse(JsonContext context, JsonObject json) {
            return () -> Config.betterwithmods;
        }
    }

    public static class UseVertPlanks implements IConditionFactory {
        @Override
        public BooleanSupplier parse(JsonContext context, JsonObject json) {
            if (!Loader.isModLoaded("quark") || Config.persistantplanks == true) {
                return () -> true;
            } else {
                return () -> false;
            }
        }
    }

    public static class UseQuarkPlanks implements IConditionFactory {
        @Override
        public BooleanSupplier parse(JsonContext context, JsonObject json) {
            if (!Loader.isModLoaded("quark") || Config.persistantplanks == true) {
                return () -> false;
            } else {
                return () -> true;
            }
        }
    }
}
