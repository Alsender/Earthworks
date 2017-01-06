package alsender.earthworks.fluid;

import alsender.earthworks.main.Earthworks;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidFinite;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

/**
 * Created by alsender on 1/4/17.
 */
public class ModFluid extends BlockFluidFinite {

    public ModFluid(Fluid fluid, Material material) {
        super(fluid, material);
        FluidRegistry.addBucketForFluid(fluid);

        setUnlocalizedName(Earthworks.mod_id + "." + fluidName);
        setRegistryName(fluidName);
        setCreativeTab(Earthworks.creativeTab);
    }
}
