/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sunzida;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author User
 */
public class Service implements Serializable {
    
    String serviceName,ContactNo,serviceCatago;
    LocalDate contractFrom,contractTo;

    public Service(String serviceName, String ContactNo, String serviceCatago, LocalDate contractFrom, LocalDate contractTo) {
        this.serviceName = serviceName;
        this.ContactNo = ContactNo;
        this.serviceCatago = serviceCatago;
        this.contractFrom = contractFrom;
        this.contractTo = contractTo;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getContactNo() {
        return ContactNo;
    }

    public void setContactNo(String ContactNo) {
        this.ContactNo = ContactNo;
    }

    public String getServiceCatago() {
        return serviceCatago;
    }

    public void setServiceCatago(String serviceCatago) {
        this.serviceCatago = serviceCatago;
    }

    public LocalDate getContractFrom() {
        return contractFrom;
    }

    public void setContractFrom(LocalDate contractFrom) {
        this.contractFrom = contractFrom;
    }

    public LocalDate getContractTo() {
        return contractTo;
    }

    public void setContractTo(LocalDate contractTo) {
        this.contractTo = contractTo;
    }

    @Override
    public String toString() {
        return "Service{" + "serviceName=" + serviceName + ", ContactNo=" + ContactNo + ", serviceCatago=" + serviceCatago + ", contractFrom=" + contractFrom + ", contractTo=" + contractTo + '}';
    }
    
}
