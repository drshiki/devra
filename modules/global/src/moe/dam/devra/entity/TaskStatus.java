package moe.dam.devra.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum TaskStatus implements EnumClass<Integer> {

    CREATED_JIRA(10),
    IMPLEMENTED(20),
    SELF_TESTED(30),
    FIXED(40),
    TEST_SUCCESS(50),
    TEST_FAIL(60),
    PR_ED(70);

    private Integer id;

    TaskStatus(Integer value) {
        this.id = value;
    }

    public Integer getId() {
        return id;
    }

    @Nullable
    public static TaskStatus fromId(Integer id) {
        for (TaskStatus at : TaskStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}