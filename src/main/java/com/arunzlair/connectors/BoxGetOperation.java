package com.arunzlair.connectors;

import com.boomi.connector.api.GetRequest;
import com.boomi.connector.api.OperationResponse;
import com.boomi.connector.util.BaseGetOperation;

public class BoxGetOperation extends BaseGetOperation {

    protected BoxGetOperation(BoxConnection conn) {
        super(conn);
    }

	@Override
	protected void executeGet(GetRequest request, OperationResponse response) {
		// TODO Auto-generated method stub
	}

	@Override
    public BoxConnection getConnection() {
        return (BoxConnection) super.getConnection();
    }
}