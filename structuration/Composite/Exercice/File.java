
/**
 * File
 */
public class File extends Component{

    private String type;

    public File(String name, String type) {
        super(name);
        this.type = type;
    }

    @Override
    public void decrire() {
        System.out.println("File: " + name + "." + type);
    }
    
    @Override
    public void ajouter(Component component) {
        // Impossible d'ajouter des éléments à un fichier
        System.out.println("Impossible d'ajouter des éléments à un fichier.");
    }

    @Override
    public void supprimer(Component component) {
        // Impossible de supprimer des éléments d'un fichier
        System.out.println("Impossible de supprimer des éléments d'un fichier.");
    }

    @Override
    public Component obtenirElement(int index) {
        // Impossible d'obtenir des éléments d'un fichier
        System.out.println("Impossible d'obtenir des éléments d'un fichier.");
        return null;
    }
    
}