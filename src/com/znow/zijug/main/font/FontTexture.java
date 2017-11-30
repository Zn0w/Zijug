package com.znow.zijug.main.font;

import java.awt.Font;
import java.awt.image.BufferedImage;
import java.util.HashMap;

import com.znow.zijug.main.graphics.Texture;

public class FontTexture {
	
	private HashMap<Character, Glyph> glyphs;
	private Texture texture;
	private int fontHeight;
	
	public FontTexture(Font font) {
		glyphs = new HashMap();
		texture = createFontTexture(font);
	}
	
	private Texture createFontTexture(Font font) {
		// Create font texture
		int imageWidth = 0;
		int imageHeight = 0;
		
		// In ASCII from 32 to 256 is a letters
		for (int i = 32; i < 256; i++) {
			// 127 in ASCII is DEL control code
			if (i == 127)
				continue;
			
			char ch = (char) i;
			BufferedImage chImage = createImage(font, ch);
			
			imageWidth += chImage.getWidth();
		    imageHeight = Math.max(imageHeight, chImage.getHeight());
		}
		
		fontHeight = imageHeight;
		
		return texture;
	}
	
	private BufferedImage createImage(Font font, char ch) {
		return null;
	}
	
}
