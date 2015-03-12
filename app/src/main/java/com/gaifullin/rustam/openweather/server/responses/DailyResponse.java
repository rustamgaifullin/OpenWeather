package com.gaifullin.rustam.openweather.server.responses;

import com.gaifullin.rustam.openweather.server.entity.City;
import com.gaifullin.rustam.openweather.server.entity.Item;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Represents a daily response
 */
public final class DailyResponse extends BaseResponse {
  private static final long serialVersionUID = -3652426689846372212L;

  private City city;

  @SerializedName("list")
  private List<Item> itemList;

  public City getCity() {
    return city;
  }

  public List<Item> getItemList() {
    return itemList;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("ForecastResponse{");
    sb.append("city=").append(city);
    sb.append(", itemList=").append(itemList);
    sb.append('}');
    return sb.toString();
  }
}
