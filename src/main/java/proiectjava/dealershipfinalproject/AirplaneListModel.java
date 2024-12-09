package proiectjava.dealershipfinalproject;

import javax.swing.AbstractListModel;
import java.util.ArrayList;
import java.util.List;

public class AirplaneListModel extends AbstractListModel<String> {
    private final List<String> airplanes = new ArrayList<>();

    @Override
    public int getSize() {
        return airplanes.size();
    }

    @Override
    public String getElementAt(int index) {
        return airplanes.get(index);
    }

    public void addAirplane(String airplane) {
        airplanes.add(airplane);
        int index = airplanes.size() - 1;
        fireIntervalAdded(this, index, index);
    }
}
