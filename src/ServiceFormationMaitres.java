public class ServiceFormationMaitres {

    public static void attribuerModules(Professeur[] professeur, ModuleInfo[] modules) {

        for (Professeur professeur : profs) {

            if (professeur.modulesEnseignes == null) {
                int nbre = (int) (Math.random() * (12 - 1 + 1)) + 1; // comme il ya 12 module le nombre tiré equivaudrat
                                                                     // au module dans l'ordre cronologique
            }
        }
    }

    public boolean tousModulesCouverts(Professeur[] profs, ModuleInfo[] modules) {
        Boolean reussi = true;
        Object modulesEnseignes;
        for (int i = 0; i < modulesEnseignes.length; i++) {
            if (modulesEnseignes[i] == null) {
                return false;
            }
            break;
        }

    }
}
