package com.commons.manager.objectmanagers;

import org.hibernate.SessionFactory;

public interface DBObjectManagerInterface {
	public void createMasterDBFactory();
	public SessionFactory getMasterDBFactory();
}
