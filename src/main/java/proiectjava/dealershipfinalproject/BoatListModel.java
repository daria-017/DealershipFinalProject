package proiectjava.dealershipfinalproject;

import javax.swing.AbstractListModel;
import java.util.ArrayList;
import java.util.List;

public class BoatListModel extends AbstractListModel<String> {
    private final List<String> boats = new ArrayList<>();

    @Override
    public int getSize() {
        return boats.size();
    }

    @Override
    public String getElementAt(int index) {
        return boats.get(index);
    }

    public void addBoat(String boat) {
        boats.add(boat);
        int index = boats.size() - 1;
        fireIntervalAdded(this, index, index);
    }
}
