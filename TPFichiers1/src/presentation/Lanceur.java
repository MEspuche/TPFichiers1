package presentation;

import java.io.File;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String rep="C:/";
		File f = new File(rep);
		
		if (f.exists()){
			
			String contenu[] = f.list(); // tout le contenu du repertoire est dans le "contenu"
			
			for (int i=0; i<contenu.length; i++){
				File f2 = new File(rep,contenu[i]);
				if(f2.isDirectory())
				{
					System.out.println("Repertoire :" + contenu[i]);
				}
				else
				{
					System.out.println("Fichier :" + contenu[i] + " Taille : "+ f2.length()/1024);// pour passer de kg octet a octet
				}
			}
			
			
		}
		else{
			System.out.println(rep + " n'existe pas");
		}
	}

}
