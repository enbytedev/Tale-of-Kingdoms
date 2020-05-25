package net.islandearth.taleofkingdoms.client.gui;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/**
 * Find out more from our GUI research:
 * https://forum.islandearth.net/d/10-forge-modding-tutorial-1-14-creating-custom-guis-1-3
 */
@OnlyIn(Dist.CLIENT)
public abstract class ScreenTOK extends Screen {

	/**
	 * Constructs a new {@link Screen}
	 * @param translation the translation key
	 */
	protected ScreenTOK(String translation) {
		super(new TranslationTextComponent(translation));
	}

	/**
	 * Whether this {@link Screen} is closeable via the escape key.
	 * @return true if escapable
	 */
	@Override
	public boolean shouldCloseOnEsc() {
		return false;
	}

	/**
	 * Whether this {@link Screen} pauses the game.
	 * @return true if it pauses the game
	 */
	@Override
	public boolean isPauseScreen() {
		return true;
	}
}
