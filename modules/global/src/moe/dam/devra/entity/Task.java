package moe.dam.devra.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@Table(name = "DEVRA_TASK")
@Entity(name = "devra_Task")
public class Task extends StandardEntity {
    private static final long serialVersionUID = 7389170893668447304L;

    @Column(name = "NAME")
    private String name;

    @Lob
    @Column(name = "DESC_")
    private String desc;

    @Column(name = "JIRA_LINK")
    private String jiraLink;

    @Column(name = "JIRA_TASK_NUMBER")
    private String jiraTaskNumber;

    @Column(name = "TYPE_")
    private TaskType type;

    @Column(name = "STATUS")
    private TaskStatus status;

    @Column(name = "TESTER")
    private String tester;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getJiraLink() {
        return jiraLink;
    }

    public void setJiraLink(String jiraLink) {
        this.jiraLink = jiraLink;
    }

    public String getJiraTaskNumber() {
        return jiraTaskNumber;
    }

    public void setJiraTaskNumber(String jiraTaskNumber) {
        this.jiraTaskNumber = jiraTaskNumber;
    }

    public TaskType getType() {
        return type;
    }

    public void setType(TaskType type) {
        this.type = type;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public String getTester() {
        return tester;
    }

    public void setTester(String tester) {
        this.tester = tester;
    }
}