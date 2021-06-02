package entities;

import javax.xml.bind.annotation.XmlAttribute;

public class Tariff {
    private int id;
    private String name;
    private String operatorName;
    private int payRoll;
    private CallPrices callPrices;
    private int smsPrice;
    private Parameters parameters;

    public Tariff() {
    }

    @XmlAttribute
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public int getPayRoll() {
        return payRoll;
    }

    public void setPayRoll(int payRoll) {
        this.payRoll = payRoll;
    }

    public CallPrices getCallPrices() {
        return callPrices;
    }

    public void setCallPrices(CallPrices callPrices) {
        this.callPrices = callPrices;
    }

    public int getSmsPrice() {
        return smsPrice;
    }

    public void setSmsPrice(int smsPrice) {
        this.smsPrice = smsPrice;
    }

    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        return "Tariff{\n\t" +
                "id=" + id + ",\n\t" +
                "name='" + name + "\',\n\t" +
                "operatorName='" + operatorName + "\',\n\t" +
                "payRoll=" + payRoll + ",\n\t" +
                "callPrices=" + callPrices + ",\n\t" +
                "smsPrice=" + smsPrice + ",\n\t" +
                "parameters=" + parameters + "\n\t" +
                '}';
    }
}
