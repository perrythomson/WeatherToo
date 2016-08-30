package com.example.perrythomson.weathertoo;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.TextView;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);

        start();
    }

    private void start() {  //app& applets special method...like init for a class...this start is tied to the whole application..like the main would call
        // The connection URL
        String url = "https://spurious-balance-7335.justapis.io/weather.json";
        // Create a new RestTemplate instance
        RestTemplate restTemplate = new RestTemplate();  //spring tool to talk to rest services and want converters below
        // Add the JSON message converter
        restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        // Make the HTTP GET request, marshaling the response to the WeatherApp
        WeatherObject weatherObject = restTemplate.getForObject(url, WeatherObject.class);

        TextView tempText = (TextView) findViewById(R.id.tempTextView);
        tempText.setText(weatherObject.getTemp());

        TextView locationText = (TextView) findViewById(R.id.locationTextView);  //these are called/instantiated from the activity_main definitions
        locationText.setText(weatherObject.getTemp());

        TextView conditionText = (TextView) findViewById(R.id.conditionTextView);
        conditionText.setText(weatherObject.getTemp());

        WebView weatherImg = (WebView) findViewById(R.id.weatherWebView);
        weatherImg.loadUrl(weatherObject.getImage());



    }
}
