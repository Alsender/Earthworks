package alsender.earthworks.main.world;

import alsender.earthworks.main.Config;
import alsender.earthworks.main.registry.BlockRegistry;
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
        WorldGenMinable block_chalk = new WorldGenMinable(BlockRegistry.block_chalk.getDefaultState(), 64);
        for (int i = 0; i < Config.spawn_rate; i++) {
            int x = chunkX*16+random.nextInt(16);
            int y = random.nextInt((Config.max_spawn)-(Config.min_spawn))+(Config.min_spawn);
            int z = chuckZ*16+random.nextInt(16);
            block_chalk.generate(world, random, new BlockPos(x,y,z));
        }
    }
}
