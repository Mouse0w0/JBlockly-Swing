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

public interface ValueInput<T> extends BlockComponent {

	String getName();

	void setName(String name);

	T getInput();

	void setInput(T obj);
	
	boolean isEditable();
	
	void setEditable(boolean editable);

}
