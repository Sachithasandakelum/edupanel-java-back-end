package lk.ijse.dep11.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = LecturerImageConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
public @interface LecturerImage {

    long maxFileSize() default 4*500*1024;
    String message() default "Invalid image file or file size exceeds the maximum file size of {maximumFileSize} kb";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
