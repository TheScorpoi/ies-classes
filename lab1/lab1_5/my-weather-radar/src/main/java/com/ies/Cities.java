package com.ies;

import java.util.HashMap;
import java.util.Map;

public class Cities {

    private Map<String, Integer> citiesCodesMap = new HashMap<>();
    
    public Cities() {
        citiesCodesMap.put("Aveiro", 1010500);
        citiesCodesMap.put("Beja", 1020500);
        citiesCodesMap.put("Braga", 1030300);
        citiesCodesMap.put("Bragança", 1040200);
        citiesCodesMap.put("Castelo Branco", 1050200);
        citiesCodesMap.put("Coimbra", 1060300);
        citiesCodesMap.put("Évora", 1070500);
        citiesCodesMap.put("Guarda", 1090700);
        citiesCodesMap.put("Leiria", 1100900);
        citiesCodesMap.put("Lisboa", 1110600);
        citiesCodesMap.put("Portalegre", 1121400);
        citiesCodesMap.put("Porto", 1131200);
        citiesCodesMap.put("Santarém", 1141600);
        citiesCodesMap.put("Setúbal", 1151200);
        citiesCodesMap.put("Viana do Castelo", 1160900);
        citiesCodesMap.put("Vila Real", 1171400);
        citiesCodesMap.put("Viseu", 1182300);
        citiesCodesMap.put("Funchal", 2310300);
        citiesCodesMap.put("Porto Santo", 2320100);
        citiesCodesMap.put("Vila do Porto", 3410100);
        citiesCodesMap.put("Ponta Delgada", 3420300);
        citiesCodesMap.put("Angra do Heroísmo", 3430100);
        citiesCodesMap.put("Santa Cruz da Graciosa", 3440100);
        citiesCodesMap.put("Velas", 3450200);
        citiesCodesMap.put("Madalena", 3460200);
        citiesCodesMap.put("Horta", 3470100);
        citiesCodesMap.put("Santa Cruz das Flores", 3480200);
        citiesCodesMap.put("Vila do Corvo", 3490100);
    }

    public Integer getCityCode(String city) {
        if (citiesCodesMap.containsKey(city)) {
            return citiesCodesMap.get(city);
        } else {
            return 0;
        }
    }


}
