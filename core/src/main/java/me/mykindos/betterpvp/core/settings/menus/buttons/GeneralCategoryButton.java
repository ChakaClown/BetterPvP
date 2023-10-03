package me.mykindos.betterpvp.core.settings.menus.buttons;

import me.mykindos.betterpvp.core.gamer.Gamer;
import me.mykindos.betterpvp.core.menu.Button;
import me.mykindos.betterpvp.core.menu.MenuManager;
import me.mykindos.betterpvp.core.settings.menus.GeneralSettingsMenu;
import me.mykindos.betterpvp.core.utilities.UtilSound;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.ClickType;
import org.bukkit.inventory.ItemStack;

public class GeneralCategoryButton extends Button {

    public GeneralCategoryButton() {
        super(0,
                new ItemStack(Material.REDSTONE_TORCH),
                Component.text("General Settings", NamedTextColor.GREEN, TextDecoration.BOLD),
                Component.text("View your general settings", NamedTextColor.GRAY));
    }

    @Override
    public void onClick(Player player, Gamer gamer, ClickType clickType) {

        GeneralSettingsMenu generalSettingsMenu = new GeneralSettingsMenu(player, gamer);
        MenuManager.openMenu(player, generalSettingsMenu);
        UtilSound.playSound(player, Sound.BLOCK_NOTE_BLOCK_PLING, 1, 1, false);

    }
}