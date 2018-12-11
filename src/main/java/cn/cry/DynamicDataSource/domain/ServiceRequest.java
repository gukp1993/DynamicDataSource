package cn.cry.DynamicDataSource.domain;

/**
 * @author gukepeng
 * @since 2018/12/11
 */
public class ServiceRequest {
    private Long id;
    private String serviceCode;
    private String fwsPin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getFwsPin() {
        return fwsPin;
    }

    public void setFwsPin(String fwsPin) {
        this.fwsPin = fwsPin;
    }

    @Override
    public String toString() {
        return "ServiceRequest{" +
                "id=" + id +
                ", serviceCode='" + serviceCode + '\'' +
                ", fwsPin='" + fwsPin + '\'' +
                '}';
    }
}
