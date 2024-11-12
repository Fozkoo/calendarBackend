package com.example.calendarbackend.Repository;

import com.example.calendarbackend.Models.Block;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlockRepository extends JpaRepository<Block, Integer> {

    @Query(value = "SELECT " +
            "m.mes AS month_name, " + // Nombre del mes
            "d.dia AS day_value, " + // Valor del día
            "n.numero AS number_value, " + // Valor del número
            "y.anio AS year_value, " + // Valor del año
            "e.title AS event_title, " + // Título del evento
            "e.time AS event_datetime, " + // Fecha y hora del evento
            "a.url AS attachment_url " + // URL del adjunto
            "FROM " +
            "block b " +
            "JOIN month m ON b.month_idmonth = m.idmonth " +
            "JOIN year y ON b.year_idyear = y.idyear " +
            "JOIN day d ON b.day_idday = d.idday " +
            "JOIN number n ON b.number_idnumber = n.idnumber " +
            "LEFT JOIN block_has_event bhe ON b.idblock = bhe.block_idblock " +
            "LEFT JOIN event e ON bhe.event_idevent = e.idevent " +
            "LEFT JOIN attachments_has_event ahe ON e.idevent = ahe.event_idevent " +
            "LEFT JOIN attachments a ON ahe.attachments_idattachments = a.idattachments " +
            "WHERE y.idyear = 1 " + // Filtrar por el año y el mes de enero
            "ORDER BY b.idblock ASC, e.idevent ASC, a.idattachments ASC",
            nativeQuery = true)
    List<Object[]> findEventsByYear();



    @Query(value = "SELECT " +
            "m.mes AS month_name, " + // Nombre del mes
            "d.dia AS day_value, " + // Valor del día
            "n.numero AS number_value, " + // Valor del número
            "y.anio AS year_value, " + // Valor del año
            "e.title AS event_title, " + // Título del evento
            "e.time AS event_datetime, " + // Fecha y hora del evento
            "a.url AS attachment_url " + // URL del adjunto
            "FROM " +
            "block b " +
            "JOIN month m ON b.month_idmonth = m.idmonth " +
            "JOIN year y ON b.year_idyear = y.idyear " +
            "JOIN day d ON b.day_idday = d.idday " +
            "JOIN number n ON b.number_idnumber = n.idnumber " +
            "LEFT JOIN block_has_event bhe ON b.idblock = bhe.block_idblock " +
            "LEFT JOIN event e ON bhe.event_idevent = e.idevent " +
            "LEFT JOIN attachments_has_event ahe ON e.idevent = ahe.event_idevent " +
            "LEFT JOIN attachments a ON ahe.attachments_idattachments = a.idattachments " +
            "WHERE m.idmonth = :idmonth " + // Filtrar por el año y el mes de enero
            "ORDER BY b.idblock ASC, e.idevent ASC, a.idattachments ASC",
            nativeQuery = true)
    List<Object[]> getAllBlocksByMonthId(@Param("idmonth") Integer idmonth);


}
