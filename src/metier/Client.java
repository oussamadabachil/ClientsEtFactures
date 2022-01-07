package metier;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Client {
    private String nom;
    private List < Facture > factures = new ArrayList < > ();
    private static List < Client > clients = new ArrayList < > ();

    /** 
     * Crée un client.
     * @param nom le nom du client. 
     */

    public Client(String nom) {

        this.nom = nom;
        clients.add(this);

    }

    /**
     * Retourne le nom du client.
     * @return le nom du client.
     */

    public String getNom() {
        return nom;
    }

    /**
     * Modifie le nom du client.
     * @param nom le nom du client.
     */

    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Créé une facture.
     * @param montant Le montant de la facture.
     * @return la facture créée.
     */

    public Facture createFacture(int montant, boolean reglee) {
        if (montant <= 0) {
            System.out.println("Le montant d'une facture ne peut pas être négatif.");
        }

        return createFacture(montant, false);
    }

    /**
     * Retourne une copie de la liste des factures du client. 
     * @return une copie de la liste des factures du client.
     */

    public List < Facture > getFactures() {
        List < Facture > facturesReglees = new ArrayList < > ();

        for (Facture facture: factures)
            if (facture.estReglee())
                facturesReglees.add(facture);



        return facturesReglees;
    }

    /**
     * Retourne la somme des montants des factures.
     * @return la somme des montants des factures.
     */

    public int sommeMontants() {
        int montant = 0;

        for (Facture facture: factures)
            montant += facture.getMontant();
        return montant;
    }

    /**
     * Créé une facture en précisant si elle est reglée.
     * @param montant Le montant de la facture.
     * @param reglée Vrai si la facture est reglée.
     * @return la facture créée.
     */


    /**
     * Retourne la liste des factures reglées. 
     * @return la liste des factures reglées.
     */


    /**
     * Retourne tous les clients créés.
     * @return une copie de la liste de tous les clients.
     */

    /**
     * Supprime le client.
     */

    public void delete() {
        clients.remove(this);
    }
}



/*public static List<Client> tous()
	{

		List<Client> clients_list = new ArrayList<Client>();
		for (int i = 0; i < clients.size(); i++)
			clients_list.add(clients.get(i));
		return clients_list;
	}
	*/