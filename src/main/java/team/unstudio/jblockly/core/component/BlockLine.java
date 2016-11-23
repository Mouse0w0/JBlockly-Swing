/*
 * Copyright (c) 2016, Unknown Domain. All rights reserved.
 * GUN AGPLv3. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package team.unstudio.jblockly.core.component;

import java.util.ArrayList;
import java.util.List;

import team.unstudio.jblockly.core.Block;
import team.unstudio.jblockly.core.BlockUtils;

public class BlockLine {

	public enum AlignType {
		Left, Right
	}
	
	public enum LineType{
		None, Branch, Insert
	}

	private AlignType align = AlignType.Left;
	private LineType line = LineType.None;
	private final List<BlockComponent> components = new ArrayList<>();
	private int x, y;
	protected int childX, childY;
	protected Block parent, child = null;

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void setLocation(int x, int y) {
		setX(x);
		setY(y);
	}

	public double getHeight() {
		double height = 0;
		for (BlockComponent component : components)
			if (component.getHeight() > height)
				height = component.getHeight();
		return height;
	}

	public double getWidth() {
		double width = BlockUtils.HGAP;
		for (BlockComponent component : components)
			width += component.getWidth() + BlockUtils.HGAP;
		return width;
	}

	public Block getParent() {
		return parent;
	}

	public void setParent(Block parent) {
		this.parent = parent;
	}

	public List<BlockComponent> getComponents() {
		return components;
	}

	public void doLayout() {
		if(align==AlignType.Left){
			int y = parent.getY()+this.y,x = parent.getX()+ this.x + BlockUtils.HGAP;
			for (BlockComponent c : components) {
				c.setLocation(x, y);
				x += c.getWidth() + BlockUtils.HGAP;
			}
		}else if(align == AlignType.Right){
			//TODO: Support align right.
		}
		
		if(child!=null) child.setLocation(childX, childY);
	}

	public AlignType getAlign() {
		return align;
	}

	public void setAlign(AlignType align) {
		this.align = align;
	}

	public Block getChild() {
		return child;
	}

	public void setChild(Block child) {
		child.setBlockParent(parent);
		this.child = child;
	}

	public int getChildX() {
		return childX;
	}

	public void setChildX(int childX) {
		this.childX = childX;
	}

	public int getChildY() {
		return childY;
	}

	public void setChildY(int childY) {
		this.childY = childY;
	}
	
	public void setChildLocation(int childX,int childY){
		setChildX(childX);
		setChildY(childY);
	}

	public LineType getLineType() {
		return line;
	}

	public void setLineType(LineType line) {
		this.line = line;
	}
	

	public void dispose() {
		for (BlockComponent component : components)
			component.dispose();
	}
}
