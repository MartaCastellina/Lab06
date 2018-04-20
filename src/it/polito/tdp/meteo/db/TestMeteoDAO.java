package it.polito.tdp.meteo.db;

import java.util.*;

import it.polito.tdp.meteo.bean.Citta;
import it.polito.tdp.meteo.bean.Rilevamento;

public class TestMeteoDAO {

	public static void main(String[] args) {

		MeteoDAO dao = new MeteoDAO();
		//TEST sull'umidita media
		Map<String,Double>umidita=new HashMap<String,Double>();
		umidita=dao.getAvgUmiditaMese(1);
		System.out.println(umidita);
		
		//TEST su rilevamenti
//		List <Rilevamento> rilevamenti=dao.getAllRilevamentiLocalitaMese(1, "Genova");
//		for (Rilevamento r:rilevamenti) {
//			System.out.println(r);
//		}
		
		List <String> nomi=dao.getCitta();
		for(String c:nomi)
			System.out.println(c);

//		List<Rilevamento> list = dao.getAllRilevamenti();
//
//		// STAMPA: localita, giorno, mese, anno, umidita (%)
//		for (Rilevamento r : list) {
//			System.out.format("%-10s %2td/%2$2tm/%2$4tY %3d%%\n", r.getLocalita(), r.getData(), r.getUmidita());
//		}
		
//		System.out.println(dao.getAllRilevamentiLocalitaMese(1, "Genova"));
//		System.out.println(dao.getAvgRilevamentiLocalitaMese(1, "Genova"));
//		
//		System.out.println(dao.getAllRilevamentiLocalitaMese(5, "Milano"));
//		System.out.println(dao.getAvgRilevamentiLocalitaMese(5, "Milano"));
//		
//		System.out.println(dao.getAllRilevamentiLocalitaMese(5, "Torino"));
//		System.out.println(dao.getAvgRilevamentiLocalitaMese(5, "Torino"));
		
	}

}
