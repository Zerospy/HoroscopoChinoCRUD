package com.desafiolatam.DAO;

public class horoscopoDAO {

	public String horoscopo (int anio) {
	
		int resto = anio % 12;
		String horoscopo = "";
		
	     switch (resto) {
         case 0: horoscopo = "Mono"; break;
         case 1: horoscopo = "Gallo"; break;
         case 2: horoscopo = "Perro"; break;
         case 3: horoscopo = "Cerdo"; break;
         case 4: horoscopo = "Rata"; break;
         case 5: horoscopo = "Buey"; break;
         case 6: horoscopo = "Tigre"; break;
         case 7: horoscopo = "Conejo"; break;
         case 8: horoscopo = "Dragon"; break;
         case 9: horoscopo = "Serpiente"; break;
         case 10: horoscopo = "Caballo"; break;
         case 11: horoscopo = "Cabra"; break;
     }
			System.out.println(horoscopo);
		return horoscopo;
	}
	
	
}
