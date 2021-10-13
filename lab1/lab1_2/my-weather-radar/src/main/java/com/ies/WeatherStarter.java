package com.ies;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.ListIterator;
import java.util.logging.Logger;

/**
 * demonstrates the use of the IPMA API for weather forecast
 */
public class WeatherStarter {

    private static final int CITY_ID_AVEIRO = 1010500;
    private static int CITY_ID;
    /*
     * loggers provide a better alternative to System.out.println
     * https://rules.sonarsource.com/java/tag/bad-practice/RSPEC-106
     */
    private static final Logger logger = Logger.getLogger(WeatherStarter.class.getName());

    public static void main(String[] args) {

        Cities city = new Cities();

        if (args != null) {
            Integer cityID = city.getCityCode(args[0]);
            if (cityID != 0) {
                CITY_ID = cityID;
            } else {
                logger.info("Cidade não encontrada");
                System.exit(1);
            }
        }

        /*
         * get a retrofit instance, loaded with the GSon lib to convert JSON into objects
         */
        Retrofit retrofit = new Retrofit.Builder().baseUrl("http://api.ipma.pt/open-data/")
                .addConverterFactory(GsonConverterFactory.create()).build();

        IpmaService service = retrofit.create(IpmaService.class);
        Call<IpmaCityForecast> callSync = service.getForecastForACity(CITY_ID);

        try {
            Response<IpmaCityForecast> apiResponse = callSync.execute();
            IpmaCityForecast forecast = apiResponse.body();

            if (forecast != null) {

                ListIterator<CityForecast> list = forecast.getData().listIterator();
                CityForecast cityForecast = list.next();

                logger.info("---- Forecast for " + cityForecast.getForecastDate() + " ----\nMax temp: "
                        + cityForecast.getTMax() + "\nMin temp: " + cityForecast.getTMin() + "\nPrecipitação prob: "
                        + cityForecast.getPrecipitaProb() + "\nDireção do Vento: " + cityForecast.getPredWindDir()
                        + "\nVelocidade do Vento: " + cityForecast.getClassWindSpeed() + "\n");

            } else {
                logger.info("No results!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}