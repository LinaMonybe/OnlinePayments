public class VirementBancaire implements Payable {
    
    private String nomBanque;
    private String iban;
    private String bic;

    public VirementBancaire(String nomBanque, String iban, String bic) {
        setNomBanque(nomBanque);
        setIban(iban);
        setBic(bic);
    }

    public String getNomBanque() {
        return nomBanque;
    }

    public String getIban() {
        return iban;
    }

    public String getBic() {
        return bic;
    }

    public void setNomBanque(String nomBanque) {
        if (nomBanque.matches("[A-Za-z]+")) {
            this.nomBanque = nomBanque;
        } else {
            System.out.println("Nom de la banque invalide");
        }
    }

    public void setIban(String iban) {
        if (iban.matches("[A-Z]{4}")) {
            this.iban = iban;
        } else {
            System.out.println("IBAN invalide");
        }
    }

    public void setBic(String bic) {
        if (bic.matches("[A-Z]{4}")) {
            this.bic = bic;
        } else {
            System.out.println("BIC invalide");
        }
    }

    public boolean isvalid() {
        return getNomBanque() != null && getIban() != null && getBic() != null &&
               getIban().matches("[A-Z]{4}") &&
               getBic().matches("[A-Z]{4}");
    }

    public void effectuerPaiement(double montant) {
        if (montant > 0 && isvalid()) {
            System.out.println("Virement de " + montant + " effectué avec succès.");
        }   else if(montant<=0){
            System.out.println("Invalid amount");
        }
    }
}
