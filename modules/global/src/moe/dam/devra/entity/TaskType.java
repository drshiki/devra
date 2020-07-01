package moe.dam.devra.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum TaskType implements EnumClass<Integer> {

    BUG(10),
    REQUIREMENT(20);

    private Integer id;

    TaskType(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static TaskType fromId(Integer id) {
        for (TaskType at : TaskType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}