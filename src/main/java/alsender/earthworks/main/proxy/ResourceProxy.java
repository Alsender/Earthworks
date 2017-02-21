package alsender.earthworks.main.proxy;

import alsender.earthworks.main.Earthworks;
import com.google.common.collect.ImmutableSet;
import net.minecraft.client.resources.AbstractResourcePack;
import net.minecraftforge.fml.common.Loader;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by alsender on 2/17/17.
 */
public class ResourceProxy extends AbstractResourcePack {

    private static final String ORIG = "assets/%/%/%/%.%";
    private static final String NEWS = "/assets/%/%/%/overrides/%.%";

    private static final Map<String, String> overrides = new HashMap();

    public ResourceProxy() {
        super(Loader.instance().activeModContainer().getSource());
        overrides.put("pack.mcmeta", "/proxypack.mcmeta");
    }

    public void addResource(String space, String dir, String file, String ext) {
        String orig = String.format(ORIG, "minecraft",space, dir, file, ext);
        String news = String.format(NEWS, "earthworks", space, dir, file, ext);
        overrides.put(orig, news);
    }

    @Override
    protected boolean hasResourceName(String name) {
        return overrides.containsKey(name);
    }

    @Override
    protected InputStream getInputStreamByName(String name) throws IOException {
        if(name == null)
            return null;

        String file = overrides.get(name);
        return Earthworks.class.getResourceAsStream(overrides.get(name));
    }

    @Override
    public Set<String> getResourceDomains() {
        return ImmutableSet.of("minecraft");
    }
}
