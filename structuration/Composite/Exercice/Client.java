
/**
 * Client
 */
public class Client {
    public static void main(String[] args) {
        // Création d'éléments
        Component pdfFile = new PDFFile("DocumentPDF");
        Component txtFile = new TXTFile("DocumentTXT");
        Component folder = new Folder("Dossier");

        // Ajout d'éléments à un dossier
        folder.ajouter(pdfFile);
        folder.ajouter(txtFile);

        // Description du dossier (affiche également les éléments qu'il contient)
        folder.decrire();
    }
}