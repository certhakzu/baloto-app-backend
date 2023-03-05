package co.com.derivative.model.baloto;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Baloto {
    private Integer balota1;
    private Integer balota2;
    private Integer balota3;
    private Integer balota4;
    private Integer balota5;
    private Integer superBalota;
}
