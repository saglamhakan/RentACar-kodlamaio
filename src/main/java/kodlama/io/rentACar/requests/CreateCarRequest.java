package kodlama.io.rentACar.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCarRequest {

    private int modelId;

    private int carId;

    private String plate;

    private double dailyPrice;

    private int modelYear;

    private int state;


}
