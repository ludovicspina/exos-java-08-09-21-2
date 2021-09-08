package classes;

public class DVD extends Article {

    private int duree;
    private Personne realisateur;

    public DVD(String reference, String designation, double prix, int duree, Personne realisateur) {
        super(reference, designation, prix);
        this.duree = duree;
        this.realisateur = realisateur;
    }

    public void setRealisateur(Personne realisateur) {
        this.realisateur = realisateur;
    }

    @Override
    public String toString() {
        return super.toString() +
                "DVD{" +
                "duree=" + duree +
                ", realisateur='" + realisateur.getNom() + '\'' +
                '}';
    }
}
