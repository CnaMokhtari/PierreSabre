package personnages;

public class Yakuza extends Humain {

 private String clan;
    private int reputation = 0;
    
    public Yakuza(String nom, String boissonFavorite, int argent, String clan) {
        super(nom, boissonFavorite, argent);
        this.clan = clan;
    }
    public void extorquer(Commercant victime) {
        int montantExtorque = victime.seFaireExtorquer();
        gagnerArgent(montantExtorque); 
        reputation++; 
        parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
        parler("Marco, si tu tiens � la vie donne-moi ta bourse !");
        parler("J�ai piqu� les " + montantExtorque + " sous de Marco, ce qui me fait " + getArgent() + " sous dans ma poche. Hi ! Hi !");
    }
}
