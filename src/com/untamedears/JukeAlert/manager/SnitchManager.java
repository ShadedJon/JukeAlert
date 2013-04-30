package com.untamedears.JukeAlert.manager;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.bukkit.Location;
import org.bukkit.World;

import com.untamedears.JukeAlert.JukeAlert;
import com.untamedears.JukeAlert.model.Snitch;
import com.untamedears.JukeAlert.storage.JukeAlertLogger;

public class SnitchManager {

	private JukeAlert plugin;
	private JukeAlertLogger logger;
	private Map<World, Map<Location, Snitch>> snitches;

	public SnitchManager() {
		plugin = JukeAlert.getInstance();
		logger = plugin.getJaLogger();
	}
	
	public void loadSnitches() {
		snitches = logger.getAllSnitches();
	}
	
	public void saveSnitches() {
		//TODO: saveSnitches
		//logger.saveAllSnitches();
	}
	
	public Map<World, Map<Location, Snitch>> getAllSnitches() {
		return snitches;
	}
	
	public void setSnitches(Map<World, Map<Location, Snitch>> snitches)	{
		this.snitches = snitches;
	}
	
	public List<Snitch> getSnitchesByWorld(World world) {
		return (List<Snitch>) snitches.get(world).values();
	}
	
	public Snitch getSnitch(World world, Location location) {
		return snitches.get(world).get(location);
	}
	
	public void addSnitch(Snitch snitch) {
		//TODO: addSnitch
		System.out.println("Snitch added");
		/*Map<Location, Snitch> map = new HashMap<Location, Snitch>();
		map.put(snitch.getLoc(), snitch);
		snitches.put(snitch.getLoc().getWorld(), map);*/
	}
	
	public void removeSnitch(Snitch snitch)	{
		//TODO: removeSnitch
	}
}
