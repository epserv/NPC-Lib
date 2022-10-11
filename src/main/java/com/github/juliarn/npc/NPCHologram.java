package com.github.juliarn.npc;

import com.github.unldenis.hologram.Hologram;
import com.github.unldenis.hologram.placeholder.Placeholders;
import java.util.Collection;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class NPCHologram extends Hologram {

  /**
   * {@inheritDoc}
   */
  @SuppressWarnings({"UnstableApiUsage", "deprecation"})
  @ApiStatus.Internal
  public NPCHologram(@NotNull Plugin plugin, @NotNull Location location,
      @Nullable Placeholders placeholders, @NotNull Collection<Player> seeingPlayers,
      @NotNull Object... l) {
    super(plugin, location, placeholders, seeingPlayers, l);
  }

  @Override
  protected void show(@NotNull Player player) {
    super.show(player);
  }

  @Override
  protected void hide(@NotNull Player player) {
    super.hide(player);
  }
}
