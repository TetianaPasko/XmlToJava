package entities;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class Tariffs {

    List<Tariff> tarrifs;

    public Tariffs() {
    }

    @XmlElement(name = "tariff")
    public List<Tariff> getTarrifs() {
        return tarrifs;
    }

    public void setTarrifs(List<Tariff> tarrifs) {
        this.tarrifs = tarrifs;
    }

    @Override
    public String toString() {
        return "Tariffs{\n\t" +
                "tarrifs=\n\t" + tarrifs + "" +
                '}';
    }
}
