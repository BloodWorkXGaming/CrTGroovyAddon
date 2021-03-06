package atm.bloodworkxgaming.craftgroovy.wrappers

import atm.bloodworkxgaming.craftgroovy.util.VanillaSounds
import de.bloodworkxgaming.groovysandboxedlauncher.sandbox.WhitelistRegistry

class WrapperWhitelister {
    static List<Class<?>> classes = [
            PBlock,
            PBiome,
            PBlockState,
            PBlockSnapshot,
            PBreakEvent,
            PClientChatEvent,
            PCreateFluidSourceEvent,
            PEntityItem,
            PEntityItemPickupEvent,
            PEnumFacing,
            PHarvestDropsEvent,
            PMultiPlaceEvent,
            PNeighborNotifyEvent,
            PPlaceEvent,
            PPlayer,
            PTileEntity,
            PWorld
    ]


    static void registerWrappers(WhitelistRegistry registry) {
        registry.with {
            for (c in classes)
                registerWildCardMethod(c)
            registerField(VanillaSounds, "*")
        }
    }
}
