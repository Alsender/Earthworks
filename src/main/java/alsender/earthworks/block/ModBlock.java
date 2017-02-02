package alsender.earthworks.block;

import alsender.earthworks.main.Config;
import alsender.earthworks.main.Earthworks;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Created by alsender on 12/22/16.
 */
public class ModBlock extends Block {

    public final String blockName;
    public final boolean quark = Config.generate_quark;

    public ModBlock(String name, Material mat, SoundType sound, float hardness, float resistance) {
        super(mat);
        this.setSoundType(sound);
        setHardness(hardness);
        setResistance(resistance);

        setUnlocalizedName(Earthworks.mod_id + "." + name);
        setRegistryName(name);
        setCreativeTab(Earthworks.creativeTab);

        GameRegistry.register(this);
        GameRegistry.register(new ItemBlock(this).setRegistryName(this.getRegistryName()));

        this.blockName = name;
    }

    public ModBlock(String name, Material mat, SoundType sound, float hardness, float resistance, boolean quark) {
        super(mat);
        this.setSoundType(sound);
        setHardness(hardness);
        setResistance(resistance);

        setUnlocalizedName(Earthworks.mod_id + "." + name);
        setRegistryName(name);
        setCreativeTab(Earthworks.creativeTab);

        if (quark == true) {
            GameRegistry.register(this);
            GameRegistry.register(new ItemBlock(this).setRegistryName(this.getRegistryName()));
        }

        this.blockName = name;
    }

    @SideOnly(Side.CLIENT)
    public void initModel() {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(getRegistryName(), "inventory"));
    }
}
