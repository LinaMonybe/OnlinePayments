public class CarteDeCredit implements Payable {
    String numeroCarte;
    String nomTitulaire;
    String dateExpiration;
    String codeCVC;

    public CarteDeCredit(String carte,String nom,String date,String code){
        setNumeroCarte(carte);
        setNomTitulaire(nom);
        setDateExpriration(date);
        setCodeCVC(code);
    }

    public String getNumeroCarte() {
        return this.numeroCarte;
    }

    public String getNomTitulaire() {
        return this.nomTitulaire;
    }

    public String getDateExpiration() {
        return this.dateExpiration;
    }

    public String getCodeCVC() {
        return this.codeCVC;
    }

    public void setNumeroCarte(String x) {
        if (x.matches("[0-9]+")) {
            this.numeroCarte = x;
        }
        else{
        System.out.println("Invalid card number");
        }
    }

    public void setNomTitulaire(String x) {
        if (x.matches("[A-Za-z]+")) {
            this.nomTitulaire = x; 
        }
        else{
        System.out.println("Invalid name");
        }
       
    }

    public void setDateExpriration(String d) {
        if (d.matches("(0[1-9]|1[0-2])/(2[5-9]|[3-9][0-9])")) {
            this.dateExpiration = d;
        }
        else{
        System.out.println("Invalid date");
        }
    }

    public void setCodeCVC(String x) {
        if (x.matches("[0-9]{3}")) {
            this.codeCVC = x;
        }else{
        System.out.println("Invalid code");}
    }

    private boolean isvalid() {
        return getNumeroCarte() != null && getNumeroCarte().matches("[0-9]+") &&
               getNomTitulaire() != null && getNomTitulaire().matches("[A-Za-z]+") &&
               getDateExpiration() != null && getDateExpiration().matches("(0[1-9]|1[0-2])/(2[5-9]|[3-9][0-9])") &&
               getCodeCVC() != null && getCodeCVC().matches("[0-9]{3}");
    }

    
    @Override
    
    public void effectuerPaiement(double montant) {
        if (montant > 0 && isvalid()) {
            System.out.println("Paiement de " + montant + " $ effectue avec succes via carte de credit");
        } 
      
    }
}
