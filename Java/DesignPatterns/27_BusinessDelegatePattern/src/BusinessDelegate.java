public class BusinessDelegate {
    private BusinessLookUp lookUpSevice = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    void doTask() {
        businessService = lookUpSevice.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
