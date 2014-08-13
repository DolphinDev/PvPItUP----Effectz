package net.darkzonex44.Effects;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import de.slikey.effectlib.EffectLib;
import de.slikey.effectlib.EffectManager;
import de.slikey.effectlib.effect.TextLocationEffect;
import de.slikey.effectlib.util.ParticleEffect;

public class Effect extends JavaPlugin {

	
	EffectManager em;
	
	
	@Override
	public void onEnable() {
		System.out.println("[PvPItUPEffects] Calling Instance...");
		em = new EffectManager(EffectLib.instance());
	}
	
	@Override
	public void onDisable() {
		System.out.println("[PvPItUPEffects] Destroying Current Effects...");
		em.dispose();
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(cmd.getName().equalsIgnoreCase("setparticle")) {
			 Player p = (Player) sender;
			 if(p.hasPermission("pvpitup.setparticle"));
			 /**
			  * Cast
			  * 
			  */
			 
			  TextLocationEffect effect = new TextLocationEffect(em, p.getLocation());
			  
	/**
	 * 
	 * 
	 * 
	 * Creates a New TextLocationEffect, in which Case The EffectManager Variable and the Location, in which case the Player's Location.
	 * 
	 * 
	 */
			  
			  effect.text = "Welcome to PvPItUP!"; //Changes Text
			  effect.particle = ParticleEffect.FIREWORKS_SPARK; //Default Particle
			  
			  /** 
			   * 
			   * The Particle in TextLocationEffect is FireWork_SPARK By Default you may change it if wanted.
			   * 
			   */
			  effect.infinite(); //Never Dies Out unless someone does /reload
			  
			  effect.start(); //Start's Effect
			  p.sendMessage(ChatColor.DARK_RED + "Created..");
			  
			  
			  
			  /**
			   * 
			   * Does Text
			   * 
			   * 
			   */
			  
		}
		
		
		return false;
	
	}
	
}
