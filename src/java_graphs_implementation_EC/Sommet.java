package java_graphs_implementation_EC;

import java.util.ArrayList;

public class Sommet {
	private String mNom;
	private ArrayList<Sommet> mSuivants = new ArrayList<Sommet>();
	
	
	public Sommet(String nom, ArrayList<Sommet> suivants){
		this.mNom = nom;	
		this.mSuivants = suivants;
	}
	
	public Sommet(String nom, Sommet...sommets){
		this.mNom = nom;	
		for(int i=0; i<sommets.length; i++) {
			this.mSuivants.add(sommets[i]);
		}

	}
	
	public String getNom() {
		return this.mNom;
	}
	
	public void setNom(String nom){
		this.mNom = nom;
	}
	
	public ArrayList<Sommet> getSuivants(){
		return this.mSuivants;
	}
	
	public void setSuivants(ArrayList<Sommet> suivants){
		this.mSuivants = suivants;
	}
	
	
	
	public String toString(){
		String res = "Le nom est " + getNom();
		ArrayList<Sommet> suivants = getSuivants();
		for(int i=0; i<suivants.size(); ++i)
		{
			res = res + "\n - " +suivants.get(i).getNom();
		}
		return res;
	}
}
