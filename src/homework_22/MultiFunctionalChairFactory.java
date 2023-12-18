package homework_22;

class MultiFunctionalChairFactory implements ChairFactory {
    @Override
    public Chair createChair() {
        return new MultiFunctionalChair();
    }
}
