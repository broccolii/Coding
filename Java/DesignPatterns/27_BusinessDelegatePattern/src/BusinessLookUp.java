public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceTyep) {
        if (serviceTyep.equalsIgnoreCase("EJB")) {
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}
