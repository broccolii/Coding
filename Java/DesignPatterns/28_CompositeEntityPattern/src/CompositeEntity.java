public class CompositeEntity {
    private CoarseGraniedObject cgo = new CoarseGraniedObject();

    public void setData(String data1, String data2) {
        cgo.setData(data1, data2);
    }

    public String[] getData() {
        return cgo.getData();
    }
}
