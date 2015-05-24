package tutorial.generic;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;

//import net.minecraftforge.fml.SidedProxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Generic.MODID, name=Generic.MODNAME, version=Generic.MODVER) //Tell forge "Oh hey, there's a new mod here to load."
public class Generic //Start the class Declaration
{
    //Set the ID of the mod (Should be lower case).
    public static final String MODID = "generic";
    //Set the "Name" of the mod.
    public static final String MODNAME = "Generic Mod";
    //Set the version of the mod.
    public static final String MODVER = "0.0.0";

    @Instance(value = Generic.MODID) //Tell Forge what instance to use.
    public static Generic instance;
        
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        
    }
        
    @EventHandler
    public void load(FMLInitializationEvent event)
    {

    }
        
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
    }
}
