import java.util.Set;

public class Professeur {
    private final String nom;
    private final String prenom;
    //MR Le tableau ne doit pas être final car on va le recréer à chaque fois que l'on ajoute un module
    private final ModuleInfo[] modulesEnseignes;

    public Professeur(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
        this.modulesEnseignes = tab[0]; // j'ai pas compris la notion avec le type de modulesEnseignes mais j'ai compris qu'il fallait que je fasse un tableau de taille 0

    }

    public boolean enseigneCeModule(String nomDuModule) {
boolean reussi = false;
for (int i = 0; i < modulesEnseignes.length; i++) {
    //MR Il faut vérifier si le nomDuModule est dans le tableau
    if (modulesEnseignes[i] == null) {
        return true;
    }
}
    }

    public void ajouterModuleEnseigne(ModuleInfo module) {

        for (int i = 0; i < modulesEnseignes.length; i++) {
            if (modulesEnseignes[i] == null) {
                i++;
                // il faut faire un tableau dynamique donc comme vous avez montrer hier avec les
                // objet et je dois les mettres dans un tableau genre [j] et mettre les
                // ittération dans celui la mais je ne sais plus comment faire
            }
        }
    }

    public void viderModules() {
        for (ModuleInfo moduleInfo : modulesEnseignes) {
            Set moduleEnseignes = null;
        }
    }

    public String getNom() {
        return nom;

    }

    public ModuleInfo[] getModulesEnseignes() {
        return modulesEnseignes;
    }

    public String getPrenom() {
        return prenom;
    }

    @Override
    public String toString() {
        //MR Il manque la fonction uppercase
        return prenom + " " + nom;
    }

}
