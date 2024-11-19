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

/*

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


 */

        @Query(value = "SELECT \n" +
                "    b.idblock AS blockId, \n" +
                "    m.mes AS monthName, \n" +
                "    d.dia AS dayValue, \n" +
                "    n.numero AS numberValue, \n" +
                "    y.anio AS yearValue, \n" +
                "    IFNULL(\n" +
                "        GROUP_CONCAT(\n" +
                "            JSON_OBJECT(\n" +
                "                'idUserEvent', e.idevent, \n" +
                "                'eventTitle', e.title, \n" +
                "                'eventDatetime', e.time, \n" +
                "                'notifications', COALESCE((\n" +
                "                    SELECT GROUP_CONCAT(\n" +
                "                        CONCAT(\n" +
                "                            '{\"idNotification\": ', n.idnotification, \n" +
                "                            ', \"type\": \"', n.type, '\"}'\n" +
                "                        )\n" +
                "                    )\n" +
                "                    FROM event_has_notification eh \n" +
                "                    INNER JOIN notification n ON eh.notification_idnotification = n.idnotification \n" +
                "                    WHERE eh.event_idevent = e.idevent\n" +
                "                ), '[]'), \n" +
                "                'attachmentUrl', COALESCE((\n" +
                "                    SELECT a.url \n" +
                "                    FROM attachments a \n" +
                "                    INNER JOIN attachments_has_event ae ON a.idattachments = ae.attachments_idattachments \n" +
                "                    WHERE ae.event_idevent = e.idevent \n" +
                "                    LIMIT 1\n" +
                "                ), NULL)\n" +
                "            )\n" +
                "        ), 'No Events') AS events\n" +
                "FROM \n" +
                "    block b \n" +
                "INNER JOIN day d ON b.day_idday = d.idday \n" +
                "INNER JOIN month m ON b.month_idmonth = m.idmonth \n" +
                "INNER JOIN number n ON b.number_idnumber = n.idnumber \n" +
                "INNER JOIN year y ON b.year_idyear = y.idyear \n" +
                "LEFT JOIN block_has_event bhe ON b.idblock = bhe.block_idblock \n" +
                "LEFT JOIN event e ON bhe.event_idevent = e.idevent \n" +
                "WHERE \n" +
                "    m.idmonth = :idMonth AND \n" +
                "    y.idyear = :idYear \n" +
                "GROUP BY \n" +
                "    b.idblock, m.mes, d.dia, n.numero, y.anio",
                nativeQuery = true)
        List<Object[]> findBlocksByMonthAndYear(@Param("idMonth") Integer idMonth, @Param("idYear") Integer idYear);
    }