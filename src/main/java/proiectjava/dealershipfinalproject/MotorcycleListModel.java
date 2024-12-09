package proiectjava.dealershipfinalproject;

import javax.swing.AbstractListModel;
import java.util.ArrayList;
import java.util.List;

public class MotorcycleListModel extends AbstractListModel<String> {
    private final List<String> motorcycles = new ArrayList<>();

    @Override
    public int getSize() {
        return motorcycles.size();
    }

    @Override
    public String getElementAt(int index) {
        return motorcycles.get(index);
    }

    public void addMotorcycle(String motorcycle) {
        motorcycles.add(motorcycle);
        int index = motorcycles.size() - 1;
        fireIntervalAdded(this, index, index);
    }
}
