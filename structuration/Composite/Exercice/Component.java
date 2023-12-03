
/**
 * Component
 */
public abstract class Component {
    protected String name;

    public Component(String name) {
        this.name = name;
    }

    public abstract void decrire();
    public abstract void ajouter(Component component);
    public abstract void supprimer(Component component);
    public abstract Component obtenirElement(int index);
    
}