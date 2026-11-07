package com.fredy.spring.actividad1.contrllers;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/status")
public class StatusController {

    // Endpoint c: Respuesta con fecha/hora y código simple
    @GetMapping("/servidor")
    public Map<String, Object> estadoServidor() {
        Map<String, Object> status = new HashMap<>();
        status.put("servidor", "Online");
        status.put("timestamp", LocalDateTime.now().toString());
        status.put("codigoHttp", 200);
        return status;
    }
}