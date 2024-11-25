import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
       
        System.out.println("Sélectionnez le mode de paiement :\n 1. Carte de Crédit\n2. PayPal\n3. Virement Bancaire\nChoix : ");
                        Scanner scan=new Scanner(System.in);
                        int choice = scan.nextInt();
                        scan.nextLine();
                        if(choice==1){
                          System.out.println("Entrez le montant a payer");
                          String montant = scan.nextLine();
                          System.out.println("Entrez le numero de la carte de credit");
                          String carte=scan.nextLine();
                          System.out.println("Entrez le nom du titulaire");
                          String titulaire=scan.nextLine();
                          System.out.println("Entrez la date d'expiration (MM/AA) :");
                          String date=scan.nextLine();
                          System.out.println("Entrez le code CVC :"); 
                          String cvc=scan.nextLine(); 

                          CarteDeCredit pay=new CarteDeCredit(carte, titulaire, date, cvc);
                          pay.effectuerPaiement(Double.parseDouble(montant));
                        }
                        else if(choice==2){
                            System.out.println("Entrez le montant a payer");
                            String montant = scan.nextLine();
                            System.out.println("Entrez lemail : ");
                            String email = scan.nextLine();
                            System.out.println("Entrez le mot de passe : ");
                            String pass=scan.nextLine();
                            Paypal pay =new Paypal(email, pass);
                            pay.effectuerPaiement(Double.parseDouble(montant));
                        }
                        else if(choice==3){
                            System.out.println("Entrez le montant a payer :");
                            String montant = scan.nextLine();
                            System.out.println("Entrez le nom de Banque :");
                            String banque=scan.nextLine();
                            System.out.println("Entrez le IBAN:");
                            String iban=scan.nextLine();
                            System.out.println("Entrez le BIC:");
                            String bic=scan.nextLine();
                            VirementBancaire pay=new VirementBancaire(banque, iban,bic);
                            pay.effectuerPaiement(Double.parseDouble(montant));
                        }
                        else{
                            System.out.println("Choix non valide");
                        }




    }
}
