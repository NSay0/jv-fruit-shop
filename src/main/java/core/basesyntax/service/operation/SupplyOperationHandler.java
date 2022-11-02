package core.basesyntax.service.operation;

public class SupplyOperationHandler implements OperationHandler {
    @Override
    public int doOperation(int balance, int quantity) {
        return balance + quantity;
    }
}
