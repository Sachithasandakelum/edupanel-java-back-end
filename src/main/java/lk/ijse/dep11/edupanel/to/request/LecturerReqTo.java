package lk.ijse.dep11.edupanel.to.request;

import lk.ijse.dep11.edupanel.util.LecturerType;
import lk.ijse.dep11.validation.LecturerImage;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.groups.Default;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LecturerReqTo implements Serializable {
    @NotBlank(message = "Name can't be empty")
    @Pattern(regexp = "^[A-Za-z ]{2,}$",message = "Invalid name")
    private String name;

    @NotBlank(message = "Designation cannot be empty")
    @Length(min = 3,message = "Invalid designation")
    private String designation;

    @NotBlank(message = "Qualifications cannot be empty")
    @Length(min = 3,message = "Invalid qualifications")
    private String qualifications;


    @NotNull(message = "Type should be either full-time or visiting")
    private LecturerType type;

    @Null(groups = Create.class,message = "Display order should be empty")
    @NotNull(groups = Update.class,message = "Display order cannot be empty")
    @PositiveOrZero(groups = Update.class,message = "Invalid display order")
    private Integer displayOrder;


    @LecturerImage
    private MultipartFile picture;


    @Pattern(regexp = "^http(s)://.+$",message = "Invalid linkedin URL")
    private String linkedin;

    public interface Create extends Default {

    }

    public interface Update extends Default {

    }
}
