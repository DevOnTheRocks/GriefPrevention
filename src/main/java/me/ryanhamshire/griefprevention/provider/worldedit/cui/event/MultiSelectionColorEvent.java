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
package me.ryanhamshire.griefprevention.provider.worldedit.cui.event;

import com.sk89q.worldedit.internal.cui.CUIEvent;
import me.ryanhamshire.griefprevention.provider.worldedit.cui.MultiSelectionType;

public class MultiSelectionColorEvent implements CUIEvent {

    private final String edgeColor;
    private final String gridColor;
    private final String p1Color;
    private final String p2Color;
    private final String[] parameters;

    public MultiSelectionColorEvent(String edgeColor, String gridColor, String p1Color, String p2Color) {
        this.edgeColor = edgeColor;
        this.gridColor = gridColor;
        this.p1Color = p1Color;
        this.p2Color = p2Color;
        this.parameters = new String[] {
                this.edgeColor,
                this.gridColor,
                this.p1Color,
                this.p2Color};
    }

    @Override
    public String getTypeId() {
        return MultiSelectionType.COLOR;
    }

    @Override
    public String[] getParameters() {
        return this.parameters;
    }

}
