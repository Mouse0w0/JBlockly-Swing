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

package team.unstudio.jblockly.core.event;

import java.util.EventObject;

import team.unstudio.jblockly.old.ui.block.Block;

public class BlockEvent extends EventObject{

	private static final long serialVersionUID = 1L;

	public BlockEvent(Block source) {
		super(source);
	}
	
	public Block getBlock(){
		return (Block) getSource();
	}
}
