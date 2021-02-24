package supercoder79.survivalgames.game.map.biome.generator;

import com.mojang.serialization.Codec;
import supercoder79.survivalgames.game.map.biome.BiomeGen;
import supercoder79.survivalgames.game.map.biome.nether.*;

public class NetherBiomeGenerator implements BiomeGenerator{
    public static final Codec<NetherBiomeGenerator> CODEC = Codec.unit(new NetherBiomeGenerator());

    @Override
    public BiomeGen getBiome(double temperature, double rainfall) {
        if(rainfall < 0.4) {
            if(temperature < 0.5) {
                return NetherWastesGen.INSTANCE;
            } else {
                return SoulSandValleyGen.INSTANCE;
            }
        } else if(rainfall < 0.5) {
            return BasaltDeltasGen.INSTANCE;
        } else {
            if(temperature < 0.5) {
                return CrimsonForestGen.INSTANCE;
            } else {
                return WarpedForestGen.INSTANCE;
            }
        }
    }

    @Override
    public Codec<? extends BiomeGenerator> getCodec() {
        return CODEC;
    }
}
