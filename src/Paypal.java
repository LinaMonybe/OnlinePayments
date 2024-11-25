public class Paypal implements Payable{
    String adressEmail;
    String motDePasse;

    public Paypal(String x,String y){
        setEmail(x);
        setPass(y);
    }

    public String getEmail(){
        return this.adressEmail;
    }

    public String getPass(){
        return this.motDePasse;
    }

    public void setEmail(String x){
        if(x.matches("[A-Za-z0-9._+%]+@[a-z0-9.-]+\\.[a-z]{2,3}"))
        this.adressEmail = x;
        else
        System.out.println("Invalid email");
    }

    public void setPass(String x){
        this.motDePasse=x;
    }

    public boolean isvalid(){
        return getEmail() != null && getPass() != null &&
        getEmail().matches("[A-Za-z0-9._+%]+@[a-z0-9.-]+\\.[a-z]{2,3}");
    }

    public void effectuerPaiement(double montant){
        if(montant>0 && isvalid())
        System.out.println("Paiement effectué avec succès de "+montant+" $ avec Paypal");
        else if(montant<=0){
            System.out.println("Invalid amount");
        }
        
    }
    
}
