package proiectjava.dealershipfinalproject;

import javax.swing.AbstractListModel;
import java.util.ArrayList;
import java.util.List;

public class JetSkiListModel extends AbstractListModel<String> {
    private final List<String> jetSkis = new ArrayList<>();

    @Override
    public int getSize() {
        return jetSkis.size();
    }

    @Override
    public String getElementAt(int index) {
        return jetSkis.get(index);
    }

    public void addJetSki(String jetSki) {
        jetSkis.add(jetSki);
        int index = jetSkis.size() - 1;
        fireIntervalAdded(this, index, index);
    }
}
