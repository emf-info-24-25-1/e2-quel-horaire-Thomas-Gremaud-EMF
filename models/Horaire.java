public class Horaire {
    public static final int NBRE_DE_BLOCS = 6;
    //MR blocs est final
    private Bloc[] blocs;

    public Horaire() {
        this.blocs = blocs;
        //MR Il faut créer le tableau et insérer le nombre de blocs (6)
    }

    public boolean planifier(Moduleinfo[] modules, Professeur[] profs) {
        boolean reussi = false;
        for (int i = 0; i < profs.length; i++) {
            if (profs[i] == null) {
                return true;
            }
            break;
        }
    }

    public void afficherHorraire() {
        System.out.println(afficherHorraire());
    }

    public Bloc moduleDansQuelBloc(ModuleInfo module) {

    }

}
