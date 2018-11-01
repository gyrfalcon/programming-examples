package net.justinshepard.treevalidator.model;

/**
 * Created by justinshepard on 2/14/17.
 */
public class Department {
    public final Integer id;
    public final Integer parentId;
    public final Integer code;
    public final String name;
    public final boolean used;

    public Department(Integer id, Integer parentId, Integer code, String name, boolean used) {
        this.id = id;
        this.parentId = parentId;
        this.code = code;
        this.name = name;
        this.used = used;
    }
}
