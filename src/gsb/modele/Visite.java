package gsb.modele;

public class Visite {
	   protected  String   reference;
	   protected  String date;
	   protected  String   commentaire;
	   protected  Medecin  unMedecin;
	   protected  Visiteur  unVisiteur;
	/**
	 * @param reference
	 * @param date
	 * @param commentaire
	 * @param unMedecin
	 * @param unVisiteur
	 */
	public Visite(String reference, String date, String commentaire, Medecin unMedecin, Visiteur unVisiteur) {
		super();
		this.reference = reference;
		this.date = date;
		this.commentaire = commentaire;
		this.unMedecin = unMedecin;
		this.unVisiteur = unVisiteur;
	}
	/**
	 * @return the reference
	 */
	public String getReference() {
		return reference;
	}
	/**
	 * @param reference the reference to set
	 */
	public void setReference(String reference) {
		this.reference = reference;
	}
	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @return the commentaire
	 */
	public String getCommentaire() {
		return commentaire;
	}
	/**
	 * @param commentaire the commentaire to set
	 */
	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}
	/**
	 * @return the unMedecin
	 */
	public Medecin getUnMedecin() {
		return unMedecin;
	}
	/**
	 * @param unMedecin the unMedecin to set
	 */
	public void setUnMedecin(Medecin unMedecin) {
		this.unMedecin = unMedecin;
	}
	/**
	 * @return the unVisiteur
	 */
	public Visiteur getUnVisiteur() {
		return unVisiteur;
	}
	/**
	 * @param unVisiteur the unVisiteur to set
	 */
	public void setUnVisiteur(Visiteur unVisiteur) {
		this.unVisiteur = unVisiteur;
	}

	   
	   

}
