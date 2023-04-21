package Business;

import com.jgoodies.validation.ValidationResult;

public class Utility implements Validation{

    public static void Validate(Validation validator, Object entity){
        validator.validate(entity);
    }


    @Override
    public ValidationResult validate(Object o) {
        return null;
    }
}
