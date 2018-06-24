package com.arunzlair.connectors;

import com.boomi.connector.api.OperationResponse;
import com.boomi.connector.api.UpdateRequest;
import com.boomi.connector.util.BaseUpdateOperation;

public class BoxUpsertOperation extends BaseUpdateOperation {

	protected BoxUpsertOperation(BoxConnection conn) {
		super(conn);
	}

	@Override
	protected void executeUpdate(UpdateRequest request, OperationResponse response) {
		// TODO Auto-generated method stub
	}

	@Override
    public BoxConnection getConnection() {
        return (BoxConnection) super.getConnection();
    }
}