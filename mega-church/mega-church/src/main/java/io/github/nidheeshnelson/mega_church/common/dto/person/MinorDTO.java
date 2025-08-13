package io.github.nidheeshnelson.mega_church.common.dto.person;

import java.io.Serializable;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name="MinorDTO", description = "Personal details about a minor")
public class MinorDTO extends PersonDTO implements Serializable,Person {

}
