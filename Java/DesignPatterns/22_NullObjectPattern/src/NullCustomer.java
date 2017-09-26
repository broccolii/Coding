public class NullCustomer extends AbstractCustomer {
    @Override
    public String getName() {
        return "Not Available in Customer DataBase";
    }

    @Override
    public boolean isNill() {
        return true;
    }
}
