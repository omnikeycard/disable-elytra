package disableElytra;

import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {
	
	static String message;
	
	@Override
	public void onEnable() {
		saveDefaultConfig();
		message = this.getConfig().getString("message");
		
		getServer().getPluginManager().registerEvents(new EventsListener(), this);
		
		this.getLogger().info("Enabled!");
	}

}
