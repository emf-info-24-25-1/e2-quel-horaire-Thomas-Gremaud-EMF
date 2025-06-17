
public class App {

    public static final String[] NOMS_MODULES = { "G300", "187", "162", "123", "293", "117", "164", "216", "106", "231",
            "122", "431" };

    public static void main(String[] args) {
    
     Horaire horaire = new Horaire horaire;
     
     ModuleInfo[12] modules1ere = new ModuleInfo[12] modules1ere;

     ModuleInfo[0] = new ModuleInfo("G300");
     ModuleInfo[1] = new ModuleInfo("187");
     ModuleInfo[2] = new ModuleInfo("162");
     ModuleInfo[3] = new ModuleInfo("123");
     ModuleInfo[4] = new ModuleInfo("293");
     ModuleInfo[5] = new ModuleInfo("117");
     ModuleInfo[6] = new ModuleInfo("164");
     ModuleInfo[7] = new ModuleInfo("216");
     ModuleInfo[8] = new ModuleInfo("106");
     ModuleInfo[9] = new ModuleInfo("231");
     ModuleInfo[10] = new ModuleInfo("122");
     ModuleInfo[11] = new ModuleInfo("431");

     Professeur[0] = new Professeur("John WICK");
     Professeur[1] = new Professeur("Taylor SWIFT");
     Professeur[2] = new Professeur("Lara CROFT");
     Professeur[3] = new Professeur("Mario RAMALHO");
     Professeur[4] = new Professeur("Nicola ROUILLER");
     Professeur[5] = new Professeur("Fanny RIEDO");


     
     while (Bloc.module != null) {
        ServiceFormationMaitres.attribuerModules(null, null);
        ServiceFormationMaitres.tousModulesCouverts();
     }
     for (Professeur professeur : profs) {
        System.out.println("l'école a engagé les professeurs suivants");
     }
     for (Module module : module) {
        prof.getModulesEnseignes();
        System.out.println(" " + module.getNom());
        System.out.println("");
        System.out.println("\nll est temps de préparer l'horaire.\n");
     }

     horaire.planifier(modules1ere, profs);

     if (Horaire.planifier == true) {
        System.out.println("Modules planifiés avec succès");
        Horaire.afficherHorraire;
     }else System.out.println("Problème de planification");


      
    
    }

}
