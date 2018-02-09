/*
 * This file is part of GriefPrevention, licensed under the MIT License (MIT).
 *
 * Copyright (c) bloodmc
 * Copyright (c) contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package me.ryanhamshire.griefprevention.configuration.category;

import ninja.leaping.configurate.objectmapping.Setting;
import ninja.leaping.configurate.objectmapping.serialize.ConfigSerializable;

import java.util.ArrayList;
import java.util.List;

@ConfigSerializable
public class ClaimCategory extends ConfigCategory {

    @Setting(value = "accesstrust-commands", comment = "The list of slashcommands requiring access trust when in a claim.")
    public List<String> accessTrustCommands = new ArrayList<>();
    @Setting(value = "auto-claim-radius", comment = "Radius used for auto-created claims. Set to -1 to disable.")
    public int claimRadius = 4;
    @Setting(value = "cleanup-task-interval", comment = "The interval in minutes for attempting to remove expired claims. Set to 0 to disable.")
    public int cleanupTaskInterval = 5;
    @Setting(value = "deliver-manuals", comment = "Send players manuals on claim creation.")
    public boolean deliverManuals = false;
    @Setting(value = "auto-nature-restore", comment = "Whether survival claims will be automatically restored to nature when auto-deleted. "
            + "Note: This only supports vanilla blocks. Use with caution if using custom biomes.")
    public boolean claimAutoNatureRestore = false;
    @Setting(value = "investigation-tool", comment = "The item used to investigate claims with a right-click.")
    public String investigationTool = "minecraft:stick";
    @Setting(value = "modification-tool", comment = "The item used to create/resize claims with a right click.")
    public String modificationTool = "minecraft:golden_shovel";
    @Setting(value = "claims-mode", comment = "The mode used when creating claims. (0 = Disabled, 1 = Survival, 2 = Creative)")
    public int claimMode = 1;
    @Setting(value = "bank-tax-system", comment = "Whether to enable the bank/tax system for claims. Set to true to enable.")
    public boolean bankTaxSystem = false;
    @Setting(value = "tax-apply-hour", comment = "The specific hour in day to apply tax to all claims.")
    public int taxApplyHour = 12;
    @Setting(value = "bank-transaction-log-limit")
    public int bankTransactionLogLimit = 60;
    @Setting(value = "hide-borders-when-using-wecui", comment = "Whether to hide the glowstone/gold block borders when using WECUI.")
    public boolean hideBorders = false;

    public ClaimCategory() {

    }
}