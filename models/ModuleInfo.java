public class ModuleInfo {
    private final String nom;
    private Professeur professeur;

    public Moduleinfo(String nom){
    this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    @Override
    public String toString() {
        if (professeur != null) {
            System.out.println(nom + "avec" + Professeur.getNom() + Professeur.GetPrenom());
        } else
            System.out.println(nom);

    }

}
