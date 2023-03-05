package co.com.derivative.model.sorteo;
import co.com.derivative.model.baloto.Baloto;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Sorteo {
    private Baloto baloto;
    private Date fecha;
    private Double acumulado;
    private String tipo;
}
