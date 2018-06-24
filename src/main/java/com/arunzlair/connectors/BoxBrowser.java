package com.arunzlair.connectors;

import java.util.Collection;

import com.boomi.connector.api.ObjectDefinitionRole;
import com.boomi.connector.api.ObjectDefinitions;
import com.boomi.connector.api.ObjectTypes;
import com.boomi.connector.util.BaseBrowser;

public class BoxBrowser extends BaseBrowser {

    protected BoxBrowser(BoxConnection conn) {
        super(conn);
    }

	@Override
	public ObjectDefinitions getObjectDefinitions(String objectTypeId,
			Collection<ObjectDefinitionRole> roles) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ObjectTypes getObjectTypes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
    public BoxConnection getConnection() {
        return (BoxConnection) super.getConnection();
    }
}