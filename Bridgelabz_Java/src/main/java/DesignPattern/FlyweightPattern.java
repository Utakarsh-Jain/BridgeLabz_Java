
/*
Program 11: Flyweight Design Pattern

Purpose:
Flyweight Pattern reduces memory usage by sharing common objects.
Here, multiple characters share the same Font object.
*/

import java.util.HashMap;
import java.util.Map;

// Shared object containing common font information
class Font {
    private String name;
    private int size;

    public Font(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void display() {
        System.out.println("Font: " + name + ", Size: " + size);
    }
}

// Factory stores and reuses Font objects
class FontFactory {
    private static Map<String, Font> fonts = new HashMap<>();

    public static Font getFont(String name, int size) {
        // Use font name and size as the unique key
        String key = name + "-" + size;

        // Create a Font only if it does not already exist
        if (!fonts.containsKey(key)) {
            fonts.put(key, new Font(name, size));
        }

        // Return the existing shared Font object
        return fonts.get(key);
    }
}

// Each character has its own data but shares the Font
class CharacterItem {
    private char character;
    private int position;
    private Font font;

    public CharacterItem(char character, int position, Font font) {
        this.character = character;
        this.position = position;
        this.font = font;
    }

    public void display() {
        System.out.println(
                "Character: " + character + ", Position: " + position
        );

        // Display the shared font information
        font.display();
    }

    public Font getFont() {
        return font;
    }
}

public class FlyweightPattern {
    public static void main(String[] args) {
        // Both characters request the same font configuration
        Font font1 = FontFactory.getFont("Arial", 12);
        Font font2 = FontFactory.getFont("Arial", 12);

        // Create character objects that share the font
        CharacterItem item1 = new CharacterItem('A', 1, font1);
        CharacterItem item2 = new CharacterItem('B', 2, font2);

        item1.display();
        item2.display();

        // Verify that the Font object is shared
        System.out.println(
                "Same font object: " + (item1.getFont() == item2.getFont())
        );
    }
}
