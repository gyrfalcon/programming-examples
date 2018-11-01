package net.justinshepard.treevalidator;

import net.justinshepard.treevalidator.model.Department;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by justinshepard on 2/14/17.
 */
public class TreeValidatorTest {
    @Test
    public void testValidation() {
        List<Department> list = new ArrayList<>();
        list.add(new Department(22, 15, 522, "Department 123", false));
        list.add(new Department(15, null, 2353, "Department 456", false));

        TreeValidator treeValidator = new TreeValidator();

        Assert.assertTrue(treeValidator.validate(list));
    }
}
