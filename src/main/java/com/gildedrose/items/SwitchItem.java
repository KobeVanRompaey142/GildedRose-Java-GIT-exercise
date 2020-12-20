

package com.gildedrose.items;

import com.gildedrose.core.Item;

public class SwitchItem extends Item{
    public SwitchItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
    }

    @Override
    public void updateQuality() {
        int factor;
        if (this.sellIn >= 0) {
            factor = 1;
            this.quality = Math.min(this.quality + factor, 50);
        }
        else{
            factor = 1;
            this.quality = Math.max(this.quality - factor, 0);
        }


    }
}
/*
Een SwitchItem is een item dat, zolang de sellInValue groter of gelijk aan 0 is,
 elke dag in kwaliteit (1) omhoog gaat maar nooit boven de 50 gaat.
Maar het is ook een item dat, zodra de sellInValue kleinder dan 0 is,
elke dag in kwaliteit (1) afneemt maar nooit onder 0 gaat
Zorg dat het Item zich zo gedraagt en schrijf ook een test hiervoor
 waarbij je 2 functies maakt (eentje voor sellInValue >= 0 en eentje voor < 0)
 */