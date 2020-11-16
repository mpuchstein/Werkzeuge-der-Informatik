package de.unitrier.st;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class HTTPCall {

    public String send(String url) {
        HttpResponse<JsonNode> jsonResponse = null;
        try {
            jsonResponse
                    = Unirest.get(url)
                    .header("accept", "application/json").queryString("apiKey", "123")
                    .asJson();
        } catch (UnirestException e) {
            e.printStackTrace();
        }

        return jsonResponse.getBody().toString();
    }
}
