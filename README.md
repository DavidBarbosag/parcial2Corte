# Parcial Segundo corte

## Api Access
| Endpoint                     | Metodo | Descripcion                                       |
|-----------------------------|--------|---------------------------------------------------|
| `/weather/consult`         | POST   | consulta en la API requerida  |


### Ejemplo de retorno

```
{"location":{"name":"Bogota","region":"Cundinamarca","country":"Colombia",
"lat":4.6,"lon":-74.083,"tz_id":"America/Bogota","localtime_epoch":1753201362,"
localtime":"2025-07-22 11:22"},"current":{"last_updated_epoch":1753200900,"last_updated":"2025-07-22 11:15",
"temp_c":16.4,"temp_f":61.5,"is_day":1,"condition":{"text":"Partly cloudy","icon":"//cdn.weatherapi.com/weather/64x64/day/116.png","code":1003},"wind_mph":2.9,"wind_kph":4.7,"wind_degree":133,"wind_dir":"SE","pressure_mb":1028.0,"pressure_in":30.36,"precip_mm":0.38,"precip_in":0.01,"humidity":77,"cloud":50,"feelslike_c":16.4,"feelslike_f":61.5,"windchill_c":16.9,"windchill_f":62.4,"heatindex_c":16.9,"heatindex_f":62.4,"dewpoint_c":10.8,"dewpoint_f":51.4,"vis_km":10.0,"vis_miles":6.0,
"uv":2.7,"gust_mph":3.4,"gust_kph":5.4}}
```


## Diagrama de componentes
<img width="960" height="544" alt="image" src="https://github.com/user-attachments/assets/db5a0bf1-e3ef-4967-a490-dae2043639e8" />
