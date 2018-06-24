package com.arunzlair.connectors;

import com.boomi.connector.api.OperationResponse;
import com.boomi.connector.api.QueryRequest;
import com.boomi.connector.util.BaseQueryOperation;

public class BoxQueryOperation extends BaseQueryOperation {

	protected BoxQueryOperation(BoxConnection conn) {
		super(conn);
	}

	@Override
	protected void executeQuery(QueryRequest request, OperationResponse response) {
		// TODO Auto-generated method stub
	}

	@Override
    public BoxConnection getConnection() {
        return (BoxConnection) super.getConnection();
    }
}