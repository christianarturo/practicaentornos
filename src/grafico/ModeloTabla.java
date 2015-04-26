package grafico;
    
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Christian
 */
public class ModeloTabla extends DefaultTableModel {

    @Override
    public boolean isCellEditable(int fila, int columna) {
        boolean modificar;
        if (columna == 0) {
            modificar = false;
        } else {
            modificar = true;
        }
        return modificar;
    }
}
