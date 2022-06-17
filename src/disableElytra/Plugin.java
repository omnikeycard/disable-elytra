package disableElytra;

import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {
	
	static String message;
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new EventsListener(), this);
		saveDefaultConfig();
		message = this.getConfig().getString("message");
	}

}
