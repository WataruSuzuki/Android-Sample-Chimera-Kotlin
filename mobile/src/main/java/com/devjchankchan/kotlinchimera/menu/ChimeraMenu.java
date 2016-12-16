package com.devjchankchan.kotlinchimera.menu;

import android.content.*;

import com.devjchankchan.kotlinchimera.R;

import java.util.*;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class ChimeraMenu {

    /**
     * An array of sample items.
     */
    public static List<MenuItem> ITEMS;

    /**
     * A map of sample items, by ID.
     */
    public static Map<String, MenuItem> ITEM_MAP;

//    private static final int COUNT = 25;

//    static {
//        // Add some sample items.
//        for (int i = 1; i <= COUNT; i++) {
//            addItem(createMenuItem(i), i);
//        }
//    }

    private static String[] CHIMERA_MENU;

    public static void initItems(String[] menu) {
        ITEMS = new ArrayList<MenuItem>();
        ITEM_MAP = new HashMap<String, MenuItem>();
        CHIMERA_MENU = menu;

        int max = CHIMERA_MENU.length;
        for (int i = 0; i < max; i++) {
            addItem(createMenuItem(i), i);
        }
    }

    private static void addItem(MenuItem item, int position) {
        ITEMS.add(item);
        ITEM_MAP.put(String.valueOf(position), item);
    }

    private static MenuItem createMenuItem(int position) {
        return new MenuItem(CHIMERA_MENU[position], makeDetails(position));
//        return new MenuItem(String.valueOf(position), "Item " + position, makeDetails(position));
    }

    private static String makeDetails(int position) {
//        StringBuilder builder = new StringBuilder();
//        builder.append("Details about Item: ").append(position);
//        for (int i = 0; i < position; i++) {
//            builder.append("\nMore details information here.");
//        }
//        return builder.toString();
        return CHIMERA_MENU[position];
    }

    /**
     * A item representing a piece of content.
     */
    public static class MenuItem {
//        public final String id;
        public final String content;
        public final String details;

        public MenuItem(String content, String details) {
//        public MenuItem(String id, String content, String details) {
//            this.id = id;
            this.content = content;
            this.details = details;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
