package proiectjava.dealershipfinalproject;

import javax.swing.AbstractListModel;
import java.util.ArrayList;
import java.util.List;

public class AtvListModel extends AbstractListModel<String> {
    private final List<String> atvs = new ArrayList<>();

    @Override
    public int getSize() {
        return atvs.size();
    }

    @Override
    public String getElementAt(int index) {
        return atvs.get(index);
    }

    public void addAtv(String car) {
        atvs.add(car);
        int index = atvs.size() - 1;
        fireIntervalAdded(this, index, index);
    }
}
