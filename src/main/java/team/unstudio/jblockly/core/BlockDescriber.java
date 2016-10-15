/*
 * Copyright (c) 2016, Unknown Domain. All rights reserved.
 * GUN GPLv3. Use is subject to license terms.
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

package team.unstudio.jblockly.core;

import javafx.scene.paint.Color;

/**
 * 代码块描述器
 */
public class BlockDescriber {
	
	/**
	 * 代码块连接方式
	 */
	public enum ConnectionType{
		None,Left,TopAndBottom,Top,Bottom
	}
	
	private final String name;
	private Color color = new Color(1.0, 1.0, 1.0, 1.0);
	private ConnectionType connectionType = ConnectionType.None;
	private String message;
	private String tooltip;
	private BlockInputDescriber[] inputs;
	
	public BlockDescriber(String name) {
		if(name == null||name.isEmpty()) throw new IllegalArgumentException();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Color getColor() {
		return color;
	}

	public String getMessage() {
		return message;
	}

	public ConnectionType getConnectionType() {
		return connectionType;
	}

	public String getTooltip() {
		return tooltip;
	}

	public BlockInputDescriber[] getInputs() {
		return inputs;
	}
}
