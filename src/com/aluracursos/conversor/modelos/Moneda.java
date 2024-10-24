package com.aluracursos.conversor.modelos;

import java.util.List;
import java.util.Objects;

public record Moneda( String result
        , String time_last_update_utc
        , String base_code
        , TasasCambio conversion_rates

) {
}
