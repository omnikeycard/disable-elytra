package disableElytra;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityToggleGlideEvent;

public class EventsListener implements Listener {
	
	String message = Plugin.message;

	@EventHandler
	public void OnElytraFly(EntityToggleGlideEvent e) {
		Player player = (Player) e.getEntity();
		e.setCancelled(true);
		player.getInventory().setChestplate(null);
		player.sendMessage(message);
	}
	
}
