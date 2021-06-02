package entities;

import javax.xml.bind.annotation.XmlAttribute;

public class CallPrices {

    private int id;
    private int insideNetwork;
    private int outsideNetwork;
    private int fixedNumbers;

    public CallPrices() {
    }

    @XmlAttribute
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInsideNetwork() {
        return insideNetwork;
    }

    public void setInsideNetwork(int insideNetwork) {
        this.insideNetwork = insideNetwork;
    }

    public int getOutsideNetwork() {
        return outsideNetwork;
    }

    public void setOutsideNetwork(int outsideNetwork) {
        this.outsideNetwork = outsideNetwork;
    }

    public int getFixedNumbers() {
        return fixedNumbers;
    }

    public void setFixedNumbers(int fixedNumbers) {
        this.fixedNumbers = fixedNumbers;
    }

    @Override
    public String toString() {
        return "CallPrices{" +
                "id=" + id +
                ", insideNetwork=" + insideNetwork +
                ", outsideNetwork=" + outsideNetwork +
                ", fixedNumbers=" + fixedNumbers +
                '}';
    }
}
