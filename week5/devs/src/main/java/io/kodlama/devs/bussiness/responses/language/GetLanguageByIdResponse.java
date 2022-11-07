package io.kodlama.devs.bussiness.responses.language;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetLanguageByIdResponse {
    private int id;
    private String name;
}
