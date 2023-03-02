package kodlama.io.rentACar.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBrandRequest {

    @NotNull
    @NotBlank
    @Size(min = 3, max = 25)
    private String brandName;
}
