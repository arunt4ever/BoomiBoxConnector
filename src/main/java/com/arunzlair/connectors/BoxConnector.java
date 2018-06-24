package com.arunzlair.connectors;

import com.boomi.connector.api.BrowseContext;
import com.boomi.connector.api.Browser;
import com.boomi.connector.api.Operation;
import com.boomi.connector.api.OperationContext;
import com.boomi.connector.util.BaseConnector;

public class BoxConnector extends BaseConnector {

    @Override
    public Browser createBrowser(BrowseContext context) {
        return new BoxBrowser(createConnection(context));
    }    

    @Override
    protected Operation createGetOperation(OperationContext context) {
        return new BoxGetOperation(createConnection(context));
    }

    @Override
    protected Operation createQueryOperation(OperationContext context) {
        return new BoxQueryOperation(createConnection(context));
    }

    @Override
    protected Operation createCreateOperation(OperationContext context) {
        return new BoxCreateOperation(createConnection(context));
    }

    @Override
    protected Operation createUpdateOperation(OperationContext context) {
        return new BoxUpdateOperation(createConnection(context));
    }

    @Override
    protected Operation createUpsertOperation(OperationContext context) {
        return new BoxUpsertOperation(createConnection(context));
    }

    @Override
    protected Operation createDeleteOperation(OperationContext context) {
        return new BoxDeleteOperation(createConnection(context));
    }

    @Override
    protected Operation createExecuteOperation(OperationContext context) {
        return new BoxExecuteOperation(createConnection(context));
    }
   
    private BoxConnection createConnection(BrowseContext context) {
        return new BoxConnection(context);
    }
}