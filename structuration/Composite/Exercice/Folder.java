
/**
 * Folder
 */
import java.util.ArrayList;
import java.util.List;

public class Folder extends Component{

    private List<Component> elements;

    public Folder(String name) {
        super(name);
        this.elements = new ArrayList<>();
    }

    @Override
    public void decrire() {
        System.out.println("Folder : "+ name);
        for(Component element : elements) {
            element.decrire();
        }
    }

    @Override
    public void ajouter(Component component) {
        elements.add(component);
    }

    @Override
    public void supprimer(Component component) {
        elements.remove(component);
    }

    @Override
    public Component obtenirElement(int index) {
        if (index < elements.size()) {
            return elements.get(index);
        } else {
            System.out.println("Index hors limites.");
            return null;
        }
    }
    
}