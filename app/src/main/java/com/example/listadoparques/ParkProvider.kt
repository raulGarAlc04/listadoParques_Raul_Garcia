package com.example.listadoparques

class ParkProvider {
    companion object {
        val parkList = listOf<Park>(
            Park(
                nombre = "Parque del Retiro",
                descripcion = "Jardín Historio.\nParque situado en Madrid, España\n",
                photo = "https://patrimonioypaisaje.madrid.es/FWProjects/monumenta/Edificios/90002/03.05-img%201.jpg"
            ),

            Park(
                nombre = "Central Park",
                descripcion = "Parque urbano público situado en el distrito metropolitano de Manhattan.\nParque situado en Nueva York, Estados Unidos\n",
                photo = "https://static.anuevayork.com/wp-content/uploads/2020/06/13180423/Que-ver-en-Central-Park-Rutas-a-pie-y-en-bicicleta.jpg"
            ),

            Park(
                nombre = "Parque Alcántara Romero",
                descripcion = "Conocido popularmente como El Paseo, es uno de los jardines públicos más longevos de Andalucía.\nParque situado en Cabra, España\n",
                photo = "https://backsubbetica.novacreative.es/images/items/Uj7Y3wG5RHEQDyoX5xbEk049JHSmwdnBqRgEoEBP.jpg"
            ),

            Park(
                nombre = "Jardin nacional de Atenas",
                descripcion = "Es un parque publico de 15,5 hectáreas.\nParque situado en Atenas, Grecia\n",
                photo = "https://www.atenas.net/f/grecia/atenas/guia/jardin-nacional.jpg"
            ),

            Park(
                nombre = "Arboreto di Arco",
                descripcion = "Es un arboreto y jardín botánico de 1 hectarea de extensión.\nParque situado en Arco, Italia\n",
                photo = "https://www.italia.it/content/dam/tdh/es/interests/trentino/arboreto-di-arco-trentino/media/20210322143333-prov-trento-arboreto-di-arco-foto-costantino-bonomi-1-1.jpg"
            )
        )
    }
}