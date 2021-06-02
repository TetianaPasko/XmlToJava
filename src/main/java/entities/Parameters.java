package entities;

import javax.xml.bind.annotation.XmlAttribute;

public class Parameters {

    private int id;
    private int favotiteNumber;
    private String tariffication;
    private int connectionFee;

    public Parameters() {
    }

    @XmlAttribute
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFavotiteNumber() {
        return favotiteNumber;
    }

    public void setFavotiteNumber(int favotiteNumber) {
        this.favotiteNumber = favotiteNumber;
    }

    public String getTariffication() {
        return tariffication;
    }

    public void setTariffication(String tariffication) {
        this.tariffication = tariffication;
    }

    public int getConnectionFee() {
        return connectionFee;
    }

    public void setConnectionFee(int connectionFee) {
        this.connectionFee = connectionFee;
    }

    @Override
    public String toString() {
        return "Parameters{" +
                "id=" + id +
                ", favotiteNumber=" + favotiteNumber +
                ", tariffication='" + tariffication + '\'' +
                ", connectionFee=" + connectionFee +
                '}';
    }
}
