package com.arunzlair.connectors;

import com.boomi.connector.api.DeleteRequest;
import com.boomi.connector.api.OperationResponse;
import com.boomi.connector.util.BaseDeleteOperation;

public class BoxDeleteOperation extends BaseDeleteOperation {

	protected BoxDeleteOperation(BoxConnection conn) {
		super(conn);
	}

	@Override
	protected void executeDelete(DeleteRequest request, OperationResponse response) {
		// TODO Auto-generated method stub
	}

	@Override
    public BoxConnection getConnection() {
        return (BoxConnection) super.getConnection();
    }
}