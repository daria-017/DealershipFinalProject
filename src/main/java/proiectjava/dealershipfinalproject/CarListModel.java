package proiectjava.dealershipfinalproject;

import javax.swing.AbstractListModel;
import java.util.ArrayList;
import java.util.List;

public class CarListModel extends AbstractListModel<String> {
    private final List<String> cars = new ArrayList<>();

    @Override
    public int getSize() {
        return cars.size();
    }

    @Override
    public String getElementAt(int index) {
        return cars.get(index);
    }

    public void addCar(String car) {
        cars.add(car);
        int index = cars.size() - 1;
        fireIntervalAdded(this, index, index);
    }
}
