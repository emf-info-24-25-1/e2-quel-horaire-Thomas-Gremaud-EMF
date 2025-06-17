import java.time.DayOfWeek;

public class Bloc {

    public static final int NBRE_DEMI_JOURS_SEMAINE = 10;
    private final String nom;
    private final ModuleInfo[] modules;

    public Bloc(String nom) {
        this.nom = nom;
    }

    public boolean planifierModule(ModuleInfo module) {
        boolean reussi = false;
        for (int i = 0; i < modules.length; i++) {
            if (modules[i] > 3 == null) {
                return reussi = true;
            }
            break;
        }
    }

    public void afficherHorraire() {
        System.out.println(DayOfWeek.values()[0].getDisplayName(textStyle.FULL, Locale.SUISSE));
        System.out.println(DayOfWeek.values()[1].getDisplayName(textStyle.FULL, Locale.SUISSE));
        System.out.println(DayOfWeek.values()[2].getDisplayName(textStyle.FULL, Locale.SUISSE));
        System.out.println(DayOfWeek.values()[3].getDisplayName(textStyle.FULL, Locale.SUISSE));
        System.out.println(DayOfWeek.values()[4].getDisplayName(textStyle.FULL, Locale.SUISSE));
        System.out.println(DayOfWeek.values()[5].getDisplayName(textStyle.FULL, Locale.SUISSE));
        System.out.println(DayOfWeek.values()[6].getDisplayName(textStyle.FULL, Locale.SUISSE));
    }

    public boolean estTotalementPlanifie() {
        boolean reussi = false;
        for (int i = 0; i < modules.length; i++) {
            if (modules[i] != null) {
                return reussi = true;
            }
            break;
        }
    }

    public boolean contientModule(Moduleinfo module) {
        Boolean reussi = false;
        for (int i = 0; i < modules.length; i++) {
            if (module[i] == modules) {
                return reussi = true;
            }
            break;
        }

    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return Bloc;
    }

}