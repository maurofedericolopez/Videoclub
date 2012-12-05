package Vistas.modelos;

import java.util.ArrayList;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author Mauro Federico Lopez
 */
public class PeriodoComboBoxModel extends AbstractListModel implements ComboBoxModel {

    private ArrayList<Integer> periodos;
    private Integer periodoSeleccionado;

    public PeriodoComboBoxModel() {
        super();
        periodos = new ArrayList();
        periodoSeleccionado = null;
    }

    @Override
    public int getSize() {
        return periodos.size();
    }

    @Override
    public Object getElementAt(int index) {
        return periodos.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        periodoSeleccionado = (Integer) anItem;
    }

    @Override
    public Object getSelectedItem() {
        return periodoSeleccionado;
    }

    /**
     * @param periodos the periodos to set
     */
    public void setPeriodos(ArrayList<Integer> periodos) {
        this.periodos = periodos;
        fireContentsChanged(this, 0, this.periodos.size());
        periodoSeleccionado = null;
    }

}
