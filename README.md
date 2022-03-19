# NPC-Lib

Asynchronous, high-performance Minecraft NPC library for 1.8-1.18 servers.
#### This is a fork that integrates <a href="https://github.com/unldenis/Hologram-Lib">Hologram-Lib</a> for npc holograms.

### Example usage

```java
public NPC appendNPC(Player player) {
    // building the NPC
    NPC npc = NPC.builder()
            .profile(this.createProfile())
            .location(player.getLocation())
            .imitatePlayer(false)
            .lookAtPlayer(false)
            .addLine("Hello world")
            .addLine("Hello %%player%%")
            .addLine(new ItemStack(Material.EMERALD_BLOCK))
            .addPlaceholder("%%player%%", Player::getName)
            // appending it to the NPC pool
            .build(this.npcPool);

    npc.hologram().getLines().get(2).setAnimation(Animation.CIRCLE);
    Bukkit.getScheduler().runTaskTimer(plugin, ()->{
        npc.teleport().queueTeleport(player.getLocation(), false).send();
    }, 20L*4, 20L*4);
    return npc;
}
```
