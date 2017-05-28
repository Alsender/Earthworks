package alsender.earthworks.main.world;

import alsender.earthworks.main.Config;
import alsender.earthworks.main.registry.BlockRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/**
 * Created by alsender on 12/30/16.
 */
public class ModWorldGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chuckZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
        WorldGenMinable block_chalk = new WorldGenMinable(BlockRegistry.block_chalk.getDefaultState(), Config.Cvein_size);
        for (int i = 0; i < Config.Cspawn_rate; i++) {
            int x = chunkX*16+random.nextInt(16);
            int y = random.nextInt((Config.Cmax_spawn)-(Config.Cmin_spawn))+(Config.Cmin_spawn);
            int z = chuckZ*16+random.nextInt(16);
            block_chalk.generate(world, random, new BlockPos(x,y,z));
        }

        WorldGenMinable block_slate = new WorldGenMinable(BlockRegistry.block_slate.getDefaultState(), Config.Svein_size);
        for (int i = 0; i < Config.Sspawn_rate; i++) {
            int x = chunkX*16+random.nextInt(16);
            int y = random.nextInt((Config.Smax_spawn)-(Config.Smin_spawn))+(Config.Smin_spawn);
            int z = chuckZ*16+random.nextInt(16);
            block_slate.generate(world, random, new BlockPos(x,y,z));
        }

        WorldGenMinable block_slate_green = new WorldGenMinable(BlockRegistry.block_slate_green.getDefaultState(), Config.Svein_size);
        for (int i = 0; i < Config.Sspawn_rate; i++) {
            int x = chunkX*16+random.nextInt(16);
            int y = random.nextInt((Config.Smax_spawn)-(Config.Smin_spawn))+(Config.Smin_spawn);
            int z = chuckZ*16+random.nextInt(16);
            block_slate_green.generate(world, random, new BlockPos(x,y,z));
        }

        WorldGenMinable block_slate_purple = new WorldGenMinable(BlockRegistry.block_slate_purple.getDefaultState(), Config.Svein_size);
        for (int i = 0; i < Config.Sspawn_rate; i++) {
            int x = chunkX*16+random.nextInt(16);
            int y = random.nextInt((Config.Smax_spawn)-(Config.Smin_spawn))+(Config.Smin_spawn);
            int z = chuckZ*16+random.nextInt(16);
            block_slate_purple.generate(world, random, new BlockPos(x,y,z));
        }
    }
}
